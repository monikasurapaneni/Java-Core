class TemparatureReadings{
public static void main(String[]args){

WeatherStation ref=new WeatherStation();

boolean added =ref.addtemparatureReading("15°C");
System.out.println(added);

added =ref.addtemparatureReading("16°C");
System.out.println(added);

added =ref.addtemparatureReading("17°C");
System.out.println(added);

added =ref.addtemparatureReading("18°C");
System.out.println(added);

added =ref.addtemparatureReading("19°C");
System.out.println(added);

added =ref.addtemparatureReading("20°C");
System.out.println(added);

added =ref.addtemparatureReading("21°C");
System.out.println(added);

added =ref.addtemparatureReading("22°C");
System.out.println(added);

added =ref.addtemparatureReading("23°C");
System.out.println(added);

added =ref.addtemparatureReading("24°C");
System.out.println(added);

added =ref.addtemparatureReading("25°C");
System.out.println(added);

added =ref.addtemparatureReading("26°C");
System.out.println(added);

added =ref.addtemparatureReading("27°C");
System.out.println(added);

added =ref.addtemparatureReading("28°C");
System.out.println(added);

added =ref.addtemparatureReading("29°C");
System.out.println(added);

added =ref.addtemparatureReading("30°C");
System.out.println(added);

added =ref.addtemparatureReading("31°C");
System.out.println(added);

added =ref.addtemparatureReading("32°C");
System.out.println(added);

ref.gettemparatureReading();


String temp = ref.gettemparatureByName("25°C");
System.out.println(temp+" is available");


boolean update = ref.updatetemparatureReading("25°C","25°C Updated");
System.out.println(update);


boolean delete = ref.deletetemparatureReading("25°C Updated");
System.out.println(delete);


ref.gettemparatureReading();
}
}