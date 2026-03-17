class MicrosoftCopilot{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long userId, int pin){
    System.out.println("User ID: " + userId);
    System.out.println("PIN: " + pin);
  }

  public static void main(String[] args){
    login("copilotUser","copilot123");
    login(345678901L,3333);
  }
}