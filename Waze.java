class Waze{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long phoneNumber, long code){
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("wazeUser","waze123");
    login(765432198L,5555L);
  }
}