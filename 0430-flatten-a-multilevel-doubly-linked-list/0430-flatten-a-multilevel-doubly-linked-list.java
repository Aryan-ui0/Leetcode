/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return null;
        Node temp = head;
        while(temp!=null){
            if(temp.child!=null){
                Node child = temp.child;
                Node next = temp.next;
                temp.next = child;
                child.prev = temp;

                Node tail = child;
                while(tail.next!=null) tail = tail.next;
                tail.next = next;
                if(next!=null){
                    next.prev = tail;
                }
                temp.child = null;
            }
            
            temp = temp.next;
        }
        return head;
        
    
    

    }
}