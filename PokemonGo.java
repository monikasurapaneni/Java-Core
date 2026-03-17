class PokemonGO{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long trainerId, int otp){
    System.out.println("Trainer ID: " + trainerId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("pokemon@gmail.com","poke123");
    login(678901234L,6666);
  }
}