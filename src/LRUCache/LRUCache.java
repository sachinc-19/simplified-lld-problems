package LRUCache;

import java.util.*;

// LRU Cache implementation using HashMap + Doubly Linked List
// Time Complexity: O(1) for get() and put()
// Space Complexity: O(capacity)

class LRUCache {
    // Node for doubly linked list
    class Node {
        int key, value;
        Node prev, next;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map; // Store key -> Node
    private final Node head, tail; // Dummy nodes to avoid null checks

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        // Initialize dummy head and tail
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    // GET operation: return value if present, else -1
    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);
        // Move accessed node to front (most recently used)
        moveToFront(node);
        return node.value;
    }

    // PUT operation: insert or update key-value
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            // Update existing node
            Node node = map.get(key);
            node.value = value;
            moveToFront(node);
        } else {
            // If cache full, remove LRU (node at tail.prev)
            if (map.size() == capacity) {
                Node lru = tail.prev;
                removeNode(lru);
                map.remove(lru.key);
            }

            // Insert new node
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToFront(newNode);
        }
    }

    // Helper: remove node from list
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Helper: add node right after head
    private void addToFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    // Helper: move node to front (most recently used)
    private void moveToFront(Node node) {
        removeNode(node);
        addToFront(node);
    }
}


