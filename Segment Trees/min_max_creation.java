public class min_max_creation {
    static int tree[];

    public static void init(int n){ // O(n) time complexity
        tree = new int[4*n];
    }

    public static void buildTree(int i, int si, int sj, int arr[]){ // O(n) time complexity
        if(si == sj){
            tree[i] = arr[si];
            return;
        }
        int mid = (si + sj) / 2;
        buildTree(2*i+1, si, mid, arr);
        buildTree(2*i+2, mid+1, sj, arr);
        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);
    }

    public static int getMax(int arr[], int qi, int qj){ // O(log n) time complexity
        int n = arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj){ // O(log n) time complexity
        if(si > qj || sj < qi){ // no overlap
            return Integer.MIN_VALUE;
        }else if(si >= qi && sj <= qj){ // complete overlap
            return tree[i];
        }else{ // partial overlap
            int mid = (si + sj) / 2;
            int leftMax = getMaxUtil(2*i+1, si, mid, qi, qj);
            int rightMax = getMaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(leftMax, rightMax);
        }

    }

    public static void update(int arr[], int idx, int newVal){ // O(log n) time complexity
        arr[idx] = newVal;
        int n = arr.length;
        updateUtil(0, 0, n-1, idx, newVal);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newVal){ // O(log n) time complexity
        //no overlapping
        if(idx <si || idx > sj){ // no overlap
            return;
        }

        if(si == sj){ // leaf node
            tree[i] = newVal;
        }

        if(si != sj){ // not a leaf node // need to update the children // partial overlap
            tree[i] = Math.max(tree[i], newVal);// update the current node
            int mid = (si + sj) / 2;
            updateUtil(2*i+1, si, mid, idx, newVal); // update left child
            updateUtil(2*i+2, mid+1, sj, idx, newVal); // update right child
        }
    }


    public static void main(String[] args) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(n);
        buildTree(0, 0, n-1, arr);
        // for(int i = 0; i<tree.length; i++){
        //     System.out.print(tree[i] +" "); 
        // }

        int max = getMax(arr, 2, 5);
        System.out.println(max);

        update(arr, 2, 20);
        int max1 = getMax(arr, 2, 5);
        System.out.println(max1);



    }
}
