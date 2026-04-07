class PlaceNames{
public static void main(String[]args){

Trip ref=new Trip();

boolean added =ref.addplaceName("Goa");
System.out.println(added);

added =ref.addplaceName("Manali");
System.out.println(added);

added =ref.addplaceName("Ooty");
System.out.println(added);

added =ref.addplaceName("Coorg");
System.out.println(added);

added =ref.addplaceName("Mysore");
System.out.println(added);

added =ref.addplaceName("Jaipur");
System.out.println(added);

added =ref.addplaceName("Udaipur");
System.out.println(added);

added =ref.addplaceName("Shimla");
System.out.println(added);

added =ref.addplaceName("Darjeeling");
System.out.println(added);

added =ref.addplaceName("Munnar");
System.out.println(added);

added =ref.addplaceName("Kerala");
System.out.println(added);

added =ref.addplaceName("Andaman Islands");
System.out.println(added);

added =ref.addplaceName("Rishikesh");
System.out.println(added);

ref.getplaceName();

String placeName = ref.getplaceByName("Goa");
System.out.println(placeName+" is available");


boolean update = ref.updateplaceName("Goa","Goa Beach");
System.out.println(update);


boolean delete = ref.deleteplaceName("Goa Beach");
System.out.println(delete);


ref.getplaceName();


}
}
