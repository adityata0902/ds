package com.sunbeam.hashtable;

public class Hashtable {

	public static class Entry{
		int key;
		String value;
		public Entry(int k,String v)
		{
			key=k;
			value=v;
		}

	}
	private final int Size;
	private Entry arr[];
	
	public Hashtable(int size)
	{
		Size=size;
		arr=new Entry[size];
		
	}
	public int h(int k)
	{
	  return k%Size;
	}
	public int h(int k,int i)
	{
		return (h(k)+i)%Size;
	}
	public void put(int key,String value)
	{
		int slot=h(key);
		int i=1;
          
		while(arr[slot]!=null)	
		{
			if(key==arr[slot].key)
			{
				arr[slot].value=value;
				return;
			}
			slot=h(key,i++);
			
		}
	}
	public String get(int key)
	{
		int slot=h(key);
		int i=1;
		while(arr[slot]!=null)
		{
			if(key==arr[slot].key)
			{
				return arr[slot].value;
			}
			slot=h(key,i++);
			
		}
		return null;
	}
	
	
	
	

}
