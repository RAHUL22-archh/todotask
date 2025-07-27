import java.util.*;
public class todotask {
    public static void main(String[] args){
        List <String> tasks=new ArrayList<>();
        Scanner scan1=new Scanner(System.in);
       
        boolean running=true;
        while(running){ 
            System.out.println("TO DO LIST");
            System.out.println("If you want to add a task press :1");
            System.out.println("If you want to Remove a task press :2");
            System.out.println("If you want to quit press :3");
            System.out.println("Enter your choice");
            String input=scan1.nextLine();
            int choice=0;
            try{
                choice=Integer.parseInt(input);
            }
            catch(NumberFormatException e){
                System.out.println("Enter a valid integer input");
                continue;
            }
            if(choice==1){
                System.out.println("Enter the task");
                String toadd=scan1.nextLine();
                tasks.add(toadd);
            }
            if(choice==2){
                System.out.println("Enter the task");
                String todelete=scan1.nextLine();
                tasks.remove(todelete);
            }
            if(choice==3){
                running=false;
            }
            System.out.println("Operation finished successfully");
            System.out.println(tasks);


            
        } 
        
        

    }
    
}
