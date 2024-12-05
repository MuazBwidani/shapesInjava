
package shapes;

public class Parallelogram  extends Quad{
    
      boolean Test_Parallelogram()
    {
        
      if(line1== line3 && line2==line4)
      {
          printLines();
       double x1=Math.pow(line1,2.0)+ Math.pow(line2,2.0)+Math.pow(line3,2.0)+ Math.pow(line4,2.0);
       
       if(x1==Math.pow(Hypotenuse, 2.0)+Math.pow(Hypotenuse1, 2.0)) 
       {
        return true;  
        }
      }
      else
      { 
        System.out.println("The point you entered don't true");
        return false;
      }
      return false;
    }
      
   double Area()
   {
       
       return line3*hiegh;
   }
}