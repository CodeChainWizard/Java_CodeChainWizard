/**
 * Calculate_Power_a_Power_B
 */
public class Calculate_Power_a_Power_B {

    public static void main(String[] args) {
        int base = 2;
        int power = 4;
        
        int answer = 1;

        while (power > 0) {
            if((power & 1) == 1){
                answer *= base;
            }
            base *= base;
            power = power >> 1;
        }

        System.out.println(answer);

    }

}