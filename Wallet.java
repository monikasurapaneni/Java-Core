class Wallet{
	
String brand;
String material;
String color;
String type;
String closureType;
int numberOfCompartments;
double price;
int quantity;

Wallet(String b, String m, String c, String t, String ct, int n, double p, int q){
    brand = b;
    material = m;
    color = c;
    type = t;
    closureType = ct;
    numberOfCompartments = n;
    price = p;
    quantity = q;
}

public void displayDetails(){
    System.out.println(brand);
    System.out.println(material);
    System.out.println(color);
    System.out.println(type);
    System.out.println(closureType);
    System.out.println(numberOfCompartments);
    System.out.println(price);
    System.out.println(quantity);
}

}