
### put
Description: Method is used to insert a key-value pair into the hash table. It calculates the index using the hash function, and if the chain at that index is null, it creates a new LinkedList to store multiple key-value pairs. It then iterates over the chain to check if the key already exists. If found, it updates the value; otherwise, it adds a new HashNode with the given key and value.

Code:
```java
public void put(K key, V value) {
    int index = hash(key);
    if (chain[index] == null) {
        chain[index] = new LinkedList<HashNode<K, V>>();
    }
    for (HashNode<K, V> node : chain[index]) {
        if (node.getKey().equals(key)) {
            node.setValue(value);
            return;
        }
    }
    chain[index].add(new HashNode<K, V>(key, value));
    size++;
}
```

### get
Description: This function is used to retrieve the value associated with a given key from the hash table. It calculates the index using the hash function and then iterates over the chain at that index to find the matching key. If found, it returns the corresponding value; otherwise, it returns null.

Code:
```java
public V get(K key) {
    int index = hash(key);
    if (chain[index] == null) {
        return null;
    }
    for (HashNode<K, V> node : ch paain[index]) {
        if (node.getKey().equals(key)) {
            return node.getValue();
        }
    }
    return null;
}
```

### remove
Description: This function is used to remove a key-value pair from the hash table. It calculates the index using the hash function and then iterates over the chain at that index to find the matching key. If found, it removes the corresponding HashNode from the chain, decrements the size, and returns the value; otherwise, it returns null.

Code:
```java
public V remove(K key) {
    int index = hash(key);
    if (chain[index] == null) {
        return null;
    }
    for (HashNode<K, V> node : chain[index]) {
        if (node.getKey().equals(key)) {
            chain[index].remove(node);
            size--;
            return node.getValue();
        }
    }
    size--;
    return null;
}
```

### contains
Description: This function checks if the hash table contains a specific value. It iterates over all the chains in the hash table and checks if any HashNode's value matches the given value. If found, it returns true; otherwise, it returns false.

Code:
```java
public boolean contains(V value) {
    for (LinkedList<HashNode<K, V>> list : chain) {
        for (HashNode<K, V> node : list) {
            if (node.getValue().equals(value)) {
                return true;
            }
        }
    }
    return false;
}
```

### hashCode
Description: This function takes 1 param from MyTestingClass 'val' and compiles it to hash by primary moves.
Code:
```java
public int hashCode() {
        return val & 11;
    }
```
