class Plex{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long userId, int pin){
    System.out.println("User ID: " + userId);
    System.out.println("PIN: " + pin);
  }

  public static void main(String[] args){
    login("plex@gmail.com","plex123");
    login(987654L,3434);
  }
}