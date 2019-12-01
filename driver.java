import java.util.*;
public class driver{
		
		public static void main(String args[]){
			Scanner cd=new Scanner(System.in);
			manager shopManager=new manager();
			String k;
			/*do{
				
			Customers cr=new Customers();
			cr.addCustomer();
			shopManager.addCustomer(cr);
			System.out.println("Do you want add more customer ? if yes press y otherwiswse press any key : ");
			k=cd.next();
			}while(k.equals("y"));*/
		
	        
			
			
			do{
			
			stockManagement fm=new stockManagement();
			fm.addstock();
			shopManager.addstocks(fm);
			System.out.println("Do you want add more stock ? if yes press y otherwiswse press any key: ");
			k=cd.next();
			}while(k.equals("y"));
			shopManager.show();
					
	}
	public void billManager(){
	Scanner c_inp=new Scanner(System.in);
	System.out.println("Enter Customer Name: ");
	c_name=c_inp.nextLine();
	System.out.println("Enter Customer Address: ");
	c_address=c_inp.nextLine();
	System.out.println("Enter Customer Phone: ");
	c_phone=c_inp.next();
	System.out.println("Enter Product Name : ");
	name_of_product=c_inp.nextLine();
	System.out.println("Enter product Quantity : ");
	quantity_of_product=c_inp.nextInt();		
	}
	public void addstock(){
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Product Name : ");
	name_of_product=input.nextLine();
	System.out.println("Enter product Quantity : ");
	quantity_of_product=input.nextInt();
	System.out.println("Enter price of single product : ");
	price_of_product=input.nextInt();
}
		}
		
	
