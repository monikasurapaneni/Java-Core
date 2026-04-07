class Galaxies{
public static void main(String[]args){
Universe ref=new Universe();

boolean added =ref.addgalaxie("Milky Way");
System.out.println(added);

added =ref.addgalaxie("Andromeda Galaxy");
System.out.println(added);

added =ref.addgalaxie("Triangulum Galaxyt");
System.out.println(added);

added =ref.addgalaxie("Whirlpool Galaxy");
System.out.println(added);

added =ref.addgalaxie("Sombrero Galaxy");
System.out.println(added);

added =ref.addgalaxie("Pinwheel Galaxy");
System.out.println(added);

added =ref.addgalaxie("Cartwheel Galaxy");
System.out.println(added);

added =ref.addgalaxie("Black Eye Galaxy");
System.out.println(added);

added =ref.addgalaxie("Cigar Galaxy");
System.out.println(added);

added =ref.addgalaxie("Tadpole Galaxy");
System.out.println(added);

ref.getgalaxie();

String galaxie = ref.getgalaxieByName("Milky Way");
System.out.println(galaxie+" is available");

boolean update = ref.updategalaxie("Milky Way","Milky Way Galaxy");
System.out.println(update);

boolean delete = ref.deletegalaxie("Milky Way Galaxy");
System.out.println(delete);

ref.getgalaxie();

}
}
