class Truecaller{
  public static void login(String name, String email){
    System.out.println("Name: " + name);
    System.out.println("Email: " + email);
  }

  public static void login(long phoneNumber, int otp){
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("Monika","monika@gmail.com");
    login(9876543210L,6666);
  }
}