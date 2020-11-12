package com.comunus.util;

import java.util.Map;

import java.util.TreeMap;

public class Cache {
 
	private static Cache instance;
	
	private static final int CLEAN_UP_PERIOD_IN_SEC=6;
	
	private Map<Integer, UserData> dataMap;
	public Map<Integer, UserData> getDataMap() {
		return dataMap;
	}
	
	public void setDataMap(Map<Integer, UserData> dataMap) {
		this.dataMap = dataMap;
	}
	
	private Cache() {
		dataMap=new TreeMap<Integer, UserData>();
		
		Thread cleanerThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(CLEAN_UP_PERIOD_IN_SEC * 1000);
                    dataMap.clear();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        cleanerThread.setDaemon(true);
        cleanerThread.start();
	}
	public static Cache getInstance()
	{
		if(instance == null)
		{
			synchronized (UserData.class) {
				 if(instance  ==null)
				 {
					 instance=new Cache();
				 }
			}
		}
	   return instance;
	}
	
	public void put(Integer key,UserData value)
	{
		dataMap.put(key, value);
	}
	public UserData get(Integer key)
	{
		return dataMap.get(key);
	}
	
	public boolean containsKey(Integer key)
	{
		return dataMap.containsKey(key);
	}
}
