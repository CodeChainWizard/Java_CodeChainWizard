/**
 * Reverce_Star_Pattan
 */
public class Reverce_Star_Pattan {

    public static void main(String[] args) {
        trianglw(4, 0);
    }
    
    static void trianglw(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            trianglw(r, c + 1);
            System.out.print("*");
        } else {
            trianglw(r - 1, 0);
            System.out.println();
        }
    }
}