import java.util.*;
public class Customers{
//Atributes of Customers
public String c_name;
public String c_address;
public String c_phone;
public String c_email;
//Constructor
public Customers(){}
public Customers(String c_name,String c_address,String c_phone,String c_email){
	this.c_name=c_name;
	this.c_address=c_address;
	this.c_phone=c_phone;
	this.c_email=c_email;	
}
//Taking Input from User
public void addCustomer(){
	
	Scanner c_inp=new Scanner(System.in);
	System.out.println("Enter Customer Name: ");
	c_name=c_inp.nextLine();
	System.out.println("Enter Customer Address: ");
	c_address=c_inp.nextLine();
	System.out.println("Enter Customer Phone: ");
	c_phone=c_inp.next();
	System.out.println("Enter Customer E-mail: ");
	c_email=c_inp.next();	
}
//Display the Attributes
public void Display(){
	System.out.println(c_name+"\n"+c_address+"\n"+c_phone+"\n"+c_email);
}
}