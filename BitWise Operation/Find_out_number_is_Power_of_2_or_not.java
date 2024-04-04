/**
 * Find_out_number_is_Power_of_2_or_not
 */
public class Find_out_number_is_Power_of_2_or_not {

    public static void main(String[] args) {
        // note:- if i enter 0 then they will return true then write extra  condition to check for zero and return false.
        int num = 2;
        System.out.println(Number_Result(num));
    }

    static int Number_Result(int num){
        return (num & (num - 1)) == 0 ? 0 : 1;
    }
}