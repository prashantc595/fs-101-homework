package com.xebia.day7.LRUCache;

import java.util.*;

@SuppressWarnings("serial")
public class LRUCache<K,V> extends LinkedHashMap<K, V> {
	
	private int size;

	public LRUCache(int size) {
		super(size, 0.75f, true);
		this.size = size;
	}
	

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size()>size;
	}
	
	
	// Client has to pass the size
	public static <K,V> LRUCache<K, V> newInstance(int size)
	{
		return new LRUCache<K, V>(size);
	}
	
	
	
}
