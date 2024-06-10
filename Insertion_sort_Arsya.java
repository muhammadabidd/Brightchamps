import java.util.Arrays;

public class Insertion_sort_Arsya {
    public static void main(String[] args) {
        
        int [] arr = {6, 1, 7, 4, 2, 9, 8, 5, 8};
        System.out.println(Arrays.toString(arr));

        for( int i=0; i < arr.length - 1; i ++){
            int sementara = i+1;
            int kiri = sementara - 1;

            System.out.println("sementara :" + sementara);
            System.out.println("kirinya : " + kiri);
            while( kiri >=0 && arr[kiri] > sementara){
                arr[kiri+1] = arr[kiri];
                kiri = kiri -1;
                System.out.println("kirinya : " + kiri);
            }
            
            arr[kiri + 1] = sementara;
            System.out.println("##################################################");
        }

        System.out.println("Hasil Akirnya adalah :");
        System.out.println(Arrays.toString(arr));


    }
}
