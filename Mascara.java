class Mascara {

String brand;
String type;          
String color;         
boolean isWaterproof;
boolean isSmudgeProof;
boolean isLongLasting;
double price;

Mascara(String b, String t, String c, boolean w, boolean s, boolean l, double p){
    brand = b;
    type = t;
    color = c;
    isWaterproof = w;
    isSmudgeProof = s;
    isLongLasting = l;
    price = p;
}

public void displayDetails(){
    System.out.println(brand);
    System.out.println(type);
    System.out.println(color);
    System.out.println(isWaterproof);
    System.out.println(isSmudgeProof);
    System.out.println(isLongLasting);
    System.out.println(price);
}

}