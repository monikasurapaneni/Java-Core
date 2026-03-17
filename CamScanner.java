class CamScanner{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long userId, long code){
    System.out.println("User ID: " + userId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("camUser","cam123");
    login(789012345L,8888L);
  }
}