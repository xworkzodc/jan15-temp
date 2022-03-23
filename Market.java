class Market{
	// literals,method,ref,const 
	static int vegetablesAvail=30;
	static int fruitsAvail=100;
	static int fishAvail=10;
	static int flowersAvail=200;
	static String name;
	static String address;
	

   static int itemsAvailable(String itemName)// ref or null
   {
	   if(itemName !=null)//null
	   {
		   System.out.println("item name : "+ itemName);
		   if(itemName=="Vegetable")//false
		   {
			   System.out.println("vegetablesAvail "+vegetablesAvail);
		   }
		   if(itemName=="Fruit")// false 
		   {
			   System.out.println("fruitsAvail "+fruitsAvail);
		   }
		   if(itemName=="Fish")//true
		   {
			   System.out.println("fishAvail "+fishAvail);
			   return fishAvail;
		   }
		   if(itemName=="Flower")//false 
		   {
			   System.out.println("flowersAvail "+flowersAvail);
			   return flowersAvail;
		   }
	   }
	   else{
		   System.out.println("itemName cannot be null");
	   }
	   return 0;
   }   

   static void init(String name,String address)
   {
	   Market.name=name;
	   Market.address=address;
   }
   
   static void details()
   {
	   System.out.println(Market.name);
	   System.out.println(Market.address);
   }
   
   static String name()
   {
	   return Market.name;
   }
   

}