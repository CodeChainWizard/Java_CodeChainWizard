/**
 * Find_Odd_Even_Using_BitWise_Operator
 */
public class Find_Odd_Even_Using_BitWise_Operator {

    public static void main(String[] args) {
        System.out.println(findNumber(67));
    }

    static String findNumber(int num){
        if((num & 1) == 1){
            return "Odd Number";
        }
        return "Even Number";
    }
}