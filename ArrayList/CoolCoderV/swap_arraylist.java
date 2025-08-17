// import java.util.ArrayList;
// public class swap_arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);

//         //Swapping Operation
//         int el1 = list.get(3);
//         int el3 = list.get(1);

//         list.remove(1);
//         list.add(1, el1);

//         list.remove(3);
//         list.add(3, el3);

//         System.out.println(list);
//     }
// }



import java.util.ArrayList;
public class swap_arraylist {

    //swap function
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        System.out.println(list);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        //Swapping Operation
        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        swap(list, idx1, idx2);

    }
}
