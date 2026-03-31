class PowerBank {

String brand;
String color;
String batteryType;
String connectorType;
String compatibleDevices;
String specialFeature;
String material;
String chargingTime;

PowerBank(String b, String c, String bt, String ct, String cd, String sf, String m, String ch){
    brand = b;
    color = c;
    batteryType = bt;
    connectorType = ct;
    compatibleDevices = cd;
    specialFeature = sf;
    material = m;
    chargingTime = ch;
}

public void displayDetails(){
    System.out.println(brand);
    System.out.println(color);
    System.out.println(batteryType);
    System.out.println(connectorType);
    System.out.println(compatibleDevices);
    System.out.println(specialFeature);
    System.out.println(material);
    System.out.println(chargingTime);
}

}