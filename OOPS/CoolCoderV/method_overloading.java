public class method_overloading {
    public static void main(String[] args) {
        Claculator newCalc = new Claculator();
        System.out.println(newCalc.sum(1,3));
        System.out.println(newCalc.sum(1.5f,3.5f));
        System.out.println(newCalc.sum(1,3, 8));
        
    }
}


class Claculator {
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}