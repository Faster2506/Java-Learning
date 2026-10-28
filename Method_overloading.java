//Method Overloading - Same method name, different parameter lists.

public class Method_overloading {
    // Method 1: Accepts two integer.
    
    public static int add(int a, int b){
        return a + b;
    }

     // Method 2: Accepts three integers.
    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String args[]){
        System.out.println(add(20, 30));

        System.out.println(add(10,20,30));
    }
}

