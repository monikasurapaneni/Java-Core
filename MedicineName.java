class MedicineName{
public static void main(String[]args){

MedicalShop ref=new MedicalShop();

boolean added =ref.addmedicineName("Paracetamol");
System.out.println(added);

added =ref.addmedicineName("Ibuprofen");
System.out.println(added);

added =ref.addmedicineName("Amoxicillin");
System.out.println(added);

added =ref.addmedicineName("Azithromycin");
System.out.println(added);

added =ref.addmedicineName("Cetirizine");
System.out.println(added);

added =ref.addmedicineName("Dolo 650");
System.out.println(added);

added =ref.addmedicineName("Crocin");
System.out.println(added);

added =ref.addmedicineName("Vicks VapoRub");
System.out.println(added);

added =ref.addmedicineName("ORS Powder");
System.out.println(added);

added =ref.addmedicineName("Pantoprazole");
System.out.println(added);

ref.getmedicineName();

String medicineName=ref.getmedicineByName("Dolo 650");
System.out.println(medicineName+" is available");


boolean update=ref.updatemedicineName("Dolo 650","Dolo 650 Tablet");
System.out.println(update);

boolean delete=ref.deletemedicineName("Dolo 650 Tablet");
System.out.println(delete);


ref.getmedicineName();

}
}
