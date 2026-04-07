class States{
public static void main(String[]args){

Country ref = new Country();

boolean added= ref.addState("Andhra Pradesh");
System.out.println(added);

added= ref.addState("Arunachal Pradesh");
System.out.println(added);

added= ref.addState("Assam");
System.out.println(added);

added= ref.addState("Bihar");
System.out.println(added);

added= ref.addState("Chhattisgarh");
System.out.println(added);

added= ref.addState("Goa");
System.out.println(added);

added= ref.addState("Gujarat");
System.out.println(added);

added= ref.addState("Haryana");
System.out.println(added);

added= ref.addState("Himachal Pradesh");
System.out.println(added);

added= ref.addState("Jharkhand");
System.out.println(added);

added= ref.addState("Karnataka");
System.out.println(added);

added= ref.addState("Kerala");
System.out.println(added);

added= ref.addState("Madhya Pradesh");
System.out.println(added);

added= ref.addState("Maharashtra");
System.out.println(added);

added= ref.addState("Manipur");
System.out.println(added);

added= ref.addState("Meghalaya");
System.out.println(added);

added= ref.addState("Mizoram");
System.out.println(added);

added= ref.addState("Nagaland");
System.out.println(added);

added= ref.addState("Odisha");
System.out.println(added);

added= ref.addState("Punjab");
System.out.println(added);

added= ref.addState("Rajasthan");
System.out.println(added);

added= ref.addState("Sikkim");
System.out.println(added);

added= ref.addState("Tamil Nadu");
System.out.println(added);

added= ref.addState("Telangana");
System.out.println(added);

added= ref.addState("Tripura");
System.out.println(added);

added= ref.addState("Uttar Pradesh");
System.out.println(added);

added= ref.addState("Uttarakhand");
System.out.println(added);

added= ref.addState("West Bengal");
System.out.println(added);

added= ref.addState("Jammu & Kashmir");
System.out.println(added);


ref.getStates();

String state=ref.getStateByName("Texas");
System.out.println( state + "is available");

boolean update=ref.updateState("Andhra Pradesh","Texas");
 System.out.println( update);
 
 ref.getStates();
 
 boolean delete=ref.deleteState("Kerala Updated");
System.out.println(delete);


ref.getStates();
}
}