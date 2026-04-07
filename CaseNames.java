class CaseNames{
public static void main(String[]args){

PoliceStation ref=new PoliceStation();

boolean added =ref.addcaseName("Theft Case");
System.out.println(added);

added =ref.addcaseName("Robbery Case");
System.out.println(added);

added =ref.addcaseName("Murder Case");
System.out.println(added);

added =ref.addcaseName("Kidnapping Case");
System.out.println(added);

added =ref.addcaseName("Missing Person Case");
System.out.println(added);

added =ref.addcaseName("Fraud Case");
System.out.println(added);

added =ref.addcaseName("Cyber Crime Case");
System.out.println(added);

added =ref.addcaseName("Domestic Violence Case");
System.out.println(added);

added =ref.addcaseName("Assault Case");
System.out.println(added);

added =ref.addcaseName("Drug Trafficking Case");
System.out.println(added);

added =ref.addcaseName("Hit and Run Case");
System.out.println(added);

added =ref.addcaseName("Burglary Case");
System.out.println(added);

added =ref.addcaseName("Extortion Case");
System.out.println(added);

added =ref.addcaseName("Cheque Bounce Case");
System.out.println(added);

added =ref.addcaseName("Identity Theft Case");
System.out.println(added);

added =ref.addcaseName("Illegal Possession Case");
System.out.println(added);

ref.getcaseName();

String caseName = ref.getcaseByName("Fraud Case");
System.out.println(caseName+" is available");


boolean update = ref.updatecaseName("Fraud Case","Online Fraud Case");
System.out.println(update);


boolean delete = ref.deletecaseName("Online Fraud Case");
System.out.println(delete);


ref.getcaseName();

}
}
