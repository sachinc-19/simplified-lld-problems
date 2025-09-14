package LRUCache;

// Driver code for testing
class Main {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2); // Capacity = 2

        cache.put(1, 10); // Cache = {1=10}
        cache.put(2, 20); // Cache = {2=20, 1=10}
        System.out.println(cache.get(1)); // returns 10, Cache = {1=10, 2=20}

        cache.put(3, 30); // LRU key=2 removed, Cache = {3=30, 1=10}
        System.out.println(cache.get(2)); // returns -1 (not found)

        cache.put(4, 40); // LRU key=1 removed, Cache = {4=40, 3=30}
        System.out.println(cache.get(1)); // returns -1 (not found)
        System.out.println(cache.get(3)); // returns 30
        System.out.println(cache.get(4)); // returns 40
    }
}

