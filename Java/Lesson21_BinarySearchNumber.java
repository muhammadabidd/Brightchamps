import java.util.Arrays;

public class Lesson21_BinarySearchNumber {
    


    // Remember that static mean it only applied on the specific class, not to go anytwhere else
    public static int BinarysearchSorted( int arr[], int value ){


        int left = 0;
        int right = arr.length - 1;
        int mid  = 0;

        // System.out.println(arr[left]);
        // System.out.println(arr[right]);
        // System.out.println(mid);

        while (left<= right){
            mid = (left + right)/2;
            // System.out.println(mid);

            if(value == arr[mid]){
                System.out.println("I can find it");
                return mid;
                
            }
            else if (value < arr[mid]){
                right = mid - 1;
            }
            else {

                left = mid + 1;

            }

            
        
        }

        return -1;

    }   


    public static int BinarysearchUnsorted( int arr[], int value ){

        Arrays.sort(arr);
        System.out.println("The Sorted Array is : ");
        System.out.println(Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;
        int mid  = 0;

        // System.out.println(arr[left]);
        // System.out.println(arr[right]);
        // System.out.println(mid);

        while (left<= right){
            mid = (left + right)/2;
            // System.out.println(mid);

            if(value == arr[mid]){
                System.out.println("I can find it");
                return mid;
                
            }
            else if (value < arr[mid]){
                right = mid - 1;
            }
            else {

                left = mid + 1;

            }

            
        
        }

        return -1;

    }   



    public static void stringBinarySearch(String arr[], String value ){
        Arrays.sort(arr);
        System.out.println("The Sorted Array is : ");
        System.out.println(Arrays.toString(arr));


        int left = 0;
        int right = arr.length - 1;
        int mid  = 0;

        while (left<= right){
            mid = (left + right)/2;
            // System.out.println(mid);

            if(arr[mid].equals(value)){
                System.out.println("I can find it");
                System.out.println("The " + value + " is in : " + mid);

                break;
            }
            else if (arr[mid].compareTo(value)>0){
                right = mid - 1;
            }
            else {

                left = mid + 1;

            }

            
        
        }

        // System.out.println ("Cannot find it");

    }


    public static void main(String[] args) {
        
        int[] sorted_array = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] unsorted_array = {9, 7, 6, 5, 4, 3, 8};
        String[] string_array = {"Blue", "Red", "Yellow"};
        String target_string = "Yellow";
        int mytarget = 8;




        System.out.println(BinarysearchSorted(sorted_array, mytarget));
        System.out.println(BinarysearchUnsorted(unsorted_array, mytarget));
        stringBinarySearch(string_array, target_string);



    }




}
