//A class is a blueprint that defines what its objects can do or contain.
//A method is a block of code that performs a task.
//A constructor is a special member of a class that is called automatically when an object is created. It is commonly used to initialize an object’s data.

class Calculator{//This is CLASS
    public int add(int n1, int n2){
        return n1 + n2;
        //This is method!!!
    }

    public int subtract(int n1, int n2){
        return n1-n2;
    }

}

public class classes_objects {
    public static void main(String args[]){

        int n1 = 4;
        int n2 = 5;
        Calculator calc = new Calculator();//This is Object.

        int result = calc.add(n1, n2);//Calling of method.
        //int result = calc.subtract(n1, n2);
        System.out.println(result);
    }
}