class LRUCache {
    
    public class Node
    {
        int key;
        int val;
        Node next;
        Node prev;
        
        Node(int key,int val)
        {
            this.key=key;
            this.val=val;
        }
     }
    
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    
    int cap;
    
    HashMap<Integer,Node> m = new HashMap<>();

    public LRUCache(int capacity) { 
        cap=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        
        if(m.containsKey(key))
        {
            Node resNode = m.get(key);
            int res = resNode.val;
            m.remove(key);
            deleteNode(resNode);
            addNode(resNode);
            m.put(key,head.next);
            return res;
        }
        
        return -1;
    }
    
    public void addNode(Node node)
    {
        node.next=head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head; 
    }
    
    public void deleteNode(Node node)
    {
       node.prev.next = node.next;
       node.next.prev = node.prev;
    }
    
    public void put(int key, int value) {
       
        if(m.containsKey(key))
        {
            Node existingNode = m.get(key);
            m.remove(key);
            deleteNode(existingNode);
        }
        
        if(m.size()==cap)
        {
            m.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        
        addNode(new Node(key,value));
        m.put(key,head.next);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */