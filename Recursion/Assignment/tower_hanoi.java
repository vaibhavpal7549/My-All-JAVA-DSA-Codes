// Question 5 : TOWER OF HANOI (Important!)
// You have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle
// starts With disks sorted in ascending order of size from top to bottom (i.e., each disk Sits on
// top of an even larger one).
// You have the following constraints:
// (1) Only one disk can be moved at a time.
// (2) A disk iS slid off the top of one tower onto another tower.
// (3) A disk cannot be placed on top of a smaller disk. Write a program to move the disks from
// the first tower to the
// last using Stacks.
// Let rodl = A', rod rod 3 =
// An example with 2 disks i.e. N-2:
// Step 1 Shift the first disk from 'A' to 'B'
// Step 2 : Shift the second disk from A' to 'C'
// Step 3 : Shift the first disk from B' to 'C


public class tower_hanoi {

    public static void towerOfHanoi(int n, char source, char helper, char destination) {
        // Base case: If there is only one disk, move it from source to destination
        
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, destination, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'S', 'H', 'D');
    }
}
