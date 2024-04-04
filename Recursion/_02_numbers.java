/**
 * _02_numbers
 */
public class _02_numbers {

    public static void main(String[] args) {
        // Write a function that takes in a number and print it.
        // print the first 5 number:- 1,2,3,4,5

        print1(1);
    }

    static void print1(int n){
        System.out.println(n);
        print2(n);
    }

    static void print2(int n){
        System.out.println(n+1);
        print3(n+1);
    }

    static void print3(int n){
        System.out.println(n+1);
        print4(n+1);
    }
    static void print4(int n){
        System.out.println(n+1);
        print5(n+1);
    }
    static void print5(int n){
        System.out.println(n+1);
    }
}