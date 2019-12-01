import java.util.*;
public class manager{
		private  HashSet<stockManagement> dm=new  HashSet<stockManagement>();
		
	
		public void addstocks(stockManagement fm){ 
			dm.add(fm);
		}
		 
		public void show(){
			for(stockManagement f:dm){
				
				f.Display();
				
				
			}
			
			
		}
		private HashSet<bill>b=new HashSet<bill>();
		public void billManager(bill b1){
			b.add(b1);
		}
		public void show1(){
			for(bill bm:b){
				bm.Display1();
			}
		}
		public int totalprice(int price_of_product){
	return this.price_of_product*=quantity_of_product;
	
}
		/*public void bill(bill b)
		{
			for(stockManagement s:dm)
			{
				if(s.getname_of_product().equals(b.getname_of_product))
				{
					if(s.getquantity_of_product()>b.getquantity_of_product())
					{
						b.dislay();
					}
				}
			}
		}*/
		
	
}