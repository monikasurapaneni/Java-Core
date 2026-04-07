class CategoryNames{
public static void main(String[]args){

Amazon ref=new Amazon();

boolean added =ref.addcategoryName("Electronics");
System.out.println(added);

added =ref.addcategoryName("Clothing & Fashion");
System.out.println(added);

added =ref.addcategoryName("Home & Kitchen");
System.out.println(added);

added =ref.addcategoryName("Beauty & Personal Care");
System.out.println(added);

added =ref.addcategoryName("Books");
System.out.println(added);

added =ref.addcategoryName("Toys & Games");
System.out.println(added);

added =ref.addcategoryName("Grocery & Gourmet Foods");
System.out.println(added);

added =ref.addcategoryName("Sports & Fitness");
System.out.println(added);

added =ref.addcategoryName("Automotive");
System.out.println(added);

added =ref.addcategoryName("Health & Household");
System.out.println(added);

added =ref.addcategoryName("Garden & Outdoor");
System.out.println(added);

added =ref.addcategoryName("Musical Instruments");
System.out.println(added);

added =ref.addcategoryName("Industrial & Scientific");
System.out.println(added);

added =ref.addcategoryName("Office Products");
System.out.println(added);

added =ref.addcategoryName("Pet Supplies");
System.out.println(added);

added =ref.addcategoryName("Baby Products");
System.out.println(added);

added =ref.addcategoryName("Furniture");
System.out.println(added);

added =ref.addcategoryName("Footwear");
System.out.println(added);

added =ref.addcategoryName("Watches");
System.out.println(added);

added =ref.addcategoryName("Computers & Accessories");
System.out.println(added);

added =ref.addcategoryName("Mobiles & Accessories");
System.out.println(added);

ref.getcategoryName();

String categoryName = ref.getcategoryByName("Electronics");
System.out.println(categoryName+" is available");

boolean update = ref.updatecategoryName("Electronics","Electronic Devices");
System.out.println(update);

boolean delete = ref.deletecategoryName("Electronic Devices");
System.out.println(delete);

ref.getcategoryName();
}
}