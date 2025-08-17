public class classes_objects{
    public static void main(String[] args) {
        // Creating an object of the class
        Pen p1 = new Pen(); //Constructor // Created a pen object called p1
        
        p1.setColor("Blue");
        // System.out.println(p1.color);
        System.out.println(p1.getColor());


        p1.setTip(5);
        // System.out.println(p1.tip);
        System.out.println(p1.getTip());

        // p1.setTip(9);
        // System.out.println(p1.tip);
        // p1.color = "Yellow";
        p1.setColor("Pink");
        System.out.println(p1.getColor());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "CoolCoderV";
        // // myAcc.balance = 1000;
        // // myAcc.password = "abc";
        // myAcc.setPassword("abcdefghi");


    }
}

//pen ka blueprint hai ye
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    // Attributes
    private String color;
    // int price;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    //functions
    void setColor(String newcolor){
        this.color = newcolor;

    }
    void setTip(int tip){
        this.tip = tip;

    }


}

class Animal{

}

class Student{
    // Attributes
    String name;
    int age;
    int roll_number;
    float percentage;

    void calcPercentage(int phy, int chem, int maths){
        percentage = (phy + chem + maths) / 3;

    }
}
