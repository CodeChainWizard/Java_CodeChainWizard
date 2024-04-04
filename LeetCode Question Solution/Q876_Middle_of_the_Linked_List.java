/**
 * Q876_Middle_of_the_Linked_List
 */
public class Q876_Middle_of_the_Linked_List {

    public static void main(String[] args) {
        int[] head = {1,2,3,4,5};
        System.out.println(middleNode(head));
    }

    static int middleNode(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left == right) {
            return arr[left];
        }
        left++;
        right--;
        return 0;
    }
}