
// Simplify Path
// We hava an absolute path for a file (Unix-style), simplify it. Note that absolute path always begin
// with '/' ( root directory ), a dot in path represent current directory and double dot represents
// parent directory.

//Time Complexity: O(n)
//Space Complexity: O(1)
import java.util.*;
public class simplify_path {

    public static String simplify(String A){
        Stack<String> stack = new Stack<String>();
        String res = "";
        res += "/";
        int len_A = A.length();

        for(int i = 0; i<len_A; i++){
            String dir = "";
            while(i<len_A && A.charAt(i) == '/'){
                i++;
            }
            while(i<len_A && A.charAt(i) != '/'){
                dir += A.charAt(i);
                i++;
            }
            if(dir.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }

            }else if(dir.equals(".")){
                    continue;
            }
            else if(dir.length()!=0){
                    stack.push(dir);
            }

        }

        Stack<String> st1 = new Stack<String>();
        while(!stack.isEmpty()){
            st1.push(stack.pop());
        }
        while(!st1.isEmpty()){
            res += st1.pop();
            if (!st1.isEmpty()) res += "/";
        }

        return res;
        
    }
    public static void main(String[] args) {
        String str = new String("/home.///////foo/.../bar//baz/asd//foo/./foo");
        String res = simplify(str);
        System.out.println(res);
    }
    
}





















// // Simplify Path
// // We hava an absolute path for a file (Unix-style), simplify it. Note that absolute path always begin
// // with '/' ( root directory ), a dot in path represent current directory and double dot represents
// // parent directory.

// //Time Complexity: O(n)
// //Space Complexity: O(1)
// import java.util.*;
// public class simplify_path {

//     public static String simplify(String A){
//         Stack<String> stack = new Stack<String>();
//         String res = "";
//         res += "/";
//         int len_A = A.length();

//         for(int i = 0; i<len_A; i++){
//             String dir = "";
//             while(i<len_A && A.charAt(i) == '/'){
//                 i++;
//             }
//             while(i<len_A && A.charAt(i) != '/'){
//                 dir += A.charAt(i);
//                 i++;
//             }
//             if(dir.equals("..") == true){
//                 if(!stack.isEmpty()){
//                     stack.pop();
//                 }

//             }else if(dir.equals(".") == true){
//                     continue;
//             }
//             else if(dir.length()!=0){
//                     stack.push(dir);
//             }

//         }

//         Stack<String> st1 = new Stack<String>();
//         while(!stack.empty()){
//             st1.push(stack.pop());
//         }
//         while(!st1.empty()){
//             if(stack.size()!=1){
//                 res += (st1.pop() + "/");
//             }else{
//                 res+= st1.pop();
//             }
//         }

//         return res;
        
//     }
//     public static void main(String[] args) {
//         String str = new String("/home///////foo/./bar//baz/asd//foo/./foo");
//         String res = simplify(str);
//         System.out.println(res);
//     }
    
// }








/*

import java.util.*;

public class simplify_path_debug {

    public static String simplify(String A) {
        Stack<String> stack = new Stack<>();
        int len_A = A.length();

        for (int i = 0; i < len_A; i++) {
            String dir = "";

            // Skip multiple slashes
            while (i < len_A && A.charAt(i) == '/') {
                i++;
            }

            // Collect directory name
            while (i < len_A && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }

            // 🔍 DEBUG: Show current directory
            if (!dir.equals("")) {
                System.out.println("Current dir: \"" + dir + "\"");
            }

            // Processing
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    System.out.println("Going back (..): Popping \"" + stack.peek() + "\"");
                    stack.pop();
                }
            } else if (dir.equals(".")) {
                System.out.println("Current dir (.), nothing to do.");
                continue;
            } else if (dir.length() != 0) {
                System.out.println("Pushing \"" + dir + "\" to stack");
                stack.push(dir);
            }

            // 🔍 DEBUG: Show stack state
            System.out.println("Stack now: " + stack);
            System.out.println("----------");
        }

        // Build simplified path
        StringBuilder res = new StringBuilder();
        for (String s : stack) {
            res.append("/").append(s);
        }

        // If stack was empty, return root
        return res.length() > 0 ? res.toString() : "/";
    }

    public static void main(String[] args) {
        String str = "/home///////foo/../bar//baz/asd//foo/./foo";
        String res = simplify(str);
        System.out.println("\n✅ Final Simplified Path: " + res);
    }
}






 */




/*
Current dir: "home"
Pushing "home" to stack
Stack now: [home]
----------

Current dir: "foo"
Pushing "foo" to stack
Stack now: [home, foo]
----------

Current dir: ".."
Going back (..): Popping "foo"
Stack now: [home]
----------

Current dir: "bar"
Pushing "bar" to stack
Stack now: [home, bar]
----------

Current dir: "baz"
Pushing "baz" to stack
Stack now: [home, bar, baz]
----------

Current dir: "asd"
Pushing "asd" to stack
Stack now: [home, bar, baz, asd]
----------

Current dir: "foo"
Pushing "foo" to stack
Stack now: [home, bar, baz, asd, foo]
----------

Current dir: "."
Current dir (.), nothing to do.
Stack now: [home, bar, baz, asd, foo]
----------

Current dir: "foo"
Pushing "foo" to stack
Stack now: [home, bar, baz, asd, foo, foo]
----------

✅ Final Simplified Path: /home/bar/baz/asd/foo/foo

 */