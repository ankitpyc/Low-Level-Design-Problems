package entities;

public interface Repository<K> {
    public K save(K object);
}
