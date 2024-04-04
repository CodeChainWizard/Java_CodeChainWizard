import java.util.ArrayList;

/**
 * Dice_Problem
 */
public class Dice_Problem {

    public static void main(String[] args) {
        // diceProblem_Logic("", 4);
        diceProblem_Logic_Face("", 4,6);
        // System.out.println(getPermutations("", 4));
    }
    
    static void diceProblem_Logic(String p, int target) {
        if (target == 0) {
            System.out.print(p + ", ");
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            diceProblem_Logic(p + i, target - i);
        }
    }
    static void diceProblem_Logic_Face(String p, int target, int face) {
        if (target == 0) {
            System.out.print(p + ", ");
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceProblem_Logic_Face(p + i, target - i, face);
        }
    }
    
    static ArrayList<String> getPermutations(String p, int target) {
        if (target == 0) {
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }

        ArrayList<String> newList = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            newList.addAll((getPermutations(p + i, target - i)));
        }
        
        return newList;
    }
}