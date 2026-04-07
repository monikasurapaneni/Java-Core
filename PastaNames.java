class PastaNames{
public static void main(String[]args){

Pasta ref=new Pasta();

boolean added =ref.addpastaName("White Sauce Pasta");
System.out.println(added);

added =ref.addpastaName("Red Sauce Pasta");
System.out.println(added);

added =ref.addpastaName("Penne Pasta");
System.out.println(added);

added =ref.addpastaName("Spaghetti");
System.out.println(added);

added =ref.addpastaName("Macaroni");
System.out.println(added);

added =ref.addpastaName("Cheese Pasta");
System.out.println(added);

added =ref.addpastaName("Veg Alfredo Pasta");
System.out.println(added);

added =ref.addpastaName("Arrabbiata Pasta");
System.out.println(added);

added =ref.addpastaName("Lasagna Pasta");
System.out.println(added);

added =ref.addpastaName("Baked Pasta");
System.out.println(added);

ref.getpastaName();


String pastaName = ref.getpastaByName("Spaghetti");
System.out.println(pastaName+" is available");

boolean update = ref.updatepastaName("Spaghetti","Italian Spaghetti");
System.out.println(update);

boolean delete = ref.deletepastaName("Italian Spaghetti");
System.out.println(delete);

ref.getpastaName();

}
}