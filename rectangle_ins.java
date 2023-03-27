import java.util.*;  
public class rectangle_ins{
    double l,b,area;     //Declaring the instace variable
    public static void main(String args[]){
     rectangle_ins rec =new rectangle_ins();     //creating the class object
     rec.l=10;    //initilize the value
     rec.b=10;    //initilize the value
     rec.area= rec.l*rec.b;  //calculate the result
     System.out.print("Area of a rectangle is "+rec.area);     //print the result
    }
}