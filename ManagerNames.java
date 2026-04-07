class ManagerNames{
public static void main(String[]args){

ShowRoom ref=new ShowRoom();

boolean added =ref.addmanagerName("Rahul Sharma");
System.out.println(added);

added =ref.addmanagerName("Amit Verma");
System.out.println(added);

added =ref.addmanagerName("Kiran Kumar");
System.out.println(added);

added =ref.addmanagerName("Rohit Mehta");
System.out.println(added);

added =ref.addmanagerName("Sandeep Reddy");
System.out.println(added);

added =ref.addmanagerName("Arjun Singh");
System.out.println(added);

added =ref.addmanagerName("Vikas Gupta");
System.out.println(added);

added =ref.addmanagerName("Manoj Patel");
System.out.println(added);

ref.getmanagerName();

String managerName = ref.getmanagerByName("Amit Verma");
System.out.println(managerName+" is available");

boolean update = ref.updatemanagerName("Amit Verma","Amit Kumar");
System.out.println(update);

boolean delete = ref.deletemanagerName("Amit Kumar");
System.out.println(delete);

ref.getmanagerName();

}
}
