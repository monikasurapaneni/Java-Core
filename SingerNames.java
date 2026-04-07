class SingerNames{
public static void main(String[]args){

Singer ref=new Singer();

boolean added =ref.addsingerName("Arijit Singh");
System.out.println(added);

added =ref.addsingerName("Shreya Ghoshal");
System.out.println(added);

added =ref.addsingerName("Sonu Nigam");
System.out.println(added);

added =ref.addsingerName("Armaan Malik");
System.out.println(added);

added =ref.addsingerName("Neha Kakkar");
System.out.println(added);

added =ref.addsingerName("KK");
System.out.println(added);

added =ref.addsingerName("Atif Aslam");
System.out.println(added);

added =ref.addsingerName("Sunidhi Chauhan");
System.out.println(added);

added =ref.addsingerName("Mohit Chauhan");
System.out.println(added);

added =ref.addsingerName("Jubin Nautiyal");
System.out.println(added);

ref.getsingerName();

String singerName = ref.getsingerByName("Arijit Singh");
System.out.println(singerName+" is available");

boolean update = ref.updatesingerName("Arijit Singh","Arijit Singh Live");
System.out.println(update);

boolean delete = ref.deletesingerName("Arijit Singh Live");
System.out.println(delete);

ref.getsingerName();

}
}