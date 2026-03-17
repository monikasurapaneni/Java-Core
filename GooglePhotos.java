class GooglePhotos{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long photoId, long code){
    System.out.println("Photo ID: " + photoId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("photos@gmail.com","photos123");
    login(345678901L,4444L);
  }
}