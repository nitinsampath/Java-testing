import java.lang.Math;
public class Coin 
  
{
  private int side;
 
  public Coin ()
  {
    flip();
  }
  
  public String toString()
  {
   if (side == 1)
     return "head";
   return "tail";
  }
  
  public int getValue ()
  {
    return side;
  }
  public void setValue (int s)
  {
    if (s==1 || s==0)
   side = s; 
  }
  public void flip(){
    side = (int) (Math.random()*2);
   
    
  }
}