



public class string_compression_builder {

    public static String compressed(String str){
        StringBuilder newStr = new StringBuilder("");
        //abc;
        for(int i = 0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr = newStr.append(str.charAt(i));
            if(count > 1){
                newStr = newStr.append(count.toString());
            }

        }
        return newStr.toString();


    }


    public static void main(String[] args) {
        String str = "aabcccccaaa";

        String strs = compressed(str);
        System.out.println(strs);
        
    }
}
