package mainmain;

public class Main {
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

        public static void main(String[] args) {
            printData(fullName("John", "Christopher", "Smith"), 65);
        }
        

        public static void printData(String name, int age) {
            System.out.println("私の名前は" + name + "です");
            System.out.println("年齢は" + age + "歳です");
        }


        public static String fullName(String firstName, String lastName) {
            return firstName + " " + lastName;
        }

        public static String fullName(String firstName, String middleName, String lastName) {
            return firstName  + " " + middleName + " " + lastName;
        }
      }
      

