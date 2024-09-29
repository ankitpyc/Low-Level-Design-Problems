import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ConcurrentHashMap<K, V> {

    private Map<K, V> map;
    ReentrantReadWriteLock lock;
    Lock readLock, writeLock;


    public ConcurrentHashMap() {
        map = new HashMap<>();
        lock = new ReentrantReadWriteLock();
        readLock = lock.readLock();
        writeLock = lock.writeLock();

    }

    public void put(K key, V value) {
        try {
            writeLock.lock();
            map.put(key, value);
        } catch (Exception e) {
            System.out.printf("Exception occurred {}%n", e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    public V get(K key) {
        V value = null;
        try {
            readLock.lock();
            value = map.get(key);
        } catch (Exception exception) {
            System.out.printf(String.format("Exception occurred {}%n"), exception.getMessage());
        } finally {
            readLock.unlock();
        }
        return value;
    }


}
