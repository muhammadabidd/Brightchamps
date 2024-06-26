import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson32_StringFreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string:");    // take string from user 
	    String str=sc.nextLine();

        String arr[] = str.split(" ") ;       // split string to get each word
        System.out.println(Arrays.toString(arr));

        int count =0;                           // it is used to keep a count of number of unique words
	    String newarr[]=new String[arr.length + 1];  





	    for (int i=0;i<arr.length;i++)      //loop to find all unique words
	    {
	        boolean flag=false;             
	        for(int j=0;j<count;j++)        // loop to traverse ne array
	        {
	            if(arr[i].equals(newarr[j])) // checking for word already added to new array
	            {
	                flag=true;              // if the current word is already exist int the new array , set flag as true
	                break;
	            }
	        }
	        if(flag==false) // if the current word not found in new array then add it 
	        {
	            newarr[count]=arr[i];
	            
	            count+=1;   //increment the count once the word added to the new array
	        }
	    }






        int freq[]=new int[newarr.length]; //frequncy array is created to store the frequency of each word

        for(int i=0;i<count;i++)        // nested loop is to frequency of words and add the count to the freq[]arsya a
	    {
	        for(int j=0;j<arr.length;j++)
	        {
	            if(newarr[i].equals(arr[j]))    
	            {
	                freq[i]++;  // if the word found then increment the value for the respective word
	            }
	        }
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newarr));
        System.out.println(Arrays.toString(freq));


        System.out.println("\n\nFrequency Table");      // displaying the word with corresponding frequency
	    System.out.println("Word        frequency");
	    for(int i=0;i<count;i++)
	    {
	        System.out.println(newarr[i]+"          "+freq[i]);
	    }













    }
    
}
