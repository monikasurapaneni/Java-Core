class Medicine {

String name;
String brand;
String type;          
int dosageMg;
boolean isPrescriptionRequired;
double price;
String expiryDate;

Medicine(String n, String b, String t, int d, boolean pr, double p, String e){
    name = n;
    brand = b;
    type = t;
    dosageMg = d;
    isPrescriptionRequired = pr;
    price = p;
    expiryDate = e;
}

public void displayDetails(){
    System.out.println(name);
    System.out.println(brand);
    System.out.println(type);
    System.out.println(dosageMg);
    System.out.println(isPrescriptionRequired);
    System.out.println(price);
    System.out.println(expiryDate);
}

}