package ua.sergey.kostyniuk;

public interface CacheMap<K,V>  {
	
	public void setTimeLive(long timeLive);

    public long getTimeLive();
	
	public int size();
	
	public boolean isEmpty();
	
	public boolean containsKey(Object key);
	
	public boolean containsValue(Object value);
	
	public V get(Object key);
	
	public V put(K key, V value);
	
	public V remove(Object key);
	
	public void clear();
	

}
