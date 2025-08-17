
public class shortest {

    public static void getPath(String str1){
        int x = 0, y = 0;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == 'N'){
                y++;
            }else if(str1.charAt(i) == 'S'){
                y--;
            }else if(str1.charAt(i) == 'W'){
                x--;
            }else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        double distance = Math.sqrt(x2 + y2);
        System.out.println("The shortest path is " + distance);



    }


    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string: ");
        // String str = sc.nextLine();
        String str1 = "WNEENESENNN";
        getPath(str1);


    }
}
