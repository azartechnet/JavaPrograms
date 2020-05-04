public class MethodLocalInner
{
  private String x="MyOuterClass";
  void display()
  {
     final String z="local Variables";
     System.out.println(x);
     class Inner
     {
        public void print()
        {
            System.out.println("Outer x:"+x);
            System.out.println("Local variables z:"+z);
        }
     }
Inner obj=new Inner();
obj.print();
  }
public static void main(String as[])
{
   MethodLocalInner m=new MethodLocalInner();
   m.display();
}
}