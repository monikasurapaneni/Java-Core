class Deezer{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long accountId, long code){
    System.out.println("Account ID: " + accountId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("deezer@gmail.com","deezer123");
    login(345678901L,5656L);
  }
}