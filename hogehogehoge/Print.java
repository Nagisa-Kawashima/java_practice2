
// import java.util.Random;

// public class Print {
//     public static void main(String[] args) {

//         double d = 53.234;
//         System.out.println(Math.ceil(d));
//         System.out.println(Math.floor(d));
//         System.out.println(Math.round(d));
//         System.out.println(Math.PI);

//         Random r = new Random();
//         System.out.println(r.nextDouble());
//         System.out.println(r.nextInt(100));
//         System.out.println(r.nextBoolean());
//         // int score = 50;
//         // double height = 165.8;
//         // String name = "kawashima";

//         // System.out.printf("name: %s, score: %d, height: %f\n", name, score, height); 
//         // System.out.printf("name: %-10s, score: %10d, height: %5.2f", name, score, height);

//         // String s = String.format("name: %10s, score: %-10d, height: %5.2f\n", name, score, height);
//         // System.out.println(s);
//     }
    
// }
package hogehogehoge;

// import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Print {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();
        // LocalDateTime d = LocalDateTime.of(2016, 1, 1, 10, 10);
        // LocalDateTime d = LocalDateTime.parse("2016-01-01T10:10:10");

        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.getMonth().getValue());

        System.out.println(d.plusMonths(2). minusDays(3));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy!MM!dd!");
        System.out.println(d.format(dtf));
    }
}




// public class Print {
//     public static void main(String[] args) {
//         List<Integer> sales = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));
        

//         sales
//             .stream()
//             .filter(e -> e % 3 == 0)
//             .map(e -> "(" + e + ")")
//             .forEach(System.out::println);
//     }
// }

// public class Print {
//     public static void main(String[] args) {
//         Map<String, Integer> sales = new HashMap<>();
//         sales.put("tom", 10);
//         sales.put("bob", 20);
//         sales.put("steve", 30);

//         System.out.println(sales.get("tom"));
//         System.out.println(sales.size());

//         for (Map.Entry<String, Integer> sale: sales.entrySet()) {
//             System.out.println(sale.getKey() + ":" + sale.getValue());
//         }

//         sales.put("tom", 100);
//         sales.remove("steve");

//         for (Map.Entry<String, Integer> sale : sales.entrySet()) {
//             System.out.println(sale.getKey() + ":" + sale.getValue());
//         }
//     }
// }


// public class Print {
//     public static void main(String[] args) {
//         Set<Integer> sales = new HashSet<>();

//         sales.add(10);
//         sales.add(20);
//         sales.add(30);
//         sales.add(10);

//         System.out.println(sales.size());

//         for (Integer sale: sales) {
//             System.out.println(sale);
//         }
//         sales.remove(30);

//         for (Integer sale: sales) {
//             System.out.println(sale);
//         }
        

//     }
// }


// public class Print {
//     public static void main(String[] args) {
//         List<Integer> sales = new ArrayList<>();

//         sales.add(10);
//         sales.add(20);
//         sales.add(30);

//         for (int i = 0; i < sales.size(); i++) {
//             System.out.println(sales.get(i));
//         }

//         sales.set(0, 100);
//         sales.remove(2);

//         for (Integer sale: sales) {
//             System.out.println(sale);
//         }
//     }
// }