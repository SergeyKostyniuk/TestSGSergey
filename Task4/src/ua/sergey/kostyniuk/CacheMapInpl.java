package ua.sergey.kostyniuk;

import java.util.HashMap;
import java.util.*;

public class CacheMapInpl <K, V> implements CacheMap<K, V> {
	
	private long timeLive;
    private HashMap<K, V> map = new HashMap<>();  
    private TreeMap<Long, LinkedList<K>> zberigana = new TreeMap<>();
    	
	public void setTimeLive(long timeLive) {
		this.timeLive = timeLive;		
	}

	public long getTimeLive() {
		return timeLive;
	}
	
	public int size() {
		clearExpired();
        return map.size();
	}
	
	public V put(K key, V value) {
        clearExpired();
        if (key == null || value == null) throw new IllegalArgumentException("Nor key or value can be null");
        addKey(key);
        return map.put(key, value);
    }
	
	public void clearExpired() {
		Set<K> removalSet = new HashSet<>();
        NavigableMap<Long, LinkedList<K>> expiredMap = zberigana.subMap(0L, true, Chas.getTime(), true);
        for (List<K> keysList : expiredMap.values()) {
            removalSet.addAll(keysList);
        }
        for (K removeKey : removalSet) {
            map.remove(removeKey);
        }
        for (Long key : expiredMap.keySet()) {
        	zberigana.remove(key);
        }	
	}
	
	public boolean isEmpty() {
		clearExpired();
        return map.isEmpty();
	}
	
	public boolean containsKey(Object key) {
		clearExpired();
        return map.containsKey(key);
	}
	
	public boolean containsValue(Object value) {
		clearExpired();
        return map.containsValue(value);
	}
	
	public V get(Object key) {
		clearExpired();
        return map.get(key);
	}
		
	public V remove(Object key) {
		clearExpired();
        return map.remove(key);
	}
	
	public void clear() {
		clearExpired();
        map.clear();
	}
	
	 private void addKey(K key) {
	        LinkedList<K> keyList = zberigana.get(Chas.getTime() + getTimeLive());
	        if (keyList == null) {
	            keyList = new LinkedList<>();
	            zberigana.put(Chas.getTime() + getTimeLive(), keyList);
	        }
	        if (!keyList.contains(key)) keyList.add(key);
	    }

}
