class Clubhouse{
  public static void login(String username, String inviteCode){
    System.out.println("Username: " + username);
    System.out.println("Invite Code: " + inviteCode);
  }

  public static void login(long userId, long code){
    System.out.println("User ID: " + userId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("clubUser","INV123");
    login(555555L,7777L);
  }
}