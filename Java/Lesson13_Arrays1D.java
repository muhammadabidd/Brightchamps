public class Lesson13_Arrays1D {
    public static void main(String args[]) {
        System.out.println("array 1");
        String StringArr1[]=new String [6];//declaration and instantiation  
        
        StringArr1[0]="Luke";//initialization  
        StringArr1[1]="Leia";  
        StringArr1[2]="Yoda";  
        StringArr1[3]="Han Solo";  
        StringArr1[4]="Anakin"; 
        StringArr1[5]="Ben";
        
        System.out.println("length of StringArr1 is "+ StringArr1.length);
        //printing array values
        for(int i=0 ;i<StringArr1.length ;i++)
         {
             System.out.println(StringArr1[i]);
             
         }
                 
        System.out.println("array 2");
        String [] StringArr2={"Obi wan","Rey","Chris Pratt","Ben","Alex","Luke"};
        
        for(int i=0 ;i< 6;i++)
         {
             System.out.println(StringArr2[i]);
             
         }
       
       
    }
}
