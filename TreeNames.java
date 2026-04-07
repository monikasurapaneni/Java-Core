class TreeNames{
public static void main(String[]args){

Tree ref=new Tree();

boolean added =ref.addtreeName("Neem");
System.out.println(added);

added =ref.addtreeName("Mango");
System.out.println(added);

added =ref.addtreeName("Banyan");
System.out.println(added);

added =ref.addtreeName("Peepal");
System.out.println(added);

added =ref.addtreeName("Coconut");
System.out.println(added);

added =ref.addtreeName("Apple Tree");
System.out.println(added);

added =ref.addtreeName("Teak");
System.out.println(added);

added =ref.addtreeName("Eucalyptus");
System.out.println(added);

added =ref.addtreeName("Guava");
System.out.println(added);

added =ref.addtreeName("Cherry Blossom");
System.out.println(added);

ref.gettreeName();

String treeName = ref.gettreeByName("Mango");
System.out.println(treeName+" is available");

boolean update = ref.updatetreeName("Mango","Mango Tree");
System.out.println(update);

boolean delete = ref.deletetreeName("Mango Tree");
System.out.println(delete);

ref.gettreeName();

}
}