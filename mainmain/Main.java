package mainmain;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前：");
        String firstName = scanner.next();
        System.out.print("名字：");
        String lastName = scanner.next();
        System.out.print("年齢：");
        int age = scanner.nextInt();
        System.out.print("身長(m):");
        double height = scanner.nextDouble();
        System.out.print("体重(kg):");
        double weight = scanner.nextDouble();

        printData(firstName, lastName, age, height, weight);

    }
    public static void printData(String firstName, String lastName, int age, double height, double weight) {
        System.out.println("名前は" + fullName(firstName, lastName) + "です");
        System.out.println("年齢は" + age + "歳です");
        if (age >= 20) {
            System.out.println("成年者です");
        } else {
            System.out.println("未成年者です");
        }
        System.out.println("身長は" + height + "mです");
        System.out.println("体重は" + weight + "kgです");
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }




    // public static void main(String[] args) {
    //     // それぞれ年齢に関する引数を追加してください
    //     printData("Kate Jones", 27);
    //     printData("John Christopher Smith", 65);
    //   }
    
    //   // 年齢に関する引数を受け取れるようにしてください
    //   public static void printData(String name, int age) {
    //     System.out.println("私の名前は" + name + "です");
    //     // 「年齢は◯◯歳です」と出力してください
    //     System.out.println("年齢は" + age + "です");
        
    //   } 
        // public static void main(String[] args) {
        //     String name = fullName("kawashima", "nagisa");

        //     printData(name, 27);
        // }

        // public static void printData(String name, int age) {
        //     System.out.println("私の名前は" + name + age + "歳です");
        // }

        // public static String fullName(String firstname, String lastname) {
        //     return firstname + " " + lastname;
        // }

        // public static void main(String[] args) {
        //     printData(fullName("John", "Christopher", "Smith"), 65);
        // }
        

        // public static void printData(String name, int age) {
        //     System.out.println("私の名前は" + name + "です");
        //     System.out.println("年齢は" + age + "歳です");
        // }


        // public static String fullName(String firstName, String lastName) {
        //     return firstName + " " + lastName;
        // }

        // public static String fullName(String firstName, String middleName, String lastName) {
        //     return firstName  + " " + middleName + " " + lastName;
        // }
      }
      

