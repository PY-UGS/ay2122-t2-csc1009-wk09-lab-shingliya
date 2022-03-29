import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyUnitTest {
    //test if the output is within a to z
    @RepeatedTest(100)
    public void testRandomLower() {
        char a = RandomCharacter.getRandomLowerCaseLetter();
        System.out.println(a);
        assertTrue(a >= 'a' && a <= 'z');
    }
    //test if the output is within A to Z
    @RepeatedTest(100)
    public void testRandomHigher() {
        char a = RandomCharacter.getRandomUpperCaseLetter();
        System.out.println(a);
        assertTrue(a >= 'A' && a <= 'Z');
    }
    //test if the output is within 0 to 9
    @RepeatedTest(100)
    public void testRandomDigit() {
        char a = RandomCharacter.getRandomDigitCharacter();
        System.out.println(a);
        assertTrue(a >= '0' && a <= '9');
    }
    //test if the output is within the above 3 cases
    @RepeatedTest(100)
    public void testRandomAll() {
        char a = RandomCharacter.getRandomCharacter();
        System.out.println(a);
        assertTrue((a >= 'a' && a <= 'z')
                || (a >= 'A' && a <= 'Z')
                || (a >= '0' && a <= '9'));
    }
    //test if the number is prime
    @RepeatedTest(100)
    public void testPrime() {
        char a = RandomCharacter.getRandomDigitCharacter();

        System.out.println(a);
        assertTrue (isPrime((Character.getNumericValue(a))));
    }

    public Boolean isPrime(int n) {
        for(int i = 2; i < n; ++i)
        {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
