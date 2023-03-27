import java.util.*;  
public class circle_ins{
    double r,area;     //Declaring the instace variable
    public static void main(String args[]){
     circle_ins cr =new circle_ins();     //creating the class object
     cr.r=2.5;    //initilize the value
     cr.area= 3.14*cr.r*cr.r;  //calculate the result
     System.out.print("Area of a circle is "+cr.area);     //print the result
    }
}