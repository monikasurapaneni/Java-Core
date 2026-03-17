class Dmart{
  static String dmartcategories[]={"Household","Kitchen","Shoes","Kids","Home","Personal Care","Bakery","Vegetables","Diary","Groceries"};
 
  public static void getDmartcategories(){
	  System.out.println("getDmartcategories  invoked");
	  for(String dmartcategorie:dmartcategories){
	  System.out.println(dmartcategorie);}
	  System.out.println("end of getDmartcategories ");
   
    }
}
