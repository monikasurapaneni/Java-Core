class Casts{

public static void main(String[]args){

Movie ref=new Movie();

boolean added =ref.addcastReading("Shah Rukh Khan");
System.out.println(added);

added =ref.addcastReading("Kajol");
System.out.println(added);

added =ref.addcastReading("Amrish Puri");
System.out.println(added);

added =ref.addcastReading("Farida Jalal");
System.out.println(added);

added =ref.addcastReading("Anupam Kher");
System.out.println(added);

added =ref.addcastReading("Parmeet Sethi");
System.out.println(added);

added =ref.addcastReading("Mandira Bedi");
System.out.println(added);

added =ref.addcastReading("Satish Shah");
System.out.println(added);

added =ref.addcastReading("Himani Shivpuri");
System.out.println(added);

ref.getcastReading();

String castName = ref.getcastByName("Kajol");
System.out.println(castName+" is available");


boolean update = ref.updatecastReading("Kajol","Kajol Devgan");
System.out.println(update);


boolean delete = ref.deletecastReading("Kajol Devgan");
System.out.println(delete);


ref.getcastReading();
}
}