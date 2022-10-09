public class AVLtree<K extends Comparable<K>,V> {

    private class Node{
        public K key;
        public V value;
        public Node left,right;
        public int height;

        public Node(K key, V value){
            this.key=key;
            this.value=value;
            left= null;
            right= null;
            height=1;
        }
    }

}
