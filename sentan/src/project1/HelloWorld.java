package project1;
import java.util.Random;

public class HelloWorld {

    public static void main(String[] args) {
    	 Random random = new Random();
    	 int randomNumber = random.nextInt(20) + 1;
    	 for (int i = 0; i < randomNumber; i++) {
             System.out.println("HelloWorld");
         }
     }
 }