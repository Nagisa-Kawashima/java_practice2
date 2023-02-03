public class Practice {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // String msg;
        // msg = "hogehoge"; 
        // String msg = "hogehoge";
        // System.out.println(msg);

        // char a = 'a';

        // int x = 10;
        // long y = 100000000000L;
        // double d = 2344333.334;
        float f = 32.2222F;

        boolean flag = true;

        // String msg = "Hello Wo\nrld Again  \t!";
        // System.out.println(msg);

        // float i;
        // i = 10 / 3;
        // System.out.println(i);
        
        // i = 10 % 3;
        // System.out.println(i);

        // int x = 5;
        // x++;
        // System.out.println(x);

        // String s;
        // s = "hello" + "world";
        // System.out.println(s);

        // double d = 52343.231;
        // int i = (int)d;
        // System.out.println(i);

        // int i = 10;
        // double d = (double)i /4;
        // System.out.println(d);

        int score = 100;
        if (score > 80) {
            System.out.println("Great");
        } else if (score > 60) {
            System.out.println("Good");
        } else {
            System.out.println("so so...!");
        }
        
        String msg = score > 80 ? "Great" : "soso...!";
        System.out.println(msg);

        String signal = "red";
        switch (signal) {
            case "red":
                System.out.println("stop");
                break;
            case "green":
            case "blue":
                System.out.println("go!");
                break;
            case "yellow":
                System.out.println("caution!");
                break;
            default:
                System.out.println("wrong signal");
                break;
        }

        // int i = 12;
        // while(i < 10) {
        //     System.out.println(i);
        //     i++;
        // } 
        // do {
            // System.out.println(i);
        //     i++;
        // }while (i < 10);

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                // break;
                continue;

            }

            System.out.println(i);
        }

        // int [] sales;
        // sales = new int[3];
        // sales[0] = 100;
        // sales[1] = 200;
        // sales[2] = 300;

        // sales[1] = 2000;
        // System.out.println(sales[1]);

        // int [] sales2;
        // sales2 = new int[] {100, 200, 300};

        int[] sales2 = {100, 200, 300};
        System.out.println(sales2[2]);



        int[] hoge = {700, 400, 500};

        // for (int i = 0; i < 3; i++) {
        for (int i = 0; i < hoge.length; i++) {
            System.out.println(hoge[i]);
        }


        for (int hogehoge : hoge) {
            System.out.println(hogehoge);
        }

        // int x = 10;
        // int y = x;
        // y = 5;
        // System.out.println(x);
        // System.out.println(y);


        int [] a = {3, 5, 7};
        int [] b = a;
        b[1] = 8;
        System.out.println(a[1]);
        System.out.println(b[1]);

        String s = "hello";
        String t = s;
        t = "world";
        System.out.println(s);
        System.out.println(t);



    }
}