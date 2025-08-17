public class string_substring {

    public static String subString(String str,int si, int ei){

        String res = "";
        for(int i = si; i<ei; i++){
            res = res + str.charAt(i);
        }
        return res;


    }


    public static void main(String[] args) {
        String str = "Hello, World!";
        // System.out.println(subString(str, 0, 5)); //Hello 4 tak chalegi
        System.out.println(str.substring(0, 5));
    }
}
