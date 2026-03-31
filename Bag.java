class Bag {

String brand;
String type;          
String color;
boolean isWaterproof;
boolean hasLaptopCompartment;
boolean isLightWeight;
double price;

Bag(String b, String t, String c, boolean w, boolean l, boolean lw, double p){
    brand = b;
    type = t;
    color = c;
    isWaterproof = w;
    hasLaptopCompartment = l;
    isLightWeight = lw;
    price = p;
}

public void displayDetails(){
    System.out.println(brand);
    System.out.println(type);
    System.out.println(color);
    System.out.println(isWaterproof);
    System.out.println(hasLaptopCompartment);
    System.out.println(isLightWeight);
    System.out.println(price);
}

}