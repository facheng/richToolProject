package pers.posse.tool.utils;

import java.io.Serializable;

/**
 *
 * Key/Value pair configuration item.
 * Created by posse on 17-7-31.
 */
public class Pair<K, V> implements Serializable {
    private static final long serialVersionUID = 1L;

    private K key;
    private V value;

    /**
     * Constructs a key/value pair. The constructor should only be called from test classes.
     * @param key The key.
     * @param value The value.
     */
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Returns the key.
     * @return the key.
     */
    public K getKey() {
        return key;
    }

    /**
     * Returns the value.
     * @return The value.
     */
    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key.toString() + '=' + value.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pair other = (Pair) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        if (value == null) {
            if (other.value != null) {
                return false;
            }
        } else if (!value.equals(other.value)) {
            return false;
        }
        return true;
    }
}
