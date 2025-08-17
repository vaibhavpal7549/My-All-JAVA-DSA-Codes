public class string_compression {

    public static String compressed(String str){
        String newStr = "";
        //abc;
        for(int i = 0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }

        }
        return newStr;


    }


    public static void main(String[] args) {
        String str = "aabcccccaaa";

        String strs = compressed(str);
        System.out.println(strs);
        
    }
}
