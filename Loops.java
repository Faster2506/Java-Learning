import java.util.*;

public class Loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //*IMPORTANT* COMMENT THE ONES YOU DON'T WANT TOP RUN.👇🏻✅

        multipleHello(sc);
        ZeroToTen(sc);
        usingwhile(sc);
        usingdowhile(sc);
        table_ANY_Number(sc);

        sc.close();
    }

    public static void multipleHello(Scanner sc){
    for(int counter = 0; counter < 3; counter=counter+1){
            System.out.println("Hello World");
        }
    }

    public static void ZeroToTen(Scanner sc){
    for(int num=0; num<11; num=num+1){
        System.out.println(num);
        }
    }
    
    public static void usingwhile(Scanner sc){
        int num = 0;

        while(num < 11) {
            System.out.println(num);
            num = num + 1;
        }
    }

    public static void usingdowhile(Scanner sc){
        int num = 0;

        do{
            System.out.println(num);
            num = num + 1;
        }
        while(num < 11);
    }

    public static void table_ANY_Number(Scanner sc) {
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    System.out.println("\nMultiplication Table of " + num);
    System.out.println("------------------------");

    for (int i = 1; i <= 10; i++) {
        System.out.printf("%2d X %2d = %3d%n", num, i, num * i);
    }
    }
}