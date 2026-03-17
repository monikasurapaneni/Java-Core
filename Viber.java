class Viber{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long viberId, long code){
    System.out.println("Viber ID: " + viberId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("viberUser","viber123");
    login(999999L,7777L);
  }
}