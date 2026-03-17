class GoProQuik{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long deviceId, long code){
    System.out.println("Device ID: " + deviceId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("gopro@gmail.com","gopro123");
    login(789012345L,9999L);
  }
}