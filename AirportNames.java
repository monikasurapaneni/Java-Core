class AirportNames{
public static void main(String[]args){
SouthIndia ref=new SouthIndia();

boolean added =ref.addairportName("Kempegowda International Airport (Bangalore)");
System.out.println(added);

added =ref.addairportName("Chennai International Airport");
System.out.println(added);

added =ref.addairportName("Rajiv Gandhi International Airport (Hyderabad)");
System.out.println(added);

added =ref.addairportName("Cochin International Airport");
System.out.println(added);

added =ref.addairportName("Calicut International Airport");
System.out.println(added);

added =ref.addairportName("Trivandrum International Airport");
System.out.println(added);

added =ref.addairportName("Mangalore International Airport");
System.out.println(added);

added =ref.addairportName("Madurai Airport");
System.out.println(added);

added =ref.addairportName("Tiruchirappalli International Airport");
System.out.println(added);

ref.getairportName();

String airportName = ref.getairportByName("Chennai International Airport");
System.out.println(airportName+" is available");

boolean update = ref.updateairportName("Chennai International Airport","Chennai Airport");
System.out.println(update);

boolean delete = ref.deleteairportName("Chennai Airport");
System.out.println(delete);

ref.getairportName();

}
}
