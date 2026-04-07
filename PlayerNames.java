class PlayerNames{
public static void main(String[]args){

IndianTestTeam ref=new IndianTestTeam();

boolean added =ref.addplayerName("Rohit Sharma");
System.out.println(added);

added =ref.addplayerName("Virat Kohli");
System.out.println(added);

added =ref.addplayerName("KL Rahul");
System.out.println(added);

added =ref.addplayerName("Shubman Gill");
System.out.println(added);

added =ref.addplayerName("Ajinkya Rahane");
System.out.println(added);

added =ref.addplayerName("Cheteshwar Pujara");
System.out.println(added);

added =ref.addplayerName("Rishabh Pant");
System.out.println(added);

added =ref.addplayerName("Ravindra Jadeja");
System.out.println(added);

added =ref.addplayerName("Ravichandran Ashwin");
System.out.println(added);

added =ref.addplayerName("Jasprit Bumrah");
System.out.println(added);

added =ref.addplayerName("Mohammed Shami");
System.out.println(added);

ref.getplayerName();

String playerName = ref.getplayerByName("Virat Kohli");
System.out.println(playerName+" is available");

boolean update = ref.updateplayerName("Virat Kohli","King Kohli");
System.out.println(update);

boolean delete = ref.deleteplayerName("King Kohli");
System.out.println(delete);

ref.getplayerName();

}
}
