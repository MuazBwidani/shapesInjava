package shapes;

public class Square extends Quad{
    
      boolean Test_Square()
    {
        
      if(line1== line2 && line3==line4)
      {
        return true;  
        }
      
      else
      { 
        System.out.println("The point you entered don't true");
        return false;
      }
     
    }
 
}
