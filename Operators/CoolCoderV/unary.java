public class unary{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println(a); //10
        System.out.println(a++); //10
        System.out.println(++a); //12
        System.out.println();

        System.out.println(b); //20
        System.out.println(b--); //20
        System.out.println(--b); //18
        System.out.println();

        System.out.println(c); //30
        System.out.println(++c); //31
        System.out.println(c++); //31
        System.out.println(c); //32
        System.out.println();

        System.out.println(d); // 40
        System.out.println(--d); //39
        System.out.println(d--); //39
        System.out.println(d); //38

    }
}