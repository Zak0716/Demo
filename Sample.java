public class Sample
{

  public  void add()
  {
    int a=5, b=10, c;
    c = a + b;
    System.out.println(c);
  }

   public  void sub()
  {
    int a=5, b=10, c;
    c = a - b;
    System.out.println(c);
  }


   public  void mul()
  {
    int a=5, b=10, c;
    c = a * b;
    System.out.println(c);
  }

   public  void div()
  {
    int a=5, b=10, c;
    c = a / b;
    System.out.println(c);
  }

public static void main(String[] args)
{ 
   Sample s = new Sample();
    
   s. add();

   s.sub();

  s.mul();

  s.div();
}
  
}
