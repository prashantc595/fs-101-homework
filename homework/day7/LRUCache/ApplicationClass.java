package com.xebia.day7.LRUCache;

import java.util.Map.Entry;
import java.util.Set;

public class ApplicationClass {

	public static void main(String[] args) {
		
		Employee e1=new Employee(101, "ABC", 10000);
		Employee e2=new Employee(201, "DEF", 20000);
		Employee e3=new Employee(301, "GHI", 30000);
		Employee e4=new Employee(401, "PQR", 40000);
		Employee e5=new Employee(501, "XYZ", 50000);
		
		Department d1 = new Department(1, "Finance");
		Department d2 = new Department(2, "Development");
		
		LRUCache<Employee, Department> cache= LRUCache.newInstance(3); // passing size as 3.
		
		cache.put(e1, d1);
		cache.put(e2, d1);
		cache.put(e3, d1);
		
		cache.put(e4, d2);
		cache.put(e5, d2);
		
		/* Even adding 5 objects, we will get 3 entries in cache.
		Below logic will print third, fouth and fifth etry. First, Second entry will get removed as it will follow FIFO behaviour.
		*/
		
		Set<Entry<Employee,Department>> entrySet=cache.entrySet();
		for(Entry<Employee,Department> entry:entrySet)
			{
				Employee employee=entry.getKey();
				Department department=entry.getValue();
				System.out.println(employee);
				System.out.println(department);
			}

	}

}
