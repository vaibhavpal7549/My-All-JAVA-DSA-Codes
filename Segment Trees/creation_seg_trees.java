public class creation_seg_trees {

    static int tree[]; // segment tree array //static because we will use it in static functions

    public static void init(int n){
        tree = new int[4*n]; // size of segment tree array is 4 times the input array size
    }

    public static int buildST(int arr[], int treeIndex, int start, int end){ // O(n) time complexity
        // base case
        if(start == end){
            tree[treeIndex] = arr[start];
            return tree[treeIndex];
        }

        int mid = (start + end) / 2;
        tree[treeIndex] = buildST(arr, 2*treeIndex+1, start, mid) + buildST(arr, 2*treeIndex+2, mid+1, end);
        return tree[treeIndex];
    }

    public static int getSuMUtil(int i, int si, int sj, int qi, int qj){ // O(log n) time complexity
        // case 1: non overlapping
        if(qj <= si || qi >= sj){ // non overlapping
            return 0;
        }
        // case 2: complete overlap
        if(si >= qi && sj <= qj){ // overlapping
            return tree[i];
        }
        // case 3: partial overlap
        int mid = (si + sj) / 2;
        return getSuMUtil(2*i+1, si, mid, qi, qj) + getSuMUtil(2*i+2, mid+1, sj, qi, qj);
    }
    // i == treeIndex, si == segment start index, sj == segment end index, qi == query start index, qj == query end index
    public static int getSum(int arr [], int qi, int qj){
        int n = arr.length;
        return getSuMUtil(0, 0, n-1, qi, qj);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int diff){
 // O(log n) time complexity
        if(idx > sj || idx < si){ // if the index to be updated is out of the range of the current segment
            return; //non overlapping
        }
        //complete overlap
        tree[i] += diff; // update the value of the current node in the segment tree 
        //partial overlap
        if(si != sj){ // if the current segment is not a leaf node, update the  
        // left and right child nodes
            int mid = (si + sj) / 2;
            updateUtil(2*i+1, si, mid, idx, diff);
            updateUtil(2*i+2, mid+1, sj, idx, diff);
        }
    }

    public static void update(int arr[], int idx, int newVal){
        int n = arr.length;
        int diff = newVal - arr[idx]; // calculate the difference between the new value and the old value
        arr[idx] = newVal; // update the value in the original array
        updateUtil(0, 0, n-1, idx, diff); // update the segment tree
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        init(n);
        int treeNode = buildST(arr, 0, 0, n-1);
        System.out.println("Segment Tree: " +treeNode);

        for(int i = 0; i<tree.length; i++){
            System.out.print(tree[i] +" "); 
        }
        System.out.println();
        System.out.println("Sum of elements from index qi to qj: " + getSum(arr, 2, 5)); //18
        System.out.println("Updating index 2 to value 2");
        update(arr, 2, 2);
        System.out.println("Sum of elements from index qi to qj after update: " + getSum(arr, 2, 5)); //17

    }
}
