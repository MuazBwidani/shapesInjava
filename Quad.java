
package shapes;

public class Quad extends Point{
    
   double line1;
   double line2;
   double line3;
   double line4;
   double Hypotenuse;
      double Hypotenuse1;
      double hiegh;
   Point Po1=new Point();
    Point Po2=new Point();
    Point Po3=new Point();
    Point Po4=new Point();
   void Set_Point()
    {
     
    System.out.println("Point 1");
    ReadPoint(Po1);
    System.out.println("Point 2");
    ReadPoint(Po2);
    System.out.println("Point 3");
    ReadPoint(Po3);
    System.out.println("Point 4");
    ReadPoint(Po4);
    
    Po1.PrintPoint();
    Po2.PrintPoint();
    Po3.PrintPoint();
    Po4.PrintPoint();
    
    } 
   double Set_Line(Point Po11,Point Po12)
    {
    
     double line,line5;
     double xpo=(double)Po11.x-(double)Po12.x;
     double ypo=(double)Po11.y-(double)Po12.y;
     line=Math.pow(xpo,2.0)+Math.pow(ypo,2.0);
     line5=Math.sqrt(line);
     return line5;
    
    }
   void Set_Lines()
   {
    
    line1=Set_Line(Po1,Po2);
    line2=Set_Line(Po2,Po3);
    line3=Set_Line(Po3,Po4);
    line4=Set_Line(Po4,Po1);
    Hypotenuse=Set_Line(Po1,Po3);
    Hypotenuse1=Set_Line(Po2,Po4); 
    hiegh=Po1.y-Po4.y;
   }
   double Area()
   {
       double area=line1*line2;
       return area;
   }
void printLines()
{
    System.out.println("The lengh of lines is  :"+line1+":"+line2+":"+line3+":"+line4+":");
                
}
  
    
}