import java.util.*;
public class guessgame {
    public static void main(String[] args){
        int num=75;
        int attempts=0;
        int guessed;
        Scanner scan=new Scanner(System.in);
        System.out.println("Guess the number");
        do{
        
        guessed=scan.nextInt();
        attempts++;
          if(guessed>num){
            System.out.println("Too high");
            
          }
          else if(guessed<num){
            System.out.println("Too low");
          }
          else{
            System.out.println("Congratulations you have find the number in "+attempts+"attempts");
          }
          
        }
        while(guessed != num);
            
            scan.close();

        
    }
}
