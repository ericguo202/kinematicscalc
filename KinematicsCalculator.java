import java.util.Scanner;
public class KinematicsCalculator {
  Scanner scr = new Scanner(System.in);
  private String v0x, v0y, v, a, deltax, deltay, t, angle;

  // welcome message
  public void welcome() {
    System.out.println("Welcome to Kinematics Calculator.");
    choose();
  }
  
  // user chooses 1D vs 2D vs rot
  public void choose() {
    BeforeAPExam.genMessage();
    System.out.print("\nFor 1D kinematics, type \"1D\". For 2D kinematics, type \"2D\", For rotational kinematics, type \"rot\": ");
    String input = scr.nextLine();
    if (input.equalsIgnoreCase("1D")) {
      oneD();
    }
    else if (input.equalsIgnoreCase("2D")) {
      twoD();
    }
    else if (input.equalsIgnoreCase("rot")) {
      rot();
    }
    else {
      System.out.print("Invalid choice.");
      BeforeAPExam.insult(0);
      System.out.println("\nPlease try again.");
      choose();
    }
  }
  
  // 1D kinematics constructor
  public void oneD() {
    System.out.println("\nThe next part will ask you for some variables. If they are not given, just press enter.");
    System.out.println("Make sure that you assign each variable to be a decimal, otherwise the calculator will crash");
    // this assigns every variable to a String
    System.out.print("What is v0? v0 = ");
    v0x = scr.nextLine();
    System.out.print("What is v? v = ");
    v = scr.nextLine();
    System.out.print("What is a? a = ");
    a = scr.nextLine();
    System.out.print("What is deltax? deltax = ");
    deltax = scr.nextLine();
    System.out.print("What is t? t = ");
    t = scr.nextLine();
    calculateWhat1D();
  }
  
  // 2D kinematics constructor
  public void twoD() {
    System.out.println("\nThe next part will ask you for some variables. If they are not given, just press enter. ");
    System.out.println("Make sure that you assign each variable to be a decimal, otherwise the calculator will crash");
    // this assigns every variable to a String
    System.out.print("v0 = ");
    String v0 = scr.nextLine();
    System.out.print("What is the launch angle (in degrees)? θ = ");
    angle = scr.nextLine();
    // In 2D kinematics, the v0 is broken down into components v0x and v0y based on the launch angle.
    if (v0.length() > 0 && angle.length() > 0) {
      // First convert both strings into doubles.
      double v0Calc = Double.parseDouble(v0);
      double angleCalc = Double.parseDouble(angle) * ((Math.PI) / 180);
      // then apply trigonometry
      v0x = "" + v0Calc * Math.cos(angleCalc);
      v0y = "" + v0Calc * Math.sin(angleCalc);
    }
    System.out.print("What is the final velocity in the Y-DIRECTION? Vy = ");
    v = scr.nextLine();
    System.out.print("ay = ");
    a = scr.nextLine();
    System.out.print("deltaX = ");
    deltax = scr.nextLine();
    System.out.print("deltaY = ");
    deltay = scr.nextLine();
    System.out.print("t = ");
    t = scr.nextLine();
    calculateWhat2D();
  }

  // rotational kinematics constructor
  public void rot() {
    System.out.println("\nThe next part will ask you for some variables. If they are not given, just press enter. ");
    System.out.println("Make sure that you assign each variable to be a decimal, otherwise the calculator will crash");
    // this assigns every variable to a String
    System.out.print("ω0 = ");
    v0x = scr.nextLine();
    System.out.print("ω = ");
    v = scr.nextLine();
    System.out.print("α = ");
    a = scr.nextLine();
    System.out.print("deltaθ = ");
    deltax = scr.nextLine();
    System.out.print("t = ");
    t = scr.nextLine();
    calculateWhatRot();
  }

  // 1d methods
  public void calculateWhat1D() {
    System.out.print("\nWhat do you want to calculate? For time, type \"t\". For acceleration, type \"a\". For initial velocity, type \"v0\". For final velocity, type \"v\".  For displacement, type \"deltax\": ");
    
    String findThis = scr.nextLine();
    // calls the correct method based on user input
    if (findThis.equalsIgnoreCase("t")) {
      findT();
    }
    else if (findThis.equalsIgnoreCase("a")) {
      findA();
    }
    else if (findThis.equalsIgnoreCase("deltax")) {
      findDeltaX();
    }
    else if (findThis.equalsIgnoreCase("v0")) {
      findV0();
    }
    else if (findThis.equalsIgnoreCase("v")) {
      findV();
    }
    else {
      System.out.println("\nInvalid input.");
      BeforeAPExam.insult(0);
      calculateWhat1D();
    }
  }

