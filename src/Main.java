import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input symbol: ");
        char symbol = scanner.next().charAt(0);

        if (symbol >= 'a' && symbol <= 'z' || symbol >= 'A' && symbol <= 'Z') {
            System.out.print("it's letter ");

            if (symbol >= 'a' && symbol <= 'z') {
                System.out.println("small");
            } else {
                System.out.println("big");
            }
        } else {
            System.out.println("unknown symbols");
        }

        if (symbol >= 'a' && symbol <= 'z') {
            System.out.print("it's letter small");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.print("it's letter big");
        } else {
            System.out.println("unknown symbols");
        }

        System.out.println(String.format("symbol code is %d", (int) symbol));

//        double kawaiIndex;
//
//        if (age < 17) {
//            kawaiIndex = 999;
//        } else {
//            kawaiIndex = 3.5;
//        }

//        double kawaiIndex = age < 17 ? age % 2 == 0 ? 999 : 888 : 3.5;


//        if (age >= 0 && age <= 7 || age >= 90 && age <= 130) {
//            System.out.println("go to sadik");
//        }


    }
}