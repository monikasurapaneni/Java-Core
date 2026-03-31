class Anklet {

String materialType;
String designType;
String color;
String brand;
String style;
String occasion;
String gender;
String closureType;
boolean adjustable;
double weight;

Anklet(String mt, String dt, String c, String b, String s, String o, String g, String ct, boolean a, double w){
    materialType = mt;
    designType = dt;
    color = c;
    brand = b;
    style = s;
    occasion = o;
    gender = g;
    closureType = ct;
    adjustable = a;
    weight = w;
}

public void displayDetails(){
    System.out.println(materialType);
    System.out.println(designType);
    System.out.println(color);
    System.out.println(brand);
    System.out.println(style);
    System.out.println(occasion);
    System.out.println(gender);
    System.out.println(closureType);
    System.out.println(adjustable);
    System.out.println(weight);
}

}