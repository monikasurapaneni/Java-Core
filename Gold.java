class Gold {

String brand;
String type;          
double weight;       
int purity;           
boolean isHallmarked;
double price;
String countryOfOrigin;

Gold(String b, String t, double w, int p, boolean h, double pr, String co){
    brand = b;
    type = t;
    weight = w;
    purity = p;
    isHallmarked = h;
    price = pr;
    countryOfOrigin = co;
}

public void displayDetails(){
    System.out.println(brand);
    System.out.println(type);
    System.out.println(weight);
    System.out.println(purity);
    System.out.println(isHallmarked);
    System.out.println(price);
    System.out.println(countryOfOrigin);
}

}