class Venmo{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long userId, long code){
    System.out.println("User ID: " + userId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("venmo@gmail.com","venmo123");
    login(456789012L,6666L);
  }
}