public class Calculator {
  // this method calculates the time variable
  public static double findT(String v0, String v, String a, String deltax) {
    if (v0.length() > 0 && deltax.length() > 0 && v.length() > 0) 
    //if v0, delta x and v are given
    {
      // we convert the strings into doubles
      double x = Double.parseDouble(deltax); 
      double newV0 = Double.parseDouble(v0);
      double newV = Double.parseDouble(v);

      double result = (2*x)/(newV0 + newV);
      return result;
    }
    //if v0, delta x, and a are given
    if (v0.length() > 0 && deltax.length() > 0 && a.length() > 0) {
      double x = Double.parseDouble(deltax);
      double newV0 = Double.parseDouble(v0);
      double newA = Double.parseDouble(a);

      double result = (-newV0 + Math.sqrt(newV0*newV0 + 2*newA*x)) / newA;
      return result;
    }
      //if v0, v, and a are given
    if (v0.length() > 0 && v.length() > 0 && a.length() > 0) {
      double newV0 = Double.parseDouble(v0);
      double newA = Double.parseDouble(a);
      double newV = Double.parseDouble(v);

      double result = (newV - newV0) / newA;
      return result;
    }
    return Double.MAX_VALUE;
  }

  // this method calculates the acceleration variable
  public static double findA(String v0, String v, String deltax, String t) {
    if (v.length() > 0 && v0.length() > 0 && t.length() > 0){
      double newV = Double.parseDouble(v);
      double newV0 = Double.parseDouble(v0);
      double newt = Double.parseDouble(t);
      double result = (newV - newV0)/newt;
      return result;
    }
      //if delta x is given, v0 is given, and t is given
      if (deltax.length() > 0 && v0.length() > 0 && t.length() > 0){
      double newx = Double.parseDouble(deltax);
      double newV0 = Double.parseDouble(v0);
      double newt = Double.parseDouble(t);
      double result = ((2 * newx) - (2 * newV0 * newt))/(newt * newt);
      return result;
    }
      //if v, v0, and delta x are given
      if (deltax.length() > 0 && v0.length() > 0 && v.length() > 0){
      double newx = Double.parseDouble(deltax);
      double newV0 = Double.parseDouble(v0);
      double newV = Double.parseDouble(v);
      double result = ((newV * newV) - (newV0 * newV0)/(2 * newx));
      return result; 
    }
    return Double.MAX_VALUE;
  }

  // this method calculates the displacement variable
  public static double findDeltaX(String v0, String v, String a, String t) {
    // if v is given and v0 is given and a is given
    if (v.length() > 0 && v0.length() > 0 && a.length() > 0) {
      double newV = Double.parseDouble(v);
      double newV0 = Double.parseDouble(v0);
      double newA = Double.parseDouble(a);
      double result = (newV*newV - newV0*newV0) / (2*newA);
      return result;
    }
    // if v0 is given and a is given and t is given
    if (v0.length() > 0 && a.length() > 0 && t.length() > 0) {
      double newT = Double.parseDouble(t);
      double newV0 = Double.parseDouble(v0);
      double newA = Double.parseDouble(a);
      double result = (newV0 * newT) + (0.5*newA*newT*newT);
      return result;
    }
    // if v0 is given and v is given and t is given
    if (v0.length() > 0 && v.length() > 0 && t.length() > 0) {
      double newT = Double.parseDouble(t);
      double newV0 = Double.parseDouble(v0);
      double newV = Double.parseDouble(v);
      double result = 0.5*(newV+newV0)*newT;
      return result;
    }
    return Double.MAX_VALUE;
  }
  // this method calculates the initial velocity variable
  public static double findV0(String v, String a, String deltax, String t) {
    //if v is given, a is given, t is given
    if (v.length() > 0 && a.length() > 0 && t.length() > 0){
      double newV = Double.parseDouble(v);
      double newA = Double.parseDouble(a);
      double newT = Double.parseDouble(t);
      double result = (newV - (newA*newT));
      return result; 
    }
      //if delta x is given, a is given, and t is given
    else if (deltax.length() > 0 && a.length() > 0 && t.length() > 0){
      double newX = Double.parseDouble(deltax);
      double newA = Double.parseDouble(a);
      double newT = Double.parseDouble(t);
      double result = (newX - (0.5*newA*newT*newT))/newT;
      return result;
    }
      //if v, a, and delta x are given
    else if (deltax.length() > 0 && a.length() > 0 && v.length() > 0){
      double newX = Double.parseDouble(deltax);
      double newA = Double.parseDouble(a);
      double newV = Double.parseDouble(v);
      double result = (Math.sqrt((newV*newV)-2*newA*newX));
      return result;
    }
      //if v, t, and delta x are given
    else if (deltax.length() > 0 && t.length() > 0 && v.length() > 0){
      double newX = Double.parseDouble(deltax);
      double newT = Double.parseDouble(t);
      double newV = Double.parseDouble(v);
      double result = (((2*newX)/newT)-newV);
      return result;
    }
    return Double.MAX_VALUE;
  }
  // this method calculates the final velocity variable
  public static double findV(String v0, String a, String deltax, String t) {
    //if deltax, v0 and a are given
    if (deltax.length() > 0 && v0.length() > 0 && a.length() > 0){
      double newX = Double.parseDouble(deltax);
      double newV0 = Double.parseDouble(v0);
      double newA = Double.parseDouble(a);
      if (newA < 0 && newX < 0) {
        return -1*Math.sqrt(newV0*newV0 + 2*newA*newX);
      }
      return Math.sqrt(newV0*newV0 + 2*newA*newX);
    }
    // if v0, a, and t are given
    if (a.length() > 0 && v0.length() > 0 && t.length() > 0){
      double newA = Double.parseDouble(a);
      double newV0 = Double.parseDouble(v0);
      double newT = Double.parseDouble(t);
      double result = newV0 + (newA*newT);
      return result;
    }
    // if v0, deltax, and t are given
    if (deltax.length() > 0 && v0.length() > 0 && t.length() > 0){
      double newX = Double.parseDouble(deltax);
      double newV0 = Double.parseDouble(v0);
      double newT = Double.parseDouble(t);
      double result = (2*newX/newT) - newV0;
      return result;
    }
    return Double.MAX_VALUE;
  }
}
