import java.util.Arrays;

public class mergesort {
    
public static void main(String[] args) {
    
    int myarr[] = {8, 2, 5, 3, 4, 7, 6, 1};


    mergesortbang(myarr);


    System.out.println(Arrays.toString(myarr));

}



public static void mergesortbang(int arr[]){


    int length = arr.length;

    if (length <= 1) return;

    int middle = length/2;


    // mau ngiisi array seebelah kiri
    int leftarr[] = new int[middle];
    int rightarr[] = new int[length - middle];



    for (int i = 0; i < leftarr.length; i++) {
        leftarr[i] = arr[i];
    }

    for (int j = middle; j < arr.length; j++) {
        rightarr[j - middle] = arr[j];
    }



    System.out.println(Arrays.toString(leftarr));
    System.out.println(Arrays.toString(rightarr));

    mergesortbang(leftarr);
    mergesortbang(rightarr);


    merge(leftarr, rightarr, arr);



}

public static void merge(int left[], int right[], int arr[]){

    int leftsize = arr.length / 2;
    int rightsize = arr.length - leftsize;

    int i =0, l = 0, r = 0;



    while (l < leftsize && r < rightsize){

        if (left[l] < right[r]){
            arr[i] = left[l];
            l++;
            i++;
        }else{
            arr[i] = right[r];
            r++;
            i++;
        }


    }





    while (l < leftsize) {
        arr[i] = left[l];
        i++;
        l++;
    }

    
    while (r < rightsize) {
        arr[i] = right[r];
        i++;
        r++;
    }
}



}
