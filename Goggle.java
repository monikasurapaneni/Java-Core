class Goggle{
	
String brand;
String frameColor;
String lensColor;
String frameMaterial;
String lensType;
String shape;
double price;
int quantity;

Goggle(String b, String fc, String lc, String fm, String lt, String s, double p, int q){
    brand = b;
    frameColor = fc;
    lensColor = lc;
    frameMaterial = fm;
    lensType = lt;
    shape = s;
    price = p;
    quantity = q;
}

public void displayDetails(){
    System.out.println(brand);
    System.out.println(frameColor);
    System.out.println(lensColor);
    System.out.println(frameMaterial);
    System.out.println(lensType);
    System.out.println(shape);
    System.out.println(price);
    System.out.println(quantity);
}

}