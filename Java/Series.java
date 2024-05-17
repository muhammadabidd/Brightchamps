public class Series {


    // series 1 : 1! + 2! + . . . n! takes only one input
// series 2: 1!/x + 2!/x^2 + 3!/x^3 . . . n!/x^n. takes two inputs 
// series 3: 1!/x^k + 2!/x^k + 3!/x^k . . . n!/x^k. takes three inputs. 



    int n, x, k, series_number;

    // FIRST CONSTUCTOR
    Series (int berapa_suku){
        n = berapa_suku;
        series_number = 1;
    }


    Series (int berapa_suku, int value_of_x){
        n = berapa_suku;
        x = value_of_x;
        series_number = 2;
    }

    Series (int berapa_suku, int value_of_x, int pangkat_berapa){
        n = berapa_suku;
        x = value_of_x;
        k = pangkat_berapa;
        series_number = 3;
    }


    double calculate(){

        double sum = 0.0;
        int fact = 1;

        if (series_number == 1){
            System.out.println("====================================");
            for (int i = 1; i <= n; i++) {
                fact = fact * i ;
                System.out.println(fact);

                sum = fact + sum;
            }
        }

        if (series_number == 2) {
            System.out.println("====================================");
            for (int i = 1; i <= n; i++) {
                fact = fact * i ;
                System.out.println(fact);

                sum = fact/ Math.pow(x, i);
            }


        }
        
        if (series_number == 3) {
            System.out.println("====================================");
            for (int i = 1; i <= n; i++) {
                fact = fact * i ;
                System.out.println(fact);

                sum = fact/ Math.pow(x, k);
            }


        }
        return sum;

    }



    public static void main(String[] args) {

        int a = 3;  //banyaknya suku
        int b = 3;   //nilai x
        int c = 2;   //pangkat berapa

        Series seriespertama = new Series(a);
        Series serieskedua = new Series(a, b);
        Series seriesketiga = new Series(a, b, c);





        double result1 = seriespertama.calculate();
        System.out.println("Sum of the series is : " + result1);

        double result2 = serieskedua.calculate();
        System.out.println("Sum of the series is : " + result2);

        double result3 = seriesketiga.calculate();
        System.out.println("Sum of the series is : " + result3);

    }


        
    
}
