class SwitchBox {

String brand;
int numberOfSwitches;
String material;
String color;
boolean hasIndicator;
boolean isModular;
double price;

SwitchBox(String b, int n, String m, String c, boolean hi, boolean im, double p){
    brand = b;
    numberOfSwitches = n;
    material = m;
    color = c;
    hasIndicator = hi;
    isModular = im;
    price = p;
}

public void displayDetails(){
    System.out.println(brand);
    System.out.println(numberOfSwitches);
    System.out.println(material);
    System.out.println(color);
    System.out.println(hasIndicator);
    System.out.println(isModular);
    System.out.println(price);
}

}