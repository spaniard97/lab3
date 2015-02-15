import java.util.Scanner;

class Question{
    public static final int CURRENT_YEAR = 2015;
    
    public void getAgeYears(){
        Scanner s = new Scanner(System.in); // the keyboard
        System.out.print("What year were you born? ");
        
        while(s.hasNext()){
            String yearBorn = s.next();
            if(yearBorn.equalsIgnoreCase("Q")){
                System.out.println("Thanks. Bye");
                break;
            }
            System.out.println(yearBorn);
            System.out.println("What year were you born? (type Q to quit)");
        }
    }
    
    
    
    public void getAgeYearsIntOnly(){
        Scanner s        = new Scanner(System.in); 
        int     yearBorn = 0;
        System.out.print("What year were you born? ");
        
        if(s.hasNext()){
            while(!(s.hasNextInt())){  
                System.out.println("What year were you born? (type Q to quit)");
                if(s.next().equalsIgnoreCase("Q")){
                    System.out.println("You quit. Bye");
                    return;
                }
            }
            yearBorn = s.nextInt();
        }
        System.out.println("You were born in " + yearBorn);
    }
    
}

