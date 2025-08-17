

public class fn1overloading {


    //function to calculate sum of two numbers
        public static int sum(int a, int b){
            return a + b;
    
        }
    //function to calculate sum of three numbers
        public static float sum(float a, float b){
            return a + b ;
        }

        public static float sum(float c, float d, float e){
            return c + d;
        }
    
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            float c = 30;
            float d = 40;
            float e = 50;
            System.out.println(sum(a, b)); //30
            System.out.println(sum(c, d)); //70
            System.out.println(sum(c, d, e)); //80
            
        }
    }
    