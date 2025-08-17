public class adult{
    public static void main(String[] args) {
        int age = 25;
        if(age >= 18){
            System.out.println("You are adult : You can Drive, Vote, and get married");
        }
        else if(age >13 && age < 18){
            System.out.println("You are teenager");
        }
        else{
            System.out.println("You are not adult : You can't Drive, Vote, and get married");
        }
    }
}