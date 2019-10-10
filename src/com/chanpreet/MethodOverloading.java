public class Method_overloading {
public int abs(int a)
  {
      if(a<0)
          a=-a;
      System.out.print("ïnt argument   : ");
      return a ;
  }
  public float abs(float a)
  {
      if(a<0)
          a=-a;
      System.out.print("float argument : ");
      return a ;
  }
  public double abs(double a)
  {
      if (a<0)
          a=-a;
      System.out.print("double argument: ");
      return a ;
     }
     public static void main(String[] args) {
      int a = -10;
      float b = -15.77f;
      double c=-20.88789;
      long l=-1801;
      char ch ='a';
      Method_overloading obj =new Method_overloading();
          System.out.println(obj.abs(a));
          System.out.println(obj.abs(b));
          System.out.println(obj.abs(c));
          System.out.println(obj.abs(l));
          System.out.println(obj.abs(ch));
       }
}
