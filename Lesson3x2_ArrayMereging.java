import java.util.Arrays;

public class Lesson3x2_ArrayMereging {
    public static void main(String[] args) {


        int a[]={1,2,3,4,8,11,16,20,25, 30};
        int b[]={4,5,6,12,16,19,22,24};

        int c[] = new int[a.length + b.length];

        int sekian = 0;
        int i = 0, j = 0;

        while (i < a.length && j < b.length)
        {
          if (a[i] < b[j]) {
              c[sekian] = a[i];
              i++;
              sekian ++;
          }
          else
          {
              c[sekian++] = b[j];
              j++;
          }
        }

        //Copying remaining elements of 'a' to 'c'
        while(i<a.length)
        c[sekian++]=a[i++];


        //Copying remaining elements of 'b' to 'c'
        while(j<b.length)
        c[sekian++]=b[j++];

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
