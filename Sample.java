public class Sample
{

  public  void add(int a, int b)
  {
   
    int c = a + b;
    System.out.println(c);
  }

   public  void sub(int a, intb)
  {
    
    int c = a - b;
    System.out.println(c);
  }


   public  void mul(int a, int b)
  {
   
    int c = a * b;
    System.out.println(c);
  }

   public  void div(int a, int b)
  {
   
    int c = a / b;
    System.out.println(c);
  }

public static void main(String[] args)
{ 
   Sample s = new Sample();
    
   s. add(10,20);

   s.sub(100,50);

  s.mul(10,5);

  s.div(100,25);
}
  
}
