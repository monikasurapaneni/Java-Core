class Watch{

String operatingSystem;
String specialFeature;
String connectivityTechnology;
String wirelessCommunicationStandard;
String gps; 
String brand;
String bandMaterialType;
String sportType;
String humanInterfaceInput;
double waterResistanceDepth;

Watch(String os, String sf, String ct, String wcs, String g, String b, String bm, String st, String hi, double wr){
    operatingSystem = os;
    specialFeature = sf;
    connectivityTechnology = ct;
    wirelessCommunicationStandard = wcs;
    gps = g;
    brand = b;
    bandMaterialType = bm;
    sportType = st;
    humanInterfaceInput = hi;
    waterResistanceDepth = wr;
}

public void displayDetails(){
    System.out.println(operatingSystem);
    System.out.println(specialFeature);
    System.out.println(connectivityTechnology);
    System.out.println(wirelessCommunicationStandard);
    System.out.println(gps);
    System.out.println(brand);
    System.out.println(bandMaterialType);
    System.out.println(sportType);
    System.out.println(humanInterfaceInput);
    System.out.println(waterResistanceDepth);
}

}