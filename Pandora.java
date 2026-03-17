class Pandora{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long accountId, int pin){
    System.out.println("Account ID: " + accountId);
    System.out.println("PIN: " + pin);
  }

  public static void main(String[] args){
    login("pandora@gmail.com","pandora123");
    login(7654321L,2020);
  }
}