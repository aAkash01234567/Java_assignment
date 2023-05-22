import java.util.*;

public class ReverseNumber 
{
  
public static void main (String[]args) 
  {
    
Scanner sc = new Scanner (System.in);
    
int num, reverse = 0;
    
System.out.print ("Enter Your Number");
    
num = sc.nextInt ();
    
while (num != 0)
      
      {
	
int remainder = num % 10;
	
reverse = reverse * 10 + remainder;
	
num = num / 10;
      
} 
System.out.println ("The reverse num is: " + reverse);

} 
}
