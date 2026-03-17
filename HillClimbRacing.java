class HillClimbRacing{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long gameId, int pin){
    System.out.println("Game ID: " + gameId);
    System.out.println("PIN: " + pin);
  }

  public static void main(String[] args){
    login("hill@gmail.com","hill123");
    login(890123456L,8888);
  }
}