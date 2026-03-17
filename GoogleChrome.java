class GoogleChrome{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long profileId, long code){
    System.out.println("Profile ID: " + profileId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("chrome@gmail.com","chrome123");
    login(567890123L,5555L);
  }
}