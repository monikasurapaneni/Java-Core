class Accessories{

public static void main(String[]args){

PetShop ref=new PetShop();

boolean added =ref.addaccessorie("Dog Collar");
System.out.println(added);

added =ref.addaccessorie("Dog Leash");
System.out.println(added);

added =ref.addaccessorie("Pet Food Bowl");
System.out.println(added);

added =ref.addaccessorie("Water Dispenser");
System.out.println(added);

added =ref.addaccessorie("Pet Shampoo");
System.out.println(added);

added =ref.addaccessorie("Pet Comb");
System.out.println(added);

added =ref.addaccessorie("Pet Brush");
System.out.println(added);

added =ref.addaccessorie("Dog Toy Ball");
System.out.println(added);

added =ref.addaccessorie("Chew Toys");
System.out.println(added);

added =ref.addaccessorie("Pet Bed");
System.out.println(added);

added =ref.addaccessorie("Cat Litter Box");
System.out.println(added);

added =ref.addaccessorie("Litter Scoop");
System.out.println(added);

added =ref.addaccessorie("Pet Carrier Bag");
System.out.println(added);

added =ref.addaccessorie("Pet Clothes");
System.out.println(added);

added =ref.addaccessorie("Scratch Post");
System.out.println(added);

added =ref.addaccessorie("Pet Nail Clipper");
System.out.println(added);

ref.getaccessorie();


String accessorie = ref.getaccessorieByName("Pet Bed");
System.out.println(accessorie+" is available");


boolean update = ref.updateaccessorie("Pet Bed","Luxury Pet Bed");
System.out.println(update);


boolean delete = ref.deleteaccessorie("Luxury Pet Bed");
System.out.println(delete);


ref.getaccessorie();

}
}