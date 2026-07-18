class MyHashMap {
    class ListNode{
        int key;
        int value;
        ListNode next;

         ListNode(int key , int value){
        this.key = key;
        this.value= value;
        this.next= null;

    }
    }
   
    ListNode[] buckets;
    public MyHashMap() {

        buckets = new ListNode[10000];
        for(int i =0; i<buckets.length;i++){
            buckets[i] = new ListNode(-1,-1);
        }
        
    }
    
    public void put(int key, int value) {
        int bucket = key% buckets.length;
        ListNode curr = buckets[bucket];
        while(curr.next!=null){
            if(curr.next.key==key){
                curr.next.value = value ;
                return;
            }
            else{
                curr=curr.next;
            }
        }
        curr.next = new ListNode(key,value);
    }
    
    public int get(int key) {
        int bucket = key%buckets.length;
        ListNode curr = buckets[bucket];
        while(curr.next!=null){
            if(curr.next.key ==key){
                return curr.next.value;    }
                else{
                    curr=curr.next;
                }
        }
        return -1;
    }
    
    public void remove(int key) {
        int bucket = key % buckets.length;
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
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */