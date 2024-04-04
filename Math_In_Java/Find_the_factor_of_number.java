import java.util.ArrayList;

/**
 * Find_the_factor_of_number
 */
public class Find_the_factor_of_number {

    public static void main(String[] args) {
        numberFactor3(20);
    }

    //------ O(n) = time complexity. -------
    // static void numberFactor(int n){
    //     for (int i = 1; i <= n; i++) {
    //         if(n % i == 0){
    //             System.out.print(i + " ");
    //         }
    //     }
    // }

    // ------- O(sqrt(n)) = time complexity ---------
    // static void numberFactor2(int n){
    //     for (int i = 1; i <= Math.sqrt(n); i++) {
    //         if(n % i == 0){
    //             if(n/i == i){
    //                 System.out.println(i);
    //             }else{
    //                 System.out.println(i + "  " + (n/i));
    //             }
    //         }
    //     }
    // }

    // --- here, time and space both are same O(sqrt(n)).
    static void numberFactor3(int n){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }

        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}