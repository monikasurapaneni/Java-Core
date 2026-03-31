class Bangle{
	
String color;
String material;
String size;
String design;
String pattern;
String type;
double price;
int quantity;

Bangle(String c, String m, String s, String d, String p, String t, double pr, int q){
    color = c;
    material = m;
    size = s;
    design = d;
    pattern = p;
    type = t;
    price = pr;
    quantity = q;
}

public void displayDetails(){
    System.out.println(color);
    System.out.println(material);
    System.out.println(size);
    System.out.println(design);
    System.out.println(pattern);
    System.out.println(type);
    System.out.println(price);
    System.out.println(quantity);
}

}