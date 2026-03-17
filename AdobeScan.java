class AdobeScan{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long adobeId, int pin){
    System.out.println("Adobe ID: " + adobeId);
    System.out.println("PIN: " + pin);
  }

  public static void main(String[] args){
    login("scan@adobe.com","scan123");
    login(890123456L,9999);
  }
}