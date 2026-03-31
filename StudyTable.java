class StudyTable {

String materialType;
String color;
String brand;
String shape;
String storageType;
String usage;
String roomType;
String finishType;
boolean foldable;
double price;

StudyTable(String mt, String c, String b, String s, String st, String u, String r, String f, boolean fo, double p){
    materialType = mt;
    color = c;
    brand = b;
    shape = s;
    storageType = st;
    usage = u;
    roomType = r;
    finishType = f;
    foldable = fo;
    price = p;
}

public void displayDetails(){
    System.out.println(materialType);
    System.out.println(color);
    System.out.println(brand);
    System.out.println(shape);
    System.out.println(storageType);
    System.out.println(usage);
    System.out.println(roomType);
    System.out.println(finishType);
    System.out.println(foldable);
    System.out.println(price);
}

}