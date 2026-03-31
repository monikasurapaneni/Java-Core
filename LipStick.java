class LipStick{
	
String brand;
String color;
String itemForm;
String finishType;
boolean isTransferable;
int itemWeight;
int netQuantity;
String countryOfOrigin;

LipStick(String b, String c, String i, String f, boolean t, int w, int n, String co){
    brand = b;
    color = c;
    itemForm = i;
    finishType = f;
    isTransferable = t;
    itemWeight = w;
    netQuantity = n;
    countryOfOrigin = co;
}

public void displayDetails(){
    System.out.println(brand);
    System.out.println(color);
    System.out.println(itemForm);
    System.out.println(finishType);
    System.out.println(isTransferable);
    System.out.println(itemWeight);
    System.out.println(netQuantity);
    System.out.println(countryOfOrigin);
}

}