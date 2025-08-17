public class function_pr{

    public static void printshivi(){
        System.out.println("Hi Shivika");
        System.out.println("Hi Shivika");
        System.out.println("Hi Shivika");
    }

    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        // System.out.println("Sum is: " + sum);
        return sum;
    }


    public static void main(String[] args) {
        // printshivi();
        int a = 5;
        int b = 10;
        int sum = calculateSum(a, b);
        System.out.println("Sum is: " + sum);

    }
}