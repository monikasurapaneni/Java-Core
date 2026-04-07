class Services{
public static void main(String[]args){

Salon ref=new Salon();

boolean added =ref.addservice("Haircut");
System.out.println(added);

added =ref.addservice("Hair Coloring");
System.out.println(added);

added =ref.addservice("Hair Spa");
System.out.println(added);

added =ref.addservice("Facial");
System.out.println(added);

added =ref.addservice("Manicure");
System.out.println(added);

added =ref.addservice("Pedicure");
System.out.println(added);

added =ref.addservice("Threading");
System.out.println(added);


ref.getservice();


String service = ref.getserviceByName("Facial");
System.out.println(service+" is available");


boolean update = ref.updateservice("Facial","Gold Facial");
System.out.println(update);


boolean delete = ref.deleteservice("Gold Facial");
System.out.println(delete);


ref.getservice();
}
}