  // 2d methods
  public void calculateWhat2D() {
    System.out.print("\nWhat do you want to calculate? For time, type \"t\". For acceleration, type \"a\". For initial velocity, type \"v0\". For final velocity, type \"v\".  For displacement, type \"deltax\". For height, type \"deltay\": ");
    String findThis = scr.nextLine();
    // calls the correct method based on user input
    if (findThis.equalsIgnoreCase("t")) {
      findT2D();
    }
    else if (findThis.equalsIgnoreCase("a")) {
      findA2D();
    }
    else if (findThis.equalsIgnoreCase("deltax")) {
      findDeltaX2D();
    }
    else if (findThis.equalsIgnoreCase("deltay")) {
      findDeltaY();
    }
    else if (findThis.equalsIgnoreCase("v0")) {
      findV02D();
    }
    else if (findThis.equalsIgnoreCase("v")) {
      findV2D();
    }
    else {
      System.out.println("\nInvalid input. Failure to read directions carefully in physics is a grievous mistake. Please try again.");
      calculateWhat1D();
    }
  }

  // rotational methods
  public void calculateWhatRot() {
    System.out.print("\nWhat do you want to calculate? For time, type \"t\". For α, type \"alpha\". For ω0, type \"omega0\". For ω, type \"omega\".  For deltaθ, type \"deltatheta\": ");
    
    String findThis = scr.nextLine();
  System.out.println("Make sure that you assign each variable to be a decimal, otherwise the calculator will crash");
    // calls the correct method based on user input
    if (findThis.equalsIgnoreCase("t")) {
      findT();
    }
    else if (findThis.equalsIgnoreCase("alpha")) {
      findAlpha();
    }
    else if (findThis.equalsIgnoreCase("deltatheta")) {
      findDeltaTheta();
    }
    else if (findThis.equalsIgnoreCase("omega0")) {
      findOmega0();
    }
    else if (findThis.equalsIgnoreCase("omega")) {
      findOmega();
    }
    else {
      System.out.println("\nInvalid input. Failure to read directions carefully in physics is a grievous mistake. Please try again.");
      calculateWhatRot();
    }
  }

  // find time
  public void findT() {
    double result = Calculator.findT(v0x, v, a, deltax); // calls the methods from the Calculator class

    if (result == Double.MAX_VALUE) {
      System.out.println("Not enough givens, if you can't read directions how will you pass an ap exam.");
      choose();
    }
    System.out.println("t = " + result + " s");
    choose();
  }
  public void findT2D() {
    double result = Calculator.findT(v0y, v, a, deltay);

    if (result == Double.MAX_VALUE) {
      if (deltax.length() > 0 && v0x.length() > 0){
        double newv0x = Double.parseDouble(v0x);
        double newdeltaX = Double.parseDouble(deltax);
        result = (newdeltaX/newv0x);
      }
      else {
        System.out.println("Not enough givens, if you can't read directions how will you pass an ap exam.");
        choose();
      }
    }
    System.out.println("t = " + result + " s");
    choose();
  }

  // find acceleration
  public void findA() {
    double result = Calculator.findA(v0x, v, deltax, t);

    if (result == Double.MAX_VALUE) {
      System.out.println("Not enough givens, if you can't read directions how will you pass an ap exam.");
      choose();
    }
    System.out.println("a = " + result + " m/s^2");
    choose(); 
  }
  public void findAlpha() {
    double result = Calculator.findA(v0x, v, deltax, t);

    if (result == Double.MAX_VALUE) {
      System.out.println("Not enough givens, if you can't read directions how will you pass an ap exam.");
      choose();
    }
    System.out.println("α = " + result + " rad/s^2");
    choose(); 
  }
  public void findA2D() {
    double result = Calculator.findA(v0y, v, deltay, t);

    if (result == Double.MAX_VALUE) {
      System.out.println("Not enough givens, if you can't read directions how will you pass an ap exam.");
      choose();
    }
    System.out.println("a (in the y-direction) = " + result + " m/s^2");
    choose(); 
  }

