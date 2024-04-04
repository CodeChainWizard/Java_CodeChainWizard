/**
 * XOR_Between_Number_Rnage
 */
public class XOR_Between_Number_Rnage {

    public static void main(String[] args) {
        // Range XOR a -> b => XOR(b) * XOR(a-1).
        int a = 3;
        int b = 9;

        int ans = XOR_Number(b) * XOR_Number(a - 1);
        System.out.println(ans);

        int answer = 0;
        for (int i = a; i <= b; i++) {
            answer ^= i;
        }

        System.out.println(answer);
    }

    static int XOR_Number(int a){
        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
            return 1;
        }
        if(a % 4 == 2){
            return a * 1;
        }
        return 0;
    }
}   