public class permutation {

    public static void findPermutation(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion case
        for(int i = 0; i<str.length();i++){
            char curr = str.charAt(i);
            //abcde => "ab" + "de" => "abde" c gaayab ho jata hai, matlab ki hm c ko include nahi krna chahte

            String Newstr = str.substring(0,i) + str.substring(i+1); //till last tak jaaega
            findPermutation(Newstr, ans + curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
