// class User {
//     // String name = "me";
//     // void sayHi() {
//     //     System.out.println("hi");
//     // }

//     String name;
//     User(String name) {
//         this.name = name;
//     }

//     User() {
//         this("me!");
//     }

//     void sayHi() {
//         System.out.println("hi!" + this.name);
//     }
// }


// public class My {

//     public static void main(String[] args) {
//         User tom;
//         tom = new User();
//         System.out.println(tom.name);
//         tom.sayHi();
//     }
//     // String name = "me";

//     // void sayHi() {
//     //     System.out.println("hi!");
//     // }
// }

class User {
    String name;

    User(String name) {
        this.name = name;
    }

    void sayHi() {
        System.out.println("hi" + this.name);
    }
}

class AdminUser extends User {
    AdminUser(String name) {
        super(name);
    }

    void sayHello() {
        System.out.println("hello" + this.name);
    }

    @Override
    void sayHi() {
        System.out.println("[admin]hi" + this.name);
    }
}

public class My {
    public static void main (String[] args) {
        User tom = new User("tom");
        System.out.println(tom.name);
        tom.sayHi();

        AdminUser bob = new AdminUser("bob");
        System.out.println(bob.name);
        bob.sayHi();
        bob.sayHello();
    }
}