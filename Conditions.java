import java.util.*;

public class Conditions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //*IMPORTANT* COMMENT THE ONES YOU DON'T WANT TOP RUN.👇🏻✅

        checkAge(sc);
        checkEvenOdd(sc);
        checkGreaterSmallerEqual(sc);
        check123(sc);
        switches(sc);

        sc.close();

        }
        public static void checkAge(Scanner sc){
        int age = sc.nextInt();

        if(age > 18) {
            System.out.println("Adult");
        }else {
            System.out.println("Not Adult");
        }
    }


    public static void checkEvenOdd(Scanner sc){
        int x = sc.nextInt();

        if(x % 2 ==0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
    

    public static void checkGreaterSmallerEqual(Scanner sc){
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Equal");
        }else{

            if(a > b){
                System.out.println("A is Greater than b.");
            }else{
                System.out.println("a is Smaller than b.");
            }
        }
    }

    public static void check123(Scanner sc){
        int L123 = sc.nextInt();

        if(L123 == 1){
            System.out.println("Hello");
        } else if(L123 == 2){
            System.out.println("Namaste");
        } else if(L123 == 3){
            System.out.println("Bonjour");
        }else{
            System.out.println("INVALID");
        }
    }

    public static void switches(Scanner sc){
        int button = sc.nextInt();

        switch(button){
            case 1 : System.out.println("Hello");
            break;

            case 2 : System.out.println("Namaste");
            break;

            case 3 : System.out.println("Bonjour");
            break;

            default : System.out.println("INVALID");
        }
    }
}