import Arithmetic.Arithmetic;
import Map.MyMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;

        System.out.println("1. Arithmetic");
        System.out.println("2. Map");

        do {
            System.out.print("\nTest ");
            c = sc.nextInt();

            switch (c) {
                case 1:
                    //Testing integer and float
                    System.out.println("\ninteger and float.....");

                    Arithmetic arithmetic = new Arithmetic(5, 3.5);
                    System.out.println("Sum: " + arithmetic.add());
                    System.out.println("Difference: " + arithmetic.subtract());
                    System.out.println("Product: " + arithmetic.multiply());
                    System.out.printf("Quotient: " + "%,.2f", arithmetic.divide());
                    System.out.println("\nMinimum: " + arithmetic.getMin());
                    System.out.println("Maximum: " + arithmetic.getMax());
                    break;

                case 2:
                    // Testing key as an integer and value as a string
                    System.out.println("\ninteger and string.....");

                    MyMap<Integer, String> map = new MyMap<>();
                    map.put(15, "Raya");
                    map.put(1, "Louis");
                    map.put(31, "Lance");
                    map.put(22, "Lourdes");
                    System.out.println(map.get(15));
                    System.out.println(map.remove(11));
                    System.out.println(map.remove(31));
                    break;

                default:
                    System.exit(0);
            }
        } while (true);
    }
}
