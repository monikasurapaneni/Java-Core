class SoundCloud{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long phoneNumber, long code){
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("sound@gmail.com","sound123");
    login(912345678L,1010L);
  }
}