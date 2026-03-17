class AdobeLightroom{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long adobeId, long code){
    System.out.println("Adobe ID: " + adobeId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("lightroom@adobe.com","light123");
    login(345678901L,4444L);
  }
}