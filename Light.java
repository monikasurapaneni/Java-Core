class Light {

String type;
String color;
String brand;
String powerSource;
String roomType;
String style;
String material;
String switchType;
boolean rechargeable;
double wattage;

Light(String t, String c, String b, String p, String r, String s, String m, String sw, boolean re, double w){
    type = t;
    color = c;
    brand = b;
    powerSource = p;
    roomType = r;
    style = s;
    material = m;
    switchType = sw;
    rechargeable = re;
    wattage = w;
}

public void displayDetails(){
    System.out.println(type);
    System.out.println(color);
    System.out.println(brand);
    System.out.println(powerSource);
    System.out.println(roomType);
    System.out.println(style);
    System.out.println(material);
    System.out.println(switchType);
    System.out.println(rechargeable);
    System.out.println(wattage);
}

}