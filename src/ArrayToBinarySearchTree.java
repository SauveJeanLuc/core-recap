import java.util.Scanner;

/** Java program to convert an sorted array to binary search tree
 * @author SAUVE Jean-Luc
 * @version 1.0
 */
public class ArrayToBinarySearchTree {

    //Function to sort Array elements to easily be transformed to BST using Bubble Sort.
    public static void sortArray(int givenArray[]){
        boolean sorted = false;
        int temp;

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < givenArray.length - 1; i++) {
                if (givenArray[i] > givenArray[i+1]) {
                    temp = givenArray[i];
                    givenArray[i] = givenArray[i+1];
                    givenArray[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    //Function to transform treeNode to Binary Search tree.
    private static TreeNode transformToBST(int[] arr, int start, int end){
            TreeNode node = new TreeNode(0);
            if(start == end-1) {
                node = new TreeNode(arr[start]);
                node.right = new TreeNode(arr[end]);
            }
            else if(start == end){
                return new TreeNode(arr[start]);
            }
            else{
                int mid = (start + end) /2;
                node.val = arr[mid];
                node.left = transformToBST(arr, start, mid-1);
                node.right = transformToBST(arr, mid +1, end);
            }
            return node;
    }

    //Function to traverse the tree
    private static void traverseTree(TreeNode root){
        if(root != null){
            traverseTree(root.left);
            traverseTree(root.right);
            System.out.println(root.val);
        }
    }

    //Taking sorted Array to Bst Function
    public static TreeNode startTransformation(int[] arr){
        if(arr.length == 0) return null;
        return transformToBST(arr,0,arr.length-1);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = 0;
        System.out.println("Please enter the size of your array: ");
        sizeOfArray = in.nextInt();
        int[] newArray = new int[sizeOfArray];

        System.out.println("Now your array is:  ");

        //Ask for elements of array
        for(int i=0; i< newArray.length; i++){
            System.out.println("Enter element: ");
            sizeOfArray = in.nextInt();
            newArray[i] = sizeOfArray;
        }

        //Sort array
        sortArray(newArray);

        //Transform Binary tree
        TreeNode root = startTransformation(newArray);


        //print tree element by traversing it
        System.out.println("Elements from tree: ");
        traverseTree(root);
    }




}

//Node modelling BST.
class TreeNode {
    public int val;
    public TreeNode left,right;

    public TreeNode(int val){
        this.val = val;
        this.left = this.right = null;
    }
}
