class IndoorGames{
public static void main(String[]args){
House ref=new House();

boolean added =ref.addindoorGame("Carrom");
System.out.println(added);

added =ref.addindoorGame("Chess");
System.out.println(added);

added =ref.addindoorGame("Ludot");
System.out.println(added);

added =ref.addindoorGame("Snakes and Ladders");
System.out.println(added);

added =ref.addindoorGame("Table Tennis");
System.out.println(added);

ref.getindoorGame();

String game = ref.getindoorGameByName("Chess");
System.out.println(game+" is available");

boolean update = ref.updateindoorGame("Chess","Chess Pro");
System.out.println(update);

boolean delete = ref.deleteindoorGame("Chess Pro");
System.out.println(delete);

ref.getindoorGame();

}
}