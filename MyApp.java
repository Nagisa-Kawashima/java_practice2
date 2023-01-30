import java.util.Scanner;
import java.util.Random;
class MyApp {
    public static void main(String[] args) {
        // System.out.print("your name?");
        // Integer answer = 6;
        Integer answer = new Random().nextInt(10) + 1;
        Integer count = 0;

        while (true) {
            System.out.print("your guess?");
            Integer guess = new Scanner(System.in).nextInt();
            count++;
            //   String name = "kawashima";
            
            if (answer == guess) {
                // System.out.println("Bingo");
                System.out.println("Bingo! it took" + count + "guesses!");
                break;
            } else if (answer > guess) {
                System.out.println("the answer is higher!");
            } else {
                System.out.println("the answer is lower!");
            }
            // System.out.println("The answer was" + answer);
            //これがあると答えがしられてしまうので消す

        }
    // System.out.println("your guess:" + guess);
    //   System.out.println("hello " + name);
    //   System.out.println("hello " + name +  " again!");
    }
  }