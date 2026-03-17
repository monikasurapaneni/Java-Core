class TikTok{
  public static void login(String username, String email){
    System.out.println("Username: " + username);
    System.out.println("Email: " + email);
  }

  public static void login(long phoneNumber, long code){
    System.out.println("Phone: " + phoneNumber);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("tiktokUser","tiktok@gmail.com");
    login(9876543210L,2222L);
  }
}