class SongNames{
public static void main(String[]args){

Spotify ref=new Spotify();

boolean added =ref.addsongName("Calm Down");
System.out.println(added);

added =ref.addsongName("Peaches");
System.out.println(added);

added =ref.addsongName("Stay");
System.out.println(added);

added =ref.addsongName("Shape of You");
System.out.println(added);

added =ref.addsongName("Blinding Lights");
System.out.println(added);

added =ref.addsongName("Levitating");
System.out.println(added);

added =ref.addsongName("Perfect");
System.out.println(added);

added =ref.addsongName("Closer");
System.out.println(added);

added =ref.addsongName("Believer");
System.out.println(added);

added =ref.addsongName("Senorita");
System.out.println(added);

ref.getsongName();


String songName = ref.getsongByName("Believer");
System.out.println(songName+" is available");


boolean update = ref.updatesongName("Believer","Believer Remix");
System.out.println(update);


boolean delete = ref.deletesongName("Believer Remix");
System.out.println(delete);


ref.getsongName();
}
}