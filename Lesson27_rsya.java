import java.util.Arrays;

public class Lesson27_rsya {
    public static void main(String[] args) {
        

        int arr[][] = {{1, 2, 3, 4, 5}, 
                        {11, 22, 33, 44, 55}, 
                        {111, 222, 333, 444, 555}};


        System.out.println("Original Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));         
        }


        mirror_arr(arr);


       
    }

    public static void mirror_arr(int arr[][] ){
        // System.out.println("ini didalam fungsi");
        int col = arr[0].length ;
        int row = arr.length;
        int mirrorred_arr[][]=  new int[row][col];

        for (int j = 0; j < row; j++){
            
            for (int i = 0; i < col; i++) { 
                mirrorred_arr[j][i] = arr[j][col - i-1];
            }
        }

        System.out.println("MIRRORRED Array : ");
        for (int i = 0; i < mirrorred_arr.length; i++) {
            System.out.println(Arrays.toString(mirrorred_arr[i]));         
        }

    }

}
