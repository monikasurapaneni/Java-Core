class Alibaba{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long businessId, long code){
    System.out.println("Business ID: " + businessId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("aliUser","ali123");
    login(789012345L,7474L);
  }
}