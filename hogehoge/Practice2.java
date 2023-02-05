// class Hoge {
//     private String name;
//     private int score;

//     public Hoge(String name, int score) {
//         this.name = name;
//         this.score = score;
//     }
//     public int getScore() {
//         return this.score;
//     }
//     public void setScore(int score) {
//         if (score > 0) {
//             this.score = score;
//         }
//     }
// }
// public class Practice2  {
//     public static void main (String[] args) {
//         Hoge tom = new Hoge("tom", 65);
//         tom.setScore(85);
//         tom.setScore(-22);
//         System.out.println(tom.getScore());
//     }
// }

// class User {
//     private String name;
//     private static int count = 0;

//     public User(String name) {
//         this.name = name;
//         User.count++;
//     }
//     public static void getInfo() {
//       System.out.println("# of instances: " + User.count);  
//     }

    
// }
// public class Practice2 {
    
//     public static void main(String[] args) {
//         User.getInfo();
//         User tom = new User("tom");
//         User.getInfo();

//         User bob = new User("bob");
//         User.getInfo();
//     }

    
// }



// class User {
//     private String name;
//     private static int count;

//     static {
//         User.count = 0;
//         System.out.println("Static initializer");
//     }
//     {
//         System.out.println("Instance initializer");
//     }

//     public User(String name) {
//         this.name = name;
//         User.count++;
//         System.out.println("Construtor");
//     }

//     public static void getInfo() {
//         System.out.println("#of instances:" + User.count);
//     }
// }

// public class Practice2 {
//     public static void main(String[] args) {
//         User.getInfo();
//         User tom = new User("tom");

//         User.getInfo();
//         User bob = new User("bob");
//         User.getInfo();
//     }
// }
// class User {
//     protected String name;
//     private static double VERSION = 1.1;

//     public User(String name) {
//         this.name = name;
//         User.VERSION = 1.2;
//     }

//     public void sayHi() {
//         System.out.println("hi" + this.name);
//     }
// }

// class AdminUser extends User {
//     public AdminUser(String name) {
//         super(name);
//       }
    
//       @Override
//       public void sayHi() {
//         System.out.println("[admin] hi! " + this.name);
//       }
    
// }

// public class Practice2 {
//     public static void main(String[] args) {
//         User tom = new User("tom");
//         tom.sayHi();
//       }
// }


// abstract class User {
//     public abstract void sayHi();
// }

// class JapaneseUser extends User {
//     @Override
//     public void sayHi() {
//         System.out.println("こんにちは");
//     }
// }

// class AmericanUser extends User {
//     @Override
//     public void sayHi() {
//         System.out.println("Hi");
//     }
// }

// public class Practice2 {
//     public static void main(String[] args) {
//         AmericanUser tom = new AmericanUser();
//         JapaneseUser aki = new JapaneseUser();
//         tom.sayHi();
//         aki.sayHi();
//     }
// }

// interface Printable {
//     double VERSION = 1.2;
//     void print();
//     public default void getinfo() {
//         System.out.println("I/F ver." + Printable.VERSION);
//     }
// }

// class User implements Printable {
//     @Override
//     public void print() {
//         System.out.println("Now printing user profile...");
//     }
// }

// public class Practice2 {
//     public static void main(String[] args) {
//         User tom = new User();
//         tom.print();
//         tom.getinfo();
//     }
// }


// enum Result {
//     SUCCESS,
//     ERROR,
// }

// public class Practice2 {
//     public static void main(String[] args) {
//         Result res;
//         res = Result.ERROR;

//         switch (res) {
//             case SUCCESS:
//             System.out.println("OK!");
//             System.out.println(res.ordinal());
//             break;

//             case ERROR:
//             System.out.println("NG!");
//             System.out.println(res.ordinal());
//             break;
//         }
//     }
// }

// class MyException extends Exception {
//     public MyException(String s) {
//         super(s);
//     }
// }

// public class Practice2 {
//     public static void div(int a, int b) {
//         try {
//             if (b < 0) {
//                 throw new MyException("not minus!");
//             }
//             System.out.println(a / b);
//         } catch (ArithmeticException e) {
//             System.out.println(e.getMessage());
//         } catch (MyException e) {
//             System.out.println(e. getMessage());
//         } finally {
//             System.out.println("--end --");
//         }
//     }

//     public static void main(String[] args) {
//         div(3, 0);
//         div(5, -2);
//     }
// }


// public class Practice2 {
//     public static void main(String[] args) {
//         // Integer i = new Integer(32);
//         // int n = i.intValue();

//         Integer i = 32;
//         // i = null;
//         int n = i;
//         System.out.println();
//     }
// }

// class MyInteger {
//     public void getThree(int x) {
//         System.out.println(x);
//         System.out.println(x);
//         System.out.println(x);

//     }
// }
// class MyData<T> {
//     public void getThree(T x) {
//         System.out.println(x);
//         System.out.println(x);
//         System.out.println(x);

//     }
// }

// public class Practice2 {
//     public static void main(String[] args) {
//         // MyInteger mi = new MyInteger();
//         // mi.getThree(55); 
//         MyData<Integer> i = new MyData<>();
//         i.getThree(32);
//         MyData<String> s = new MyData<>();
//         s.getThree("hello");
//     }

   
// }



// class MyRunnable implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 0; i < 500; i++) {
//             System.out.print('*');
//         }
//     }
// }
// public class Practice2 {
//     public static void main(String[] args) {
//         MyRunnable r = new MyRunnable();
//         // Thread t = new Thread(r);
//         // t.start(); 
//         new Thread(r).start();

        
//         for (int i = 0; i < 500; i++) {
//             System.out.print('.');
//         }
//     }
// } 

// public class Practice2 {

//     public static void main(String[] args) {
      
      // ラムダ式
      // (引数) -> {処理}
    //   new Thread(new Runnable() {
    //     @Override
    //     public void run() {
    //       for (int i = 0; i < 500; i++) {
    //         System.out.print('*');
    //       }
    //     }
    //   }).start();
//       new Thread(() -> {
//         for (int i = 0; i < 500; i++) {
//           System.out.print('*');
//         }
//       }).start();
  
//       for (int i = 0; i < 500; i++) {
//         System.out.print('.');
//       }
//     }
  
//   }

// public class Practice2 {
//     public static void main(String[] args) {
//         String s = "abcdef";
//         System.out.println(s.length());
//     }
// }

package hogehoge; 

public class Practice2 {
    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(s.length());
        System.out.println(s.substring(2, 5));
        System.out.println(s.replaceAll("ab", "AB"));

        String s1 = "ab";
        String s2 = "ab";

        if (s1.equals(s2)) {
            System.out.println("same!");
        }
        if (s1 == s2) {
            System.out.println("same!same!");
        }

        String ss1 = new String("ab");
        String ss2 = new String("ab");

        if (ss1 == ss2) {
            System.out.println("same!same!same!");
        }
    }
}
