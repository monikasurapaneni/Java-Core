class BookNames{
public static void main(String[]args){

Library ref=new Library();

boolean added =ref.addbookName("Wings of Fire");
System.out.println(added);

added =ref.addbookName("The Alchemist");
System.out.println(added);

added =ref.addbookName("Harry Potter and the Sorcerer's Stone");
System.out.println(added);

added =ref.addbookName("Rich Dad Poor Dad");
System.out.println(added);

added =ref.addbookName("The Power of Your Subconscious Mind");
System.out.println(added);

added =ref.addbookName("To Kill a Mockingbird");
System.out.println(added);

added =ref.addbookName("The Great Gatsby");
System.out.println(added);

added =ref.addbookName("Think and Grow Rich");
System.out.println(added);

added =ref.addbookName("Atomic Habits");
System.out.println(added);

added =ref.addbookName("Ikigai");
System.out.println(added);

added =ref.addbookName("The Monk Who Sold His Ferrari");
System.out.println(added);

added =ref.addbookName("The 7 Habits of Highly Effective People");
System.out.println(added);

added =ref.addbookName("The Fault in Our Stars");
System.out.println(added);

ref.getbookName();

String bookName = ref.getbookByName("Ikigai");
System.out.println(bookName + " is available");


boolean update = ref.updatebookName("Ikigai","Ikigai Revised");
System.out.println(update);

ref.getbookName();


boolean delete = ref.deleteBook("Ikigai Revised");
System.out.println(delete);


ref.getbookName();
}
}