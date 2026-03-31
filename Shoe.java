class Shoe{
	
String brand;
String material;
String closureType;
String heelType;
double price;
String style;
int quantity;
String weight;

Shoe(String b, String m, String ct, String ht, double p, String s, int q, String w){
    brand = b;
    material = m;
    closureType = ct;
    heelType = ht;
    price = p;
    style = s;
    quantity = q;
    weight = w;
}

public void displayDetails(){
    System.out.println(brand);
    System.out.println(material);
    System.out.println(closureType);
    System.out.println(heelType);
    System.out.println(price);
    System.out.println(style);
    System.out.println(quantity);
    System.out.println(weight);
}

}