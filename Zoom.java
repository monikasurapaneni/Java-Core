class Zoom{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long meetingId, int passcode){
    System.out.println("Meeting ID: " + meetingId);
    System.out.println("Passcode: " + passcode);
  }

  public static void main(String[] args){
    login("zoomUser","zoom123");
    login(987654321L,1010);
  }
}