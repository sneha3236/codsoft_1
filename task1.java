import java.util.*; 
  
public class task1 { 
    public static void main(String[] args) 
    { 
  
        int answer, guess; 
  
        final int MAX = 100; 
  
        Scanner sc = new Scanner(System.in); 

        Random rd = new Random(); 
  
        boolean correct = false; 
  
        answer = rd.nextInt(MAX) + 1; 
   
        while (!correct) { 
  
            System.out.println(" Hello user pls guess a number between 1 and 100: "); 
   
            guess = sc.nextInt(); 
  
            if (guess > answer) { System.out.println("Sorry:( your guess is too high, pls try again"); 
            } 
  
            else if (guess < answer) { System.out.println("Sorry:( your guess is Too low, try again"); 
            } 
  
            else { 
  
                System.out.println(  "Congratulations:), you guessed the number."); 
  
                correct = true; 
            } 
        } 
        System.exit(0); 
    } 
}