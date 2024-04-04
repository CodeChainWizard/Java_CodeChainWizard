import java.util.ArrayList;

/**
 * backtracking
 */
public class Pathrestrictions_Question {

    public static void main(String[] args) {
        boolean[][] arr = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };

        Pathrestrictions("", arr, 0, 0);

        System.out.println(PathList("", arr, 0, 0));
    }
    
    static void Pathrestrictions(String p, boolean[][] meze, int r, int c) {
        if (r == meze.length - 1 && c == meze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (meze[r][c] == false) {
            return;
        }

        if (r < meze.length - 1) {
            Pathrestrictions(p + "D", meze, r + 1, c);
        }

        if (c < meze[0].length - 1) {
            Pathrestrictions(p + "R", meze, r, c + 1);
        }
    }
    
    static ArrayList<String> PathList(String p, boolean[][] meza, int r, int c) {
        if (r == meza.length - 1 && c == meza[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> newList = new ArrayList<>();
        if (meza[r][c] == false) {
            return newList;
        }
        if (r < meza.length - 1) {
            newList.addAll(PathList(p + "D", meza, r + 1, c));
        }

        if (c < meza[0].length - 1) {
            newList.addAll(PathList(p + "R", meza, r, c + 1));
        }

        return newList;
    }
}