  // find displacement
  public void findDeltaX() {
    double result = Calculator.findDeltaX(v0x, v, a, t);

    if (result == Double.MAX_VALUE) {
      System.out.println("Not enough givens, if you can't read directions how will you pass an ap exam.");
      choose();
    }
    System.out.println("deltax = " + result + " m");
    choose(); 
  }
  public void findDeltaTheta() {
    double result = Calculator.findDeltaX(v0x, v, a, t);

    if (result == Double.MAX_VALUE) {
      System.out.println("Not enough givens, if you can't read directions how will you pass an ap exam.");
      choose();
    }
    System.out.println("deltaθ = " + result + " rad");
    choose(); 
  }
  // find deltaX for 2d
  public void findDeltaX2D() {
    double newt = Calculator.findT(v0y, v, a, deltay);
    if (newt == Double.MAX_VALUE){
      System.out.println("Not enough givens, if you can't read directions how will you pass an ap exam");
      choose();
    }
    if (v0x.length() > 0){
      double newv0x = Double.parseDouble(v0x);
      double result = (newv0x * newt);
      System.out.println("Your deltax is: " + result + "m");
    }
    else{
      System.out.println("WHERE IS THE V0X");
      choose();
    }
  }

  // calculates deltaY for 2d
  public void findDeltaY() {
    double result = Calculator.findDeltaX(v0y, v, a, t);

    if (result == Double.MAX_VALUE) {
      System.out.println("Not enough givens. Please try again.");
      choose();
    }
    System.out.println("deltay = " + result + " m");
    choose(); 
  }
  
  // calculates v0
  public void findV0() {
    double result = Calculator.findV0(v, a, deltax, t);

    if (result == Double.MAX_VALUE) {
      System.out.println("Not enough givens. Please try again.");
      choose();
    }
    System.out.println("v0 = " + result + "m/s");
    choose(); 
  }
  // calculates omega0 for rot kinematics
  public void findOmega0() {
    double result = Calculator.findV0(v, a, deltax, t);

    if (result == Double.MAX_VALUE) {
      System.out.println("Not enough givens. Please try again.");
      choose();
    }
    System.out.println("ω0 = " + result + " rad/s");
    choose(); 
  }
  // calculates v0 for 2d kinematics
  public void findV02D() {
    double newv0y = Calculator.findV0(v, a, deltay, t);
    if (newv0y == Double.MAX_VALUE) {
      System.out.println("Not enough givens, if you can't read directions how will you pass an ap exam.");
      choose();
    }
    System.out.println("v0y = " + newv0y);
    String v0ytoString = "" + newv0y; // converts newv0y to String for usage in the next few lines of code.
    double newT;
    if (t.length() == 0) {
      newT = Calculator.findT(v0ytoString, v, a, deltay);
      System.out.println("t = " + newT);
      if (newT == Double.MAX_VALUE) {
        System.out.println("Not enough givens, if you can't read directions how will you pass an ap exam.");
        choose();
      }
    }
    else {
      newT = Double.parseDouble(t);
    }
    double newv0x = Double.MAX_VALUE;
    if (deltax.length() > 0) {
      double newX = Double.parseDouble(deltax);
      newv0x = (newX / newT); // deltaX = v0x * t
      System.out.println("v0x = " + newv0x);
    }
    else {
      System.out.println("WHERE IS THE DELTAX??");
      choose();
    }
    double result = Math.sqrt((newv0x*newv0x + newv0y*newv0y));
    System.out.print("v0 = " + result + " m/s");
    double finalAngle = Math.toDegrees(Math.atan(newv0y / newv0x));
    System.out.println(" at an angle of " + finalAngle + " degrees to the horizontal");
  }
  // finds v or ω
  public void findV() {
    double result = Calculator.findV(v0x, a, deltax, t);

    if (result == Double.MAX_VALUE) {
      System.out.println("Not enough givens. Please try again.");
      choose();
    }
    System.out.println("v = " + result + "m/s");
    choose(); 
  }  
  public void findOmega() {
    double result = Calculator.findV(v0x, a, deltax, t);

    if (result == Double.MAX_VALUE) {
      System.out.println("Not enough givens. Please try again.");
      choose();
    }
    System.out.println("ω = " + result + " rad/s");
    choose(); 
  } 
  public void findV2D() {
    double newVy = Calculator.findV(v0y, a, deltay, t);
    if (newVy == Double.MAX_VALUE) {
      System.out.println("Not enough givens. Please try again.");
      choose();
    }
    System.out.println("Vy = " + newVy);
    if (v0x.length() > 0){
      double newv0x = Double.parseDouble(v0x);
      System.out.println("Vx = V0x = " + newv0x);
      double result = Math.sqrt((newv0x*newv0x + newVy*newVy));
      System.out.print("V = " + result + " m/s");
      double finalAngle = Math.toDegrees(Math.atan(newVy / newv0x));
      System.out.println(" at an angle of " + finalAngle + " degrees to the horizontal");
    }
    else{
      System.out.println("WHERE IS THE V0X");
      choose();
    }
  }
}
