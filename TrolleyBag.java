class TrolleyBag {

String brand;
String size;              
String color;
int numberOfWheels;
boolean isExpandable;
boolean hasLock;
double price;

TrolleyBag(String b, String s, String c, int n, boolean e, boolean l, double p){
    brand = b;
    size = s;
    color = c;
    numberOfWheels = n;
    isExpandable = e;
    hasLock = l;
    price = p;
}

public void displayDetails(){
    System.out.println(brand);
    System.out.println(size);
    System.out.println(color);
    System.out.println(numberOfWheels);
    System.out.println(isExpandable);
    System.out.println(hasLock);
    System.out.println(price);
}

}