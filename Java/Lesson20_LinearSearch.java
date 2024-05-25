public class Lesson20_LinearSearch {
    
    int arr[];
    int location;

    Lesson20_LinearSearch( int thearray[]){
        this.arr = thearray;
    }



    public int searchvalue (int angkayangmaudicari){
        location = -1;


        // System.out.println("Panjang array ini adalah : ");
        // System.err.println(this.arr.length);
        for (int i = 0; i < this.arr.length; i++) {
            // System.out.println(this.arr[i]);
            if(this.arr[i] == angkayangmaudicari){
                location = i + 1;
            }
        }

        return location;
    }





    public static void main(String[] args) {
        
        int[] myarray = {15, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        Lesson20_LinearSearch arraypertama = new Lesson20_LinearSearch(myarray);

        System.out.println(arraypertama.searchvalue(4));


    }
}
