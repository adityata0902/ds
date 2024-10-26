package com.sunbeam.hashtable;

public class HashtableOpenAddressing {

	public static void main(String[] args) {
     Hashtable h1=new Hashtable(10);
     h1.put(8,"v1");
     h1.put(3,"v1");
     h1.put(10,"v1");
     h1.put(4,"v1");
     h1.put(6,"v1");
     h1.put(13,"v1");
     h1.put(23,"v1");
     h1.put(26,"v1");
     h1.put(13,"updated");
     String ret=h1.get(4);
     if(ret==null)
    	 System.out.println("key is not found");
     else
    	 System.out.println("key is found value:"+ret);
	}

}
