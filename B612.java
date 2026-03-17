class B612{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long userId, long code){
    System.out.println("User ID: " + userId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("b612User","b612123");
    login(345678901L,4444L);
  }
}