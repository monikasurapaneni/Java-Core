class SteelNames{
public static void main(String[]args){

Steel ref=new Steel();

boolean added =ref.addsteelType("Carbon Steel");
System.out.println(added);

added =ref.addsteelType("Alloy Steel");
System.out.println(added);

added =ref.addsteelType("Stainless Steel");
System.out.println(added);

added =ref.addsteelType("Tool Steel");
System.out.println(added);

added =ref.addsteelType("Mild Steel");
System.out.println(added);

added =ref.addsteelType("High Speed Steel");
System.out.println(added);

added =ref.addsteelType("Spring Steel");
System.out.println(added);

added =ref.addsteelType("Galvanized Steel");
System.out.println(added);

added =ref.addsteelType("Structural Steel");
System.out.println(added);

added =ref.addsteelType("Rebar Steel");
System.out.println(added);

ref.getsteelType();

String steelType = ref.getsteelByName("Stainless Steel");
System.out.println(steelType+" is available");

boolean update = ref.updatesteelType("Stainless Steel","Premium Stainless Steel");
System.out.println(update);

boolean delete = ref.deletesteelType("Premium Stainless Steel");
System.out.println(delete);

ref.getsteelType();

}
}