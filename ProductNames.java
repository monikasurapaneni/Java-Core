class ProductNames{
public static void main(String[]args){

SuperMarket ref=new SuperMarket();

boolean added =ref.addproductName("Amul Milk");
System.out.println(added);

added =ref.addproductName("Maggi Noodles");
System.out.println(added);

added =ref.addproductName("Surf Excel Detergent");
System.out.println(added);

added =ref.addproductName("Colgate Toothpaste");
System.out.println(added);

added =ref.addproductName("Fortune Sunflower Oil");
System.out.println(added);

added =ref.addproductName("Britannia Good Day Biscuits");
System.out.println(added);

added =ref.addproductName("Tata Salt");
System.out.println(added);

added =ref.addproductName("Dove Soap");
System.out.println(added);

ref.getproductName();

String productName = ref.getproductByName("Maggi Noodles");
System.out.println(productName + " is available");

boolean update = ref.updateproductName("Dove Soap", "Lux Soap");
System.out.println(update);

ref.getproductName();

boolean delete = ref.deleteproductName("Lux Soap");
System.out.println(delete);

ref.getproductName();
 }
 
}

