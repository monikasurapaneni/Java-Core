class Jeans {

String brand;
String fitType;        
String color;
int waistSize;
boolean isStretchable;
boolean isFaded;
double price;

Jeans(String b, String f, String c, int w, boolean s, boolean fd, double p){
    brand = b;
    fitType = f;
    color = c;
    waistSize = w;
    isStretchable = s;
    isFaded = fd;
    price = p;
}

public void displayDetails(){
    System.out.println(brand);
    System.out.println(fitType);
    System.out.println(color);
    System.out.println(waistSize);
    System.out.println(isStretchable);
    System.out.println(isFaded);
    System.out.println(price);
}

}