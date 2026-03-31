class Vase {

String materialType;
String color;
String brand;
String shape;
String design;
String usage;
String roomType;
String finishType;
boolean handmade;
double height;

Vase(String mt, String c, String b, String s, String d, String u, String r, String f, boolean h, double ht){
    materialType = mt;
    color = c;
    brand = b;
    shape = s;
    design = d;
    usage = u;
    roomType = r;
    finishType = f;
    handmade = h;
    height = ht;
}

public void displayDetails(){
    System.out.println(materialType);
    System.out.println(color);
    System.out.println(brand);
    System.out.println(shape);
    System.out.println(design);
    System.out.println(usage);
    System.out.println(roomType);
    System.out.println(finishType);
    System.out.println(handmade);
    System.out.println(height);
}

}