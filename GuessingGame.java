import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class GuessingGame{
    private ArrayList<Quotation> quotations;
    
    public GuessingGame(){
        quotations = new ArrayList<Quotation>();
        
        quotations.add(new Quotation("aaaaa", "A.A."));
        quotations.add(new Quotation("bbbbb", "B.B."));
        quotations.add(new Quotation("ccccc", "C.C."));
        quotations.add(new Quotation("ddddd", "D.D."));
        quotations.add(new Quotation("eeeee", "E.E."));
        
        System.out.println(quotations.get(0).getQuotation());
    }
    
    public void guessMyNumber(){
        boolean stillPlaying  = true;
        Scanner keyboardInput = new Scanner(System.in);
        Random  r             = new Random();
        int     target        = 0;
        int     guess         = 0;
        target = r.nextInt(10) + 1; // (0-9)+1
             
        while(stillPlaying == true){      
            System.out.println("Enter number 1-10 (0 to quit): ");
            guess = keyboardInput.nextInt();
            if(guess == 0){
                break; // kills the loop
            }else if(guess < 0){
                System.out.println(guess + " is too low");
            }else if(guess > 10){
                System.out.println(guess + " is too high");
            }else if(guess == target){
                System.out.println("correct!");
                target = r.nextInt(10) + 1; // (0-9)+1
                //System.out.println("Play again? yes or no?");
            }else{ // they guessed wrong but in the right range
                System.out.println("WRONG (target is " + target + ")");
            }
        }
        System.out.println("thanks for playing; now you quit. bye");
    }
}
