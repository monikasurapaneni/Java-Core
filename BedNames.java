class BedNames{
public static void main(String[]args){

Bed ref=new Bed();

boolean added =ref.addbedName("Single Bed");
System.out.println(added);

added =ref.addbedName("Double Bed");
System.out.println(added);

added =ref.addbedName("Queen Size Bed");
System.out.println(added);

added =ref.addbedName("King Size Bed");
System.out.println(added);

added =ref.addbedName("Bunk Bed");
System.out.println(added);

added =ref.addbedName("Sofa Bed");
System.out.println(added);

added =ref.addbedName("Folding Bed");
System.out.println(added);

added =ref.addbedName("Storage Bed");
System.out.println(added);

added =ref.addbedName("Platform Bed");
System.out.println(added);

added =ref.addbedName("Canopy Bed");
System.out.println(added);

ref.getbedName();

String bedName = ref.getbedByName("Queen Size Bed");
System.out.println(bedName+" is available");

boolean update = ref.updatebedName("Queen Size Bed","Luxury Queen Bed");
System.out.println(update);

boolean delete = ref.deletebedName("Luxury Queen Bed");
System.out.println(delete);

ref.getbedName();

}
}