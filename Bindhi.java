class Bindhi{
	
String color;
String shape;
String size;
String material;
String pattern;
String design;
String occasion;
double price;

Bindhi(String c, String s, String sz, String m, String p, String d, String o, double pr){
    color = c;
    shape = s;
    size = sz;
    material = m;
    pattern = p;
    design = d;
    occasion = o;
    price = pr;
}

public void displayDetails(){
    System.out.println(color);
    System.out.println(shape);
    System.out.println(size);
    System.out.println(material);
    System.out.println(pattern);
    System.out.println(design);
    System.out.println(occasion);
    System.out.println(price);
}

}