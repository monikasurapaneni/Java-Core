class YouTube{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long channelId, int pin){
    System.out.println("Channel ID: " + channelId);
    System.out.println("PIN: " + pin);
  }

  public static void main(String[] args){
    login("user@youtube.com","yt123");
    login(123456789L,1111);
  }
}