class Node {
    int val;
    int del;
    public Node(int val,int del)
    {
        this.val = val;
        this.del = del;
    }
}

class StockSpanner {
    Stack<Node> st;
    public StockSpanner() {
      st = new Stack<>();  
    }
    
    public int next(int price) {
       int count =0;
        while(!st.isEmpty() && st.peek().val <= price)
        {
            count+= st.peek().del;
            st.pop();
        }
        count++;
        st.push(new Node(price,count));
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */