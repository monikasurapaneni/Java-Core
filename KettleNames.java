class KettleNames{
public static void main(String[]args){

Kettle ref=new Kettle();

boolean added =ref.addkettleName("Electric Kettle");
System.out.println(added);

added =ref.addkettleName("Stainless Steel Kettle");
System.out.println(added);

added =ref.addkettleName("Glass Kettle");
System.out.println(added);

added =ref.addkettleName("Travel Kettle");
System.out.println(added);

added =ref.addkettleName("Cordless Kettle");
System.out.println(added);

added =ref.addkettleName("Tea Kettle");
System.out.println(added);

added =ref.addkettleName("Whistling Kettle");
System.out.println(added);

added =ref.addkettleName("Mini Kettle");
System.out.println(added);

added =ref.addkettleName("Smart Kettle");
System.out.println(added);

added =ref.addkettleName("Portable Kettle");
System.out.println(added);

ref.getkettleName();

String kettleName = ref.getkettleByName("Electric Kettle");
System.out.println(kettleName+" is available");

boolean update = ref.updatekettleName("Electric Kettle","Advanced Electric Kettle");
System.out.println(update);

boolean delete = ref.deletekettleName("Advanced Electric Kettle");
System.out.println(delete);

ref.getkettleName();

}
}