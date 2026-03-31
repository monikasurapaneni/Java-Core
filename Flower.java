class Flower {

String name;
String color;
String fragrance;
int numberOfPetals;
boolean isSeasonal;
double price;
String countryOfOrigin;

Flower(String n, String c, String f, int p, boolean s, double pr, String co){
    name = n;
    color = c;
    fragrance = f;
    numberOfPetals = p;
    isSeasonal = s;
    price = pr;
    countryOfOrigin = co;
}

public void displayDetails(){
    System.out.println(name);
    System.out.println(color);
    System.out.println(fragrance);
    System.out.println(numberOfPetals);
    System.out.println(isSeasonal);
    System.out.println(price);
    System.out.println(countryOfOrigin);
}

}