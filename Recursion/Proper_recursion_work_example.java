/**
 * Proper_recursion_work_example
 */

public class Proper_recursion_work_example {

    // Funtion called it-Self they called 'recursion' 
    public static void main(String[] args) {
        // Write a function to tahe a n number and print it.
        // print first 5 numbers:- 1,2,3,4,5

        print1(1);
    }

    static void print1(int n){
        // Condition it's important otherwise show an error while run the program.

        if(n == 5){
            System.out.println(5);
            return;
        }
        
        // Here, also function stored in stack memory(Like a first print1(1) called, after print1(2) etc... they all stored in stack memory)

        System.out.println(n);

        // this is a last function called then called taild recursion
        print1(n+1);
    }
}