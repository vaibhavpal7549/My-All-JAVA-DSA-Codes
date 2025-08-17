public class subsets {

    public static void findsubsets(String str, String ans, int i){
        //base case
        if(i == str.length()){
            if(ans.length() ==0){
                System.out.println("null");
            }else{
            System.out.println(ans + " ");
            }
            return;
        }

        //recursion call

        //yes choice
        findsubsets(str, ans + str.charAt(i), i+1); //function call step
        //no choice
        findsubsets(str, ans, i+1); //backtracking step
    }
    public static void main(String[] args) {
        String str = "abc";
        findsubsets(str, "", 0);
        
    }
}


/*

public class Subsets {

    public static void findSubsets(String str, StringBuilder ans, int i) {
        // Base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans.toString());
            }
            return;
        }
            

        // Yes choice (Include current character)
        ans.append(str.charAt(i));
        findSubsets(str, ans, i + 1);
        
        // Backtrack (Remove last character to explore the 'no' choice)
        ans.deleteCharAt(ans.length() - 1);
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, new StringBuilder(), 0);
    }
}


 */