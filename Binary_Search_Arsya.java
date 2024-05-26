public class Binary_Search_Arsya {


    public static void main(String[] args) {
        
        int[] array_saya = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int dicari = 18;


        int left = 0 ; 
        int right = array_saya.length -1 ;
        int mid = (left + right) / 2 ;


        while (left < right){


            mid = (left + right)/2;

            if (array_saya[mid] < dicari){
                left = mid  + 1;
            }
            else{
                right = mid - 1;
            }

            if (array_saya[mid] == dicari){
                System.out.println("Ketemu di " + mid);
            }

        } 


    }
    
}
