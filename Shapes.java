 
package shapes;
import java.util.Scanner;
 
public class Shapes {

     
    public static void main(String[] args) {
         
        Scanner input=new Scanner(System.in);
        String shape;
       
        System.out.println("What shape do you want to calculate Area \n");
        System.out.println("Rectangle Or Square Or Trapezoid Or Parallelogram \n");
        shape=input.nextLine();
        
        if(shape.equals("Rectangle"))
        {
         Rectangle Re=new Rectangle();
         Re.Set_Point();
         Re.Set_Lines();
         if(Re.Test_Rectangle()==true)
         {  
          System.out.println("The area for this Rectangle is  :"+Re.Area());
         }
        }else
          if(shape.equals("Square"))
            {
            Square Re=new Square();
            Re.Set_Point();
            Re.Set_Lines();
            if(Re.Test_Square()==true)
            {
           System.out.println("The area for this Square is  :"+Re.Area());
            }
              
            }else
              if(shape.equals("Trapezoid"))
                {
                  Trapezoid Re=new Trapezoid();
                  Re.Set_Point();
                  Re.Set_Lines();
                  if(Re.Test_Trapezoid()==true)
                  {
                   System.out.println("The area for this Trapezoid is  :"+Re.Area());
                   }
                }else
                  if(shape.equals("Parallelogram"))
                    {
                      Parallelogram Re=new Parallelogram();
                      Re.Set_Point();
                      Re.Set_Lines();
                      if(Re.Test_Parallelogram()==true)
                        {
                         System.out.println("The area for this Parallelogram is  :"+Re.Area());
                        }
                     }
             
         }        
    }
   