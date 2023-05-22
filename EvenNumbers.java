import java.util.*;
public class EvenNumbers
{  
public static void main(String args[])   
{  
    Scanner sc = new Scanner(System.in);
int number;  
System.out.print("Enter Number till you want even numbers");
number= sc.nextInt();
System.out.print("Even numbers from 1 to "+number+": ");  
for (int i=1; i<=number; i++)   
{  
//logic to check if the number is even or not  
//if i%2 is equal to zero, the number is even  
if (i%2==0)   
{  
System.out.print(i + " ");  
}  
}  
}  
}
