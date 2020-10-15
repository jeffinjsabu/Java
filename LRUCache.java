class LRUCache {
 Map<Integer,Integer> map;
    int capacity;
    Queue<Integer> q = new LinkedList<>();
    public LRUCache(int N) {
       map = new HashMap<>();
       capacity = N;
    }
    
  
    public int get(int x) {
    
       if(map.containsKey(x)) {
            q.remove(x);
            q.add(x);
            return map.get(x);
       }
       return -1;
    }
    public void set(int x, int y) {
       if(map.containsKey(x)) {
            q.remove(x);
            q.add(x);
            map.put(x,y);
       } else {
           if(map.size()==capacity){
               map.remove(q.remove());
           }
           q.add(x);
           map.put(x,y);
       }

    }
}
