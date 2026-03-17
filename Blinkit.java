class Blinkit{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long userId, long code){
    System.out.println("User ID: " + userId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("blinkUser","blink123");
    login(234567890L,7777L);
  }
}