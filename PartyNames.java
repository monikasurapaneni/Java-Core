class PartyNames{
public static void main(String[]args){

StateElection ref=new StateElection();

boolean added =ref.addpartyName("Bharatiya Janata Party");
System.out.println(added);

added =ref.addpartyName("Indian National Congress");
System.out.println(added);

added =ref.addpartyName("Janata Dal");
System.out.println(added);

added =ref.addpartyName("Aam Aadmi Party");
System.out.println(added);

added =ref.addpartyName("Bahujan Samaj Party");
System.out.println(added);

added =ref.addpartyName("Communist Party of India");
System.out.println(added);

added =ref.addpartyName("Nationalist Congress Party");
System.out.println(added);

ref.getpartyName();



String partyName = ref.getpartyByName("Aam Aadmi Party");
System.out.println(partyName+" is available");


boolean update = ref.updatepartyName("Aam Aadmi Party","AAP");
System.out.println(update);


boolean delete = ref.deletepartyName("AAP");
System.out.println(delete);


ref.getpartyName();

}
}
