class FuelNames{
public static void main(String[]args){

Petroleum ref=new Petroleum();

boolean added =ref.addfuelName("Petrol");
System.out.println(added);

added =ref.addfuelName("Diesel");
System.out.println(added);

added =ref.addfuelName("Kerosene");
System.out.println(added);

added =ref.addfuelName("CNG");
System.out.println(added);

added =ref.addfuelName("LPG");
System.out.println(added);

added =ref.addfuelName("Aviation Fuel");
System.out.println(added);

added =ref.addfuelName("Fuel Oil");
System.out.println(added);

added =ref.addfuelName("Bio Diesel");
System.out.println(added);

added =ref.addfuelName("Ethanol");
System.out.println(added);

added =ref.addfuelName("Compressed Hydrogen");
System.out.println(added);

ref.getfuelName();

String fuelName = ref.getfuelByName("Petrol");
System.out.println(fuelName+" is available");

boolean update = ref.updatefuelName("Petrol","Premium Petrol");
System.out.println(update);

boolean delete = ref.deletefuelName("Premium Petrol");
System.out.println(delete);

ref.getfuelName();

}
}