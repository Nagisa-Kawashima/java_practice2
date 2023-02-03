public class Method {
    

    public static String sayHi(String name) {
        // System.out.println("Hi!" + name);
        return "Hi!" + name;
    }

    public static void main(String[] args) {
        // sayHi("boc");
        // sayHi("Tom");
        // sayHi("hoge");
        String msg = sayHi("kawashima");
        System.out.print(msg);
    }
}