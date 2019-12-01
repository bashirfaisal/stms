public class bill{
	
	private String c_name;
	private String c_address;
	private String c_phone;
	private String name_of_product;
	private int quantity_of_product;
	private int price_of_product;
	
	public bill(){}
	
	public bill(String c_name,String c_address,String c_phone,String name_of_product,int quantity_of_product,int price_of_product){
		this.c_name=c_name;
		this.c_address=c_address;
		this.c_phone=c_phone;
		this.name_of_product=name_of_product;
		this.quantity_of_product=quantity_of_product;
		this.price_of_product=price_of_product;
		}
		public void setc_name(String c_name){
			this.c_name=c_name;
		}
		public void setc_address(String c_address){
			this.c_address=c_address;
		}
		public void setc_phone(String c_phone){
			this.c_phone=c_phone;
		}
		public void setname_of_product(String name_of_product){
			this.name_of_product=name_of_product;
		}
		public void setquantity_of_product(int quantity_of_product){
			this.quantity_of_product=quantity_of_product;
		}
		public void setprice_of_product(int price_of_product){
			this.price_of_product=price_of_product;
		}
		public String getc_name(){
			return c_name;
		}
		public String getc_address(){
			return c_address;
		}
		public String getc_phone(){
			return c_phone;
		}
		public String getname_of_product(){
			return name_of_product;
		}
		public int  getquantity_of_product(){
			return quantity_of_product;
		}
		public int getprice_of_product(){
			return price_of_product;
		}
	public void Display1(int amount){
		
		
		System.out.println("  "+c_name);
		System.out.println("  "+c_address);
		System.out.println("  "+c_phone);
		System.out.println("  "+name_of_product);
		System.out.println("  "+quantity_of_product);
		System.out.println("  "+quantity_of_product*amount);
	}
	
	}
	
	
	
	
	
