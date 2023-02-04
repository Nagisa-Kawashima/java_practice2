public class Method {
    public static void sayHi(String name) {
        // int x = 10;
        System.out.println("Hi! " + name);
      }
    
      // overload
    
      public static void sayHi() {
        System.out.println("Hi! Nobody!");
      }
    
      public static void main(String[] args) {
        sayHi();
        sayHi("Steve"); // 引数
        // System.out.println(name);
        // System.out.println(x);
      }
}