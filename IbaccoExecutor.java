class IbaccoExecutor{
public static void main(String[]args){

Ibacco ref =new Ibacco();

 boolean added= ref.addIcecream("Butterscotch");
 System.out.println(added);
 
 added = ref.addIcecream("Vanilla");
 System.out.println(added);
 
 added = ref.addIcecream("Chocolate");
 System.out.println(added);
 
 added = ref.addIcecream("Rabdi");
 System.out.println(added);
 
 added = ref.addIcecream("Coconut ");
 System.out.println(added);
 
 added = ref.addIcecream("Mango ");
 System.out.println(added);
 
 added = ref.addIcecream("Chiku ");
 System.out.println(added);
 
 added = ref.addIcecream("Strawberry ");
 System.out.println(added);
 
 added = ref.addIcecream("Coockies and Cream ");
 System.out.println(added);
 added = ref.addIcecream("Cream ");
 System.out.println(added);
 
  added = ref.addIcecream(" Mint ");
 System.out.println(added);
 
  ref.getIceCream();
  
  String icecream= ref.geticecreambyname("Black Current");
  System.out.println( icecream + "is available");
  
  
  boolean update=ref.updateIcecream("Vanilla","Novelty Vanilla");
  System.out.println( update);
  
  ref.getIceCream();
 }
}