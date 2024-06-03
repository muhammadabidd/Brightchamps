import java.util.Arrays;

public class Lesson26_Merge_Sort {
    


    public static void main(String[] args) {
        int arr[] = {8, 2, 5, 3, 4, 7, 6, 1};

        System.out.println("Array before sorted : ");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr);


        System.out.println();
        System.out.println("Array After sorted : ");
        System.out.println(Arrays.toString(arr));


    }


    public static void mergeSort(int arr[]){

        int length = arr.length;
        if (length <= 1) return;

        int middle = length/2;
        int leftArr[] = new int[middle];
        int rightArr[] = new int[length - middle];

        // System.out.println("Left Arrays : ");
        // System.out.println(Arrays.toString(leftArr));
        // System.out.println("Right Arrays : ");
        // System.out.println(Arrays.toString(rightArr));
        
        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = arr[i];
        }

        for (int j = middle; j < arr.length; j++) {
            rightArr[j - middle] = arr[j];
            // System.out.println(j - middle);
        }


        // System.out.println("Left Arrays : ");
        // System.out.println(Arrays.toString(leftArr));
        // System.out.println("Right Arrays : ");
        // System.out.println(Arrays.toString(rightArr));



        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(leftArr, rightArr, arr);

        System.out.println("###########################");

    }


    private static void merge(int left[], int right[], int arr[]){
        System.out.println("This is the left arr : " + Arrays.toString(left));
        System.out.println("This is the right arr : " + Arrays.toString(right));
        System.out.println("This is the Main arr : " + Arrays.toString(arr));

        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0, l = 0, r = 0;  //indices

        // System.out.println("leftsize : " + leftSize);
        // System.out.println("rightsize : " + rightSize);


        System.out.println("Value i sekarang : " + i);
        System.out.println("Value l sekarang : " + l);
        System.out.println("Value r sekarang : " + r);
        System.err.println(left[l] + " Compared with " + right[r]);

        while (l < leftSize && r < rightSize) {


            if(left[l] < right[r]){
                arr[i] = left[l];
                i++;
                l++;
            }else{
                arr[i] = right[r];
                r++;
                i++;
            }
   
        }

        System.out.println("Value i sekarang : " + i);
        System.out.println("Value l sekarang : " + l);
        System.out.println("Value r sekarang : " + r);
        // System.err.println(left[l] + " Compared with " + right[r]);

        System.out.println("This is the left arr after change: " + Arrays.toString(left));
        System.out.println("This is the right arr after change: " + Arrays.toString(right));
        System.out.println("This is the Main arr after the change: " + Arrays.toString(arr));


        while (l < leftSize) {
            arr[i] = left[l];
            i++;
            l++;
        }

        System.out.println("Value i sekarang : " + i);
        System.out.println("Value l sekarang : " + l);
        System.out.println("Value r sekarang : " + r);
        // System.err.println(left[l] + " Compared with " + right[r]);

        System.out.println("This is the left arr after change: " + Arrays.toString(left));
        System.out.println("This is the right arr after change: " + Arrays.toString(right));
        System.out.println("This is the Main arr after the change: " + Arrays.toString(arr));


        while (r < rightSize) {
            arr[i] = right[r];
            i++;
            r++;
        }

        System.out.println("Value i sekarang : " + i);
        System.out.println("Value l sekarang : " + l);
        System.out.println("Value r sekarang : " + r);

        System.out.println("This is the left arr after change: " + Arrays.toString(left));
        System.out.println("This is the right arr after change: " + Arrays.toString(right));
        System.out.println("This is the Main arr after the change: " + Arrays.toString(arr));


    }
}
