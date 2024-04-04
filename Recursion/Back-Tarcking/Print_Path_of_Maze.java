import java.util.ArrayList;

/**
 * Print_Path_of_Maze
 */
public class Print_Path_of_Maze {

    public static void main(String[] args) {
        // path("", 3, 3);

        // System.out.println(pathList("", 3, 3));

        // System.out.println("Total path to source to Destination:- " + counterPath(3, 3));
        // System.out.println("Count Path of Diagnol way count:- "+count_Path_dignoal(3, 3));

        // System.out.println(PathDiagonal("", 3, 3));
    }
    
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r - 1, c);
        }

        if (c > 1) {
            path(p + "R", r, c - 1);
        }
    }

    
    static ArrayList<String> pathList(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> newList = new ArrayList<>();

        if (r > 1) {
            newList.addAll(pathList(p + "D", r - 1, c));
        }

        if (c > 1) {
            newList.addAll(pathList(p + "R", r, c - 1));
        }

        return newList;
    }

    static int count_Path_dignoal(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = 0, right = 0, diagnol = 0;
        if (r > 1 && c > 1) {
            left = count_Path_dignoal(r - 1, c);
            right = count_Path_dignoal(r, c-1);
            diagnol = count_Path_dignoal(r - 1, c - 1);
        }

        
        return left + right + diagnol;
    }

    static ArrayList<String> PathDiagonal(String p, int r, int c) {
        if (r > 1 && c > 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> newList = new ArrayList<>();

        if (r > 1 && c > 1) {
            newList.addAll(PathDiagonal(p + "D", r - 1, c - 1));
        }
    
        if (r > 1) {
            newList.addAll(PathDiagonal(p + "V", r - 1, c));
        }
        
        if (c > 1) {
            newList.addAll(PathDiagonal(p + "H", r, c - 1));
        }
        
        return newList;
    }

    static int counterPath(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = counterPath(r - 1, c);
        int right = counterPath(r, c - 1);
        
        return left + right;
    }
}