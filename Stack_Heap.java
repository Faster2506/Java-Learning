//Stack: Stores method-call information, including local variables and intermediate computations.

//Heap: Stores objects and arrays created at runtime. 

class Student{
    int age = 20; // Instance variable stored as part of the object.
}

public class Stack_Heap {
    public static void main(String[] args){
        int number = 10;
        // Stack: s1 is a local reference variable in the main() stack frame
        // Heap: new Student() creates a Student object
        Student s1 = new Student();
        // Create another reference to the SAME object
        Student s2 = s1;

        s2.age = 25;
        System.out.println(number);
        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}

/*1. Stack: Keeps track of method calls and their local variables.
2. Heap: Stores objects created at runtime, such as new Student().
3. Student s2 = s1; copies the reference, not the object. Both variables refer to the same object, so changing s2.age also affects what you see through s1. */