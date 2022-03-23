class MarketRunner{
public static void main(String[] suhas)
{

int itemsReturned=Market.itemsAvailable("Fish");//ref of int
System.out.println("itemsReturned "+itemsReturned);

Market.init("K R Market","KR Market main road Kr Market,560002");

Market.details();

String nm=Market.name();
System.out.println("name "+nm);
}

}