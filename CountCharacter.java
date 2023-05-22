public class CountCharacter    
{    
    public static void main(String[] args) {    
        String string = "Hi I'm Akash";    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
       
        System.out.println("Total characters are: " + count);    
    }    
}     
