import java.util.*;  
public class interest_ins{
    double p,r,t,I;     //Declaring the instace variable
    public static void main(String args[]){
     interest_ins si =new interest_ins();     //creating the class object
     si.p=12000;    //initilize the value
     si.r=5;    //initilize the value
     si.t=2;    //initilize the value
     si.I= (si.p*si.r*si.t)/100;  //calculate the result
     System.out.print("Simple interest is "+si.I);     //print the result
    }
}