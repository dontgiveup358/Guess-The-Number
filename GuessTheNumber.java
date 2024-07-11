package homework;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random();

int count=0;
int randomNumber = random.nextInt(1,51);

while(true){
    count++;
    System.out.println("Guess a number");
    int num1 = scanner.nextInt();

    if(num1>randomNumber){
        System.out.println("Too big! Try again");
    }
    else if(num1<randomNumber){
        System.out.println("Too small! Try again");
    }
    else{
        System.out.println("Congratulations, you guessed the number!");
        System.out.println("Number of tries"+" "+ count);
        break;
    }
}







    }
}
