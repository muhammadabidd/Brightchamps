import java.util.Arrays;

public class Lesson3x_ArrayMereging {

    public static void main(String[] args) {
        
        int a[]={1,2,3,4,8,11,16,20,25, 30};
        int b[]={4,5,6,12,16,19,22,24};

        int c[] = new int[a.length + b.length];

        int sekian = 0;

        for(int i=0;i<a.length;i++)
        {
            c[sekian] = a[i];
            sekian ++;
        }

        for(int i=0;i<b.length;i++)
        {
            c[sekian] = b[i];
            sekian ++;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));


    }
    
}
