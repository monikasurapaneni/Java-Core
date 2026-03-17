class BagExecutor{
 public static void main(String[]args){
 System.out.println("Main Started");
 System.out.println("The Bag Manufacturer is "+ Bag.getManufacturer());
 System.out.println("The Bag Packer  is "+ Bag.getPacker());
 System.out.println("The Bag Item Weight is "+ Bag.getItemWeight());
 System.out.println("The Bag Item Dimensions is "+ Bag.getItemDimensions());
 System.out.println("The Bag  Included Component is "+Bag.getIncludedComponents());
 System.out.println("The Bag  Generic Name is "+ Bag.getGenericName());
 System.out.println("Main Ended");
}
}