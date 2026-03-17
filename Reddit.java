class Reddit{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long redditId, long code){
    System.out.println("Reddit ID: " + redditId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("redditUser","reddit123");
    login(999999L,7777L);
  }
}