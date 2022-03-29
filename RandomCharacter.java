import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//get a random value within a range
public class RandomCharacter {
    static Scanner s = new Scanner(System.in);
    static Random r = new Random();

    public static void main (String[] args) {
        
        int in = 1;

        while (in != 0)
        {
            //menu
            System.out.print("1. random lower\n2. random upper\n3. random digit\n4. just random\n0. exit\n>: ");

            //input
            try{
                in = s.nextInt();
            }
            catch (InputMismatchException e) 
            {
                in = 0;
            }
            
            //based on choice, randomly generate 15 characters of that catogery 
            for(int i = 0; i < 15; ++i)
            {
                switch (in) 
                {
                    case 1 -> System.out.println((i+1) + ": " + getRandomLowerCaseLetter());
                    case 2 -> System.out.println((i+1) + ": " + getRandomUpperCaseLetter());
                    case 3 -> System.out.println((i+1) + ": " + getRandomDigitCharacter());
                    case 4 -> System.out.println((i+1) + ": " + getRandomCharacter());
                }
            }
            System.out.println("====================END====================\n");
        }
    }

    //retun random charater between a to z
    public static char getRandomLowerCaseLetter() {
        return (char) (r.nextInt(26) + 'a');
    }
    
    //retun random charater between A to Z
    public static char getRandomUpperCaseLetter() {
        return (char) (r.nextInt(26) + 'A');
    }
    
    //retun random charater between 0 to 9
    public static char getRandomDigitCharacter() {
        return Integer.toString(r.nextInt(10)).charAt(0);
    }

    //retun random charater of any three above
    public static char getRandomCharacter() {
        switch (r.nextInt(3)) {
            case 0:
                return getRandomLowerCaseLetter();
            case 1:
                return getRandomUpperCaseLetter();
            default:
                return getRandomDigitCharacter();
        }
    }
}
