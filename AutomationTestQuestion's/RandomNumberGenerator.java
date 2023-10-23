//Program to generate random numbers & strings in java.
// Number
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        // Generating random integers within a specific range (e.g., between 1 and 100)
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Random Number: " + randomNumber);

        // Generating random double values between 0 and 1
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);
    }
}



// String 
import java.security.SecureRandom;
import java.util.Base64;

public class RandomStringGenerator {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        // Generating a random string of specified length (e.g., 12 characters)
        int stringLength = 12;
        byte[] randomBytes = new byte[stringLength];
        secureRandom.nextBytes(randomBytes);
        String randomString = Base64.getUrlEncoder().withoutPadding().encodeToString(randomBytes);
        System.out.println("Random String: " + randomString);
    }
}
