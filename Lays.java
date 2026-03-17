class Lays{
public static void main(String[]args){

String ingridients[] = {"Potatoes","Vegetable Oil","Salt","Sunflower Oil","Corn Oil","Salt","Sour Cream","Onion","sugar","tomato powder","onion powder","garlic powder"};

System.out.println(" The list of all ingridients used in Lays are:");
System.out.println(ingridients[0] +" \n "+ ingridients[1] + " \n " + ingridients[2] + " \n" + ingridients[3]+ "\n " + ingridients[4]+ " \n" + ingridients[5] + "/n" + ingridients[6] + "\n" + ingridients[7] + "\n" + ingridients[8] + " \n" + ingridients[9] + " \n" + ingridients[10] + " \n" + ingridients[11]); 

for(String ingridient:ingridients){
		System.out.println(ingridient);
}
}