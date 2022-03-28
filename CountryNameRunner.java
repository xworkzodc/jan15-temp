class CountryNameRunner{


public static void main(String[] values)
{
// String stringCountryName="78";
 
 
 CountryName countryName=CountryName.INDIA;
 
 System.out.println(countryName);
 
 // values as Implicit Method 
 CountryName[] countryNames=CountryName.values();
 
 
 for(int index=0;index<countryNames.length;index++)
 {
	 CountryName temp= countryNames[index];
	 System.out.println(temp);
	 
 }
 
 
  
}


}