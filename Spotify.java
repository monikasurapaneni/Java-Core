class Spotify{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long accountNumber, long code){
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("music@gmail.com","spot123");
    login(987654L,3333L);
  }
}