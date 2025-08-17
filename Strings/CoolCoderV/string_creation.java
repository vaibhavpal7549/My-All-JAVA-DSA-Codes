import java.util.Scanner;
public class string_creation{


    public static void printLetters(String str6){
        for(int i = 0; i<str6.length(); i++){
            System.out.print(str6.charAt(i) + " ");
        }
        System.out.println();

    }

    public static String SubString(String str5, int si, int ei){
        String str6 = "";
        for(int i = si; i<=ei; i++){
            str6 = str6 + str5.charAt(i);
        }
        return str6;



    }




    public static void main(String[] args) {
        String str = "Hello, World!";
        char ch [] = {'a', 'b', 'c', 'd'};

        String str2 = new String("xyz");
        System.out.println(str2); // xyz
        System.out.println(str); //Hello, World!
        System.out.println(ch); //abcd


        //input output
        Scanner sc = new Scanner(System.in);
        String name = "Shivika";
        System.out.println(name);

        // String det;
        // String fd;
        // System.out.println("Enter the details:");
        // det = sc.next();
        // System.out.println("Enter complete fd : ");
        // fd = sc.nextLine();

        // System.out.println(fd);
        // System.out.println(det);

        //length of string
        String str3 = "Hello";
        System.out.println(str3.length()); // 5

        //string concatenate
        String str4 = "Hello Shivika";
        String str51 = "and Vaibhav";
        System.out.println(str4 + " " + str51); //Hello Shivika and Vaibhav

        //String charAt
        String str6 = "Hello Shivika";
        System.out.println(str6.charAt(0)); // H

        printLetters(str6);
        String str5 = "Hello World";
        String system = SubString(str5, 0, 4);
        System.out.println(system); 



        
    }
}