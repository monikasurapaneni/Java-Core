class GoogleClassroom{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long classId, long code){
    System.out.println("Class ID: " + classId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("classUser","class123");
    login(234567890L,2222L);
  }
}