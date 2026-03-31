class Ring {

String materialType;
String gemstoneType;
String ringSize;
String color;
String brand;
String style;
String occasion;
String gender;
String platingType;
double weight;

Ring(String mt, String gt, String rs, String c, String b, String s, String o, String g, String pt, double w){
    materialType = mt;
    gemstoneType = gt;
    ringSize = rs;
    color = c;
    brand = b;
    style = s;
    occasion = o;
    gender = g;
    platingType = pt;
    weight = w;
}

public void displayDetails(){
    System.out.println(materialType);
    System.out.println(gemstoneType);
    System.out.println(ringSize);
    System.out.println(color);
    System.out.println(brand);
    System.out.println(style);
    System.out.println(occasion);
    System.out.println(gender);
    System.out.println(platingType);
    System.out.println(weight);
}

}