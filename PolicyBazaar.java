class PolicyBazaar{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long policyId, int pin){
    System.out.println("Policy ID: " + policyId);
    System.out.println("PIN: " + pin);
  }

  public static void main(String[] args){
    login("policy@gmail.com","policy123");
    login(789012345L,9999);
  }
}