class Sunscreen {

String brand;
int spf;                 
String type;             
String skinType;         
boolean isWaterResistant;
boolean isDermatologistTested;
double price;

Sunscreen(String b, int s, String t, String sk, boolean wr, boolean dt, double p){
    brand = b;
    spf = s;
    type = t;
    skinType = sk;
    isWaterResistant = wr;
    isDermatologistTested = dt;
    price = p;
}

public void displayDetails(){
    System.out.println(brand);
    System.out.println(spf);
    System.out.println(type);
    System.out.println(skinType);
    System.out.println(isWaterResistant);
    System.out.println(isDermatologistTested);
    System.out.println(price);
}

}