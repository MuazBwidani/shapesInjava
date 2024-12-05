
package shapes;

public class Trapezoid extends Quad{
    
      boolean Test_Trapezoid()
    {
        printLines();
      if(line1 != line3 && line2 != line4 && line3 != line2 & line1 != line4 )
      {
        printLines();
        return true;  
        }
      else
         if(line1==line3 || line2==line4)
          { 
              return true; 
          }
          else
             { 
              System.out.println("The point you entered don't true");
               return false;
               }
    }
      
   double Area()
   {
       double area=((line1+line2)/2)*hiegh;
       return area;
   }
    
}