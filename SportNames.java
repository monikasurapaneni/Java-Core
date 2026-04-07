class SportNames{
public static void main(String[]args){

Olympic ref=new Olympic();

boolean added =ref.addSportNames("Athletics");
System.out.println(added);

added =ref.addSportNames("Swimming ");
System.out.println(added);

added =ref.addSportNames(" Basketball");
System.out.println(added);

added =ref.addSportNames(" Football");
System.out.println(added);

added =ref.addSportNames(" Badminton");
System.out.println(added);

added =ref.addSportNames(" Boxing");
System.out.println(added);

added =ref.addSportNames(" Cycling");
System.out.println(added);

added =ref.addSportNames(" Gymnastics");
System.out.println(added);

added =ref.addSportNames(" Wrestling");
System.out.println(added);

added =ref.addSportNames("Archery ");
System.out.println(added);

added =ref.addSportNames(" Volleyball");
System.out.println(added);

ref.getSportName();

String sportName=ref.getSportByNames("Hockey");
System.out.println( sportName + "is available");

boolean update=ref.updateSportNames("Boxing","Judo");
System.out.println(update);

ref.getSportName();

boolean delete = ref.deleteSport("Cricket");
System.out.println(delete);

ref.getSportName();
}
}