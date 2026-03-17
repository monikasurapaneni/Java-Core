class ClickUp{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long workspaceId, int otp){
    System.out.println("Workspace ID: " + workspaceId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("clickup@gmail.com","click123");
    login(123456789L,1111);
  }
}