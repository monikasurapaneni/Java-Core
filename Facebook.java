class Facebook{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long userId, long securityCode){
    System.out.println("User ID: " + userId);
    System.out.println("Security Code: " + securityCode);
  }

  public static void main(String[] args){
    login("monika","fbpass");
    login(12345678L,5678L);
  }
}