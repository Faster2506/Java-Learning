import java.util.*;

public class patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Rectangle(sc);
        //Square(sc);
        //HollowRectangle(sc);
        HalfPyramid(sc);

        sc.close();
    }

    public static void Rectangle(Scanner sc){
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=5; j++){
            System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Square(Scanner sc){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void HollowRectangle(Scanner sc){
        int n = 4;
        int m = 5;

        //outer loop
        for(int i = 1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){

                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void HalfPyramid(Scanner sc){
        int n = 4;
        //outer
        for(int i=1; i<=n; i++){
            //inner
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}