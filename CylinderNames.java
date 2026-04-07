class CylinderNames{
public static void main(String[]args){

Cylinder ref=new Cylinder();

boolean added =ref.addcylinderName("Indane Cylinder");
System.out.println(added);

added =ref.addcylinderName("HP Gas Cylinder");
System.out.println(added);

added =ref.addcylinderName("Bharat Gas Cylinder");
System.out.println(added);

added =ref.addcylinderName("Oxygen Cylinder");
System.out.println(added);

added =ref.addcylinderName("Nitrogen Cylinder");
System.out.println(added);

added =ref.addcylinderName("Helium Cylinder");
System.out.println(added);

added =ref.addcylinderName("CO2 Cylinder");
System.out.println(added);

added =ref.addcylinderName("LPG Cylinder");
System.out.println(added);

added =ref.addcylinderName("Industrial Gas Cylinder");
System.out.println(added);

added =ref.addcylinderName("Medical Oxygen Cylinder");
System.out.println(added);


ref.getcylinderName();

String cylinderName = ref.getcylinderByName("LPG Cylinder");
System.out.println(cylinderName+" is available");

boolean update = ref.updatecylinderName("LPG Cylinder","Domestic LPG Cylinder");
System.out.println(update);

boolean delete = ref.deletecylinderName("Domestic LPG Cylinder");
System.out.println(delete);

ref.getcylinderName();

}
}