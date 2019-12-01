public class stock{

	private String name_of_product;
	private int quantity_of_product;
	private int price_of_product;
	
	public stock(){};
	public stock(String name_of_product,int quantity_of_product,int price_of_product){
		this.name_of_product=name_of_product;
		this.quantity_of_product=quantity_of_product;
		this.price_of_product=price_of_product;
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
		public String getname_of_product(){
			return name_of_product;
		}
		public int getquantity_of_product(){
			return quantity_of_product;
		}
		public int getprice_of_product(){
			return price_of_product;
		}
		public void Display(){
			System.out.println("name_of_product : "+name_of_product+"\nquantity_of_product :"+quantity_of_product+"\nprice_of_product :"+price_of_product);
		
			
		}

}