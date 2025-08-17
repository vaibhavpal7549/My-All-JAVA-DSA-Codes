import java.util.*;
public class duplicatePar {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            //closing
            if(ch ==')'){
                int count = 0;
                while(!s.isEmpty() && s.peek() != '('){
                count++;
                s.pop();
                }
                if(count < 1){
                    return true; //duplicate found
                }else{
                    s.pop(); //pop the opening bracket
                }
            }else{
                //opening
                s.push(ch);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(isDuplicate(str)); //true
        str = "(a-b)";
        System.out.println(isDuplicate(str)); //false
    }
}







// import java.util.*;
// public class duplicatePar {

//     public static boolean isDuplicate(String str){
//         Stack<Character> s = new Stack<>();
//         for(int i=0;i<str.length();i++){

//             char ch = str.charAt(i);

//             //closing
//             if(ch ==')'){
//                 int count = 0;
//                 while(s.pop() != '('){
//                 count++;
//                 }
//                 if(count < 1){
//                     return true; //duplicate found
//                 }
//             }else{
//                 //opening
//                 s.push(ch);
//             }
//         }

//         return false;
//     }
//     public static void main(String[] args) {
//         String str = "((a+b))";
//         System.out.println(isDuplicate(str)); //true
//         str = "(a-b)";
//         System.out.println(isDuplicate(str)); //false
//     }
// }
