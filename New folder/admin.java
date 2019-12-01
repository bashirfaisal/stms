import java.util.*;
public class admin{
	public static void main(String args[]){
		
		//new HashMap<String, Object> store;
		HashMap<String,HashMap>store=new HashMap<>(); 
		HashMap<String, Object> items=new HashMap<>();
		items.put("name","sugar");
		items.put("price of single product",25);
		items.put("quantiy",5);
		store.put("sugar",items);
		System.out.println(store);
		
		items.put("name","oil");
		items.put("price of single product",1000);
		items.put("quantiy",10);
		store.put("sugar",items);
		System.out.println(store);
		
		items.put("name","Soap");
		items.put("price of single product",50);
		items.put("quantiy",25);
		store.put("sugar",items);
		System.out.println(store);
		
		items.put("name","tea");
		items.put("price of single product",200);
		items.put("quantiy",500);
		store.put("sugar",items);
		System.out.println(store);
		
	
	
	}

}