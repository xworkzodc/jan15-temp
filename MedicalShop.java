class MedicalShop{
	
	public static void main(String[] items)
	{
		// String : Non primitive , Class 
		//JRE = lib(Collection of Classes like String+ WC ) + JVM 
		// 8 Wrapper Classes 
		// byte = Byte.valueOf
		// short = Short.valueOf 
		// int = Integer.valueOf 
		// long= Long.valueOf 
		//float= Float.valueOf 
		//double = Double.valueOf 
		//boolean = Boolean.valueOf 
		//char = Character.valueOf
		// Convert string to respective primitive type 
		// primitive to non-primitive or non-primitive to primitive
		String doloPricePerTenTablets="25.35";
		String himalayaCoughSyrupPrice="80.00";
		
		float doloPrice=Float.valueOf(doloPricePerTenTablets);//arg
		
		double syrupPrice=Double.valueOf(himalayaCoughSyrupPrice);
		//Auto Boxing 
		double totalPrice=doloPrice+syrupPrice;
		
		System.out.println("totalPrice : "+totalPrice);
		
		String payByCard="false";
		
	boolean payby=	Boolean.valueOf(payByCard);
		System.out.println("Pay by Card"+payby);
		
		Boolean unBoxing=payby;
		
	}
	
}