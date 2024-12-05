
package shapes;
import java.util.Scanner;
public class Point {
    
    int x;
    int y;
    
  public void SetX(int XS)
  {
      x=XS;
  }
  public void SetY(int YS)
  {
      x=YS;
  } 
  public void Set(int XS, int YS)
  {
      SetX(XS);
      SetY(YS);
  }
  public int GetX()
  {
      return x;
  }
  public int GetY()
  {
      return y;
  }
  public Point Get()
  {
      Point f=new Point();
      f.x=x;
      f.y=y;
      return f;
  }
  public void ReadPoint(Point xs)
  {
     Scanner input=new Scanner(System.in);
     System.out.println("Pleas Enter X :\n");
     xs.x=input.nextInt();
     SetX(xs.x);
     System.out.println("Pleas Enter Y :\n");
     xs.y=input.nextInt();
   
     SetY(xs.y);
  }
  public void PrintPoint()
  {
      System.out.println("The point is: ("+x+","+y+")");
  }
}