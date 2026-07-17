class MyHashSet {
    class ListNode {
    int key;
    ListNode next;

    ListNode(int key) {
        this.key = key;
        this.next = null;
    }
}
     ListNode[] buckets;
    public MyHashSet() {

        buckets= new ListNode[10000];
        for(int i=0;i<buckets.length;i++){
            buckets[i] = new ListNode(-1);
        }
       
    }
    
    public void add(int key) {
       int bucket = key% buckets.length;
       ListNode curr = buckets[bucket];
       while(curr.next!=null){
        if(curr.next.key==key){
            return;
        }
        else{
            curr=curr.next;
        }
       
         
       }
        curr.next = new ListNode(key);


        
    }
    
    public void remove(int key) {
       int bucket = key% buckets.length;
       ListNode curr = buckets[bucket];
       while(curr.next!=null){
        if(curr.next.key==key){
            curr.next= curr.next.next;
            return;
        }
        else{
            curr=curr.next;
            
        }
       
         
       }
       return;
    }
        
    
    
    public boolean contains(int key) {
                   int bucket = key% buckets.length;
       ListNode curr = buckets[bucket];
       while(curr.next!=null){
        if(curr.next.key==key){
            return true;
        }
        else{
            curr=curr.next;
            
        }
       
         
       }
       return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */