class Dropbox{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long accountId, long code){
    System.out.println("Account ID: " + accountId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("dropbox@gmail.com","drop123");
    login(456789012L,4444L);
  }
}