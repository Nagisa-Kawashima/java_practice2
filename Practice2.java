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

class User {
    private String name;
    private static int count = 0;

    public User(String name) {
        this.name = name;
        User.count++;
    }
    public static void getInfo() {
      System.out.println("# of instances: " + User.count);  
    }

    
}
public class Practice2 {
    
    public static void main(String[] args) {
        User.getInfo();
        User tom = new User("tom");
        User.getInfo();

        User bob = new User("bob");
        User.getInfo();
    }

    
}