class Ingredients{
public static void main(String[]args){

Maggi ref=new Maggi();

boolean added =ref.addingredient("Wheat Flour ");
System.out.println(added);

added =ref.addingredient("Edible Vegetable Oil");
System.out.println(added);

added =ref.addingredient("Salt");
System.out.println(added);

added =ref.addingredient("Sugar");
System.out.println(added);

added =ref.addingredient("Spices & Condiments");
System.out.println(added);

added =ref.addingredient("Flavor Enhancers");
System.out.println(added);

added =ref.addingredient("Hydrolyzed Vegetable Protein");
System.out.println(added);

added =ref.addingredient("Dehydrated Vegetables");
System.out.println(added);

added =ref.addingredient("Garlic Powder");
System.out.println(added);

added =ref.addingredient("Onion Powder");
System.out.println(added);

added =ref.addingredient("Turmeric");
System.out.println(added);

added =ref.addingredient("Chili Powder");
System.out.println(added);
ref.getingredient();

String ingredient = ref.getingredientByName("Salt");
System.out.println(ingredient+" is available");


boolean update = ref.updateingredient("Salt","Iodized Salt");
System.out.println(update);


boolean delete = ref.deleteingredient("Iodized Salt");
System.out.println(delete);


ref.getingredient();

}
}
