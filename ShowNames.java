class ShowNames{
public static void main(String[]args){

Hungama ref=new Hungama();

boolean added =ref.addshowName("Chhota Bheem");
System.out.println(added);

added =ref.addshowName("Motu Patlu");
System.out.println(added);

added =ref.addshowName("Doraemon");
System.out.println(added);

added =ref.addshowName("Shinchan");
System.out.println(added);

added =ref.addshowName("Oggy and the Cockroaches");
System.out.println(added);

added =ref.addshowName("Roll No 21");
System.out.println(added);

added =ref.addshowName("Little Singham");
System.out.println(added);

added =ref.addshowName("Pakdam Pakdai");
System.out.println(added);

added =ref.addshowName("Kumbh Karan");
System.out.println(added);

added =ref.addshowName("The Jungle Book");
System.out.println(added);

added =ref.addshowName("Rudra: Boom Chik Chik Boom");
System.out.println(added);

added =ref.addshowName("Super Bheem");
System.out.println(added);

added =ref.addshowName("Krishna Balram");
System.out.println(added);

added =ref.addshowName("Bhoot Bandhus");
System.out.println(added);

added =ref.addshowName("Zig and Sharko");
System.out.println(added);


ref.getshowName();

String showName = ref.getshowByName("Doraemon");
System.out.println(showName+" is available");

boolean update = ref.updateshowName("Doraemon","Doraemon New");
System.out.println(update);

boolean delete = ref.deleteshowName("Doraemon New");
System.out.println(delete);

ref.getshowName();

}
}
