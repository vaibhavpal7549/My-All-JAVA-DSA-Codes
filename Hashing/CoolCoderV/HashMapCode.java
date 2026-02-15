import java.util.*;

public class HashMapCode {

    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // number of key-value pairs
        private LinkedList<Node>[] buckets; // N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.size = 0;
            this.buckets = new LinkedList[4];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // Hash Function
        private int hashFunction(K key) {
            int hashCode = key.hashCode();
            return Math.abs(hashCode) % buckets.length;
        }

        // Search in LL
        private int searchInLL(K key, int bucketIndex) {
            LinkedList<Node> ll = buckets[bucketIndex];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        // Rehashing
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            buckets = new LinkedList[oldBuckets.length * 2];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            size = 0;

            for (LinkedList<Node> ll : oldBuckets) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        // PUT
        public void put(K key, V value) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if (dataIndex != -1) {
                buckets[bucketIndex].get(dataIndex).value = value;
            } else {
                buckets[bucketIndex].add(new Node(key, value));
                size++;
            }

            double lambda = (double) size / buckets.length;

            if (lambda > 2.0) {
                rehash();
            }
        }

        // GET
        public V get(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if (dataIndex != -1) {
                return buckets[bucketIndex].get(dataIndex).value;
            }
            return null;
        }

        // CONTAINS KEY
        public boolean containsKey(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);
            return dataIndex != -1;
        }

        // REMOVE
        public V remove(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if (dataIndex != -1) {
                Node node = buckets[bucketIndex].remove(dataIndex);
                size--;
                return node.value;
            }
            return null;
        }

        
        // KEY SET
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }
    }

    // Testing
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("China", 150);
        map.put("USA", 50);

        System.out.println(map.get("India"));
        System.out.println(map.containsKey("China"));

        map.remove("China");

        System.out.println(map.keySet());
        System.out.println(map.size());
    }
}
