class AmazonPrimeVideo{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long userId, long accessCode){
    System.out.println("User ID: " + userId);
    System.out.println("Access Code: " + accessCode);
  }

  public static void main(String[] args){
    login("prime@gmail.com","prime123");
    login(555666777L,1111L);
  }
}