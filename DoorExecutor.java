class DoorExecutor {

public static void main(String[] args) {
Door d1 = new Door();
d1.type = "Teak Wood Door";
d1.brand = "CenturyPly";
d1.thickness = 3.5;
d1.price = 15000;
d1.openingStyle = "Single Swing";

Lock l1 = new Lock();
l1.securityLevel = "High";
l1.accessMode = "Digital";
l1.batteryLevel = 80;
l1.alarmEnabled = true;
l1.unlockMethod = "Fingerprint";

d1.lock = l1;
d1.getDoorDetails();


Door d2 = new Door();
d2.type = "Stainless Steel Door";
d2.brand = "Godrej";
d2.thickness = 4.0;
d2.price = 20000;
d2.openingStyle = "Double Swing";

Lock l2 = new Lock();
l2.securityLevel = "Medium";
l2.accessMode = "Manual";
l2.batteryLevel = 0;
l2.alarmEnabled = false;
l2.unlockMethod = "Key";

d2.lock = l2;
d2.getDoorDetails();


Door d3 = new Door();
d3.type = "Tempered Glass Door";
d3.brand = "Saint-Gobain";
d3.thickness = 3.0;
d3.price = 18000;
d3.openingStyle = "Sliding";

Lock l3 = new Lock();
l3.securityLevel = "Very High";
l3.accessMode = "Smart";
l3.batteryLevel = 65;
l3.alarmEnabled = true;
l3.unlockMethod = "Face Recognition";

d3.lock = l3;
d3.getDoorDetails();


Door d4 = new Door();
d4.type = "PVC Flush Door";
d4.brand = "Sintex";
d4.thickness = 2.5;
d4.price = 8000;
d4.openingStyle = "Single Swing";

Lock l4 = new Lock();
l4.securityLevel = "Low";
l4.accessMode = "Latch";
l4.batteryLevel = 0;
l4.alarmEnabled = false;
l4.unlockMethod = "Handle";

d4.lock = l4;
d4.getDoorDetails();


Door d5 = new Door();
d5.type = "Rosewood Door";
d5.brand = "Greenply";
d5.thickness = 3.8;
d5.price = 17000;
d5.openingStyle = "Single Swing";

Lock l5 = new Lock();
l5.securityLevel = "High";
l5.accessMode = "Key Lock";
l5.batteryLevel = 0;
l5.alarmEnabled = true;
l5.unlockMethod = "Key";

d5.lock = l5;
d5.getDoorDetails();

Door d6 = new Door();
d6.type = "Aluminum Door";
d6.brand = "Jindal";
d6.thickness = 3.2;
d6.price = 12000;
d6.openingStyle = "Sliding";

Lock l6 = new Lock();
l6.securityLevel = "High";
l6.accessMode = "Padlock";
l6.batteryLevel = 0;
l6.alarmEnabled = false;
l6.unlockMethod = "Key";

d6.lock = l6;
d6.getDoorDetails();


Door d7 = new Door();
d7.type = "Oak Wood Door";
d7.brand = "CenturyDoors";
d7.thickness = 3.6;
d7.price = 16000;
d7.openingStyle = "Double Swing";

Lock l7 = new Lock();
l7.securityLevel = "Very High";
l7.accessMode = "Smart";
l7.batteryLevel = 70;
l7.alarmEnabled = true;
l7.unlockMethod = "Fingerprint";

d7.lock = l7;
d7.getDoorDetails();


Door d8 = new Door();
d8.type = "Frosted Glass Door";
d8.brand = "AIS Glass";
d8.thickness = 3.2;
d8.price = 14000;
d8.openingStyle = "Sliding";

Lock l8 = new Lock();
l8.securityLevel = "High";
l8.accessMode = "Digital";
l8.batteryLevel = 60;
l8.alarmEnabled = true;
l8.unlockMethod = "PIN";

d8.lock = l8;
d8.getDoorDetails();


Door d9 = new Door();
d9.type = "PVC Panel Door";
d9.brand = "Sintex";
d9.thickness = 2.8;
d9.price = 7000;
d9.openingStyle = "Folding";

Lock l9 = new Lock();
l9.securityLevel = "Medium";
l9.accessMode = "Manual";
l9.batteryLevel = 0;
l9.alarmEnabled = false;
l9.unlockMethod = "Key";

d9.lock = l9;
d9.getDoorDetails();


Door d10 = new Door();
d10.type = "Mahogany Wood Door";
d10.brand = "Greenply";
d10.thickness = 4.0;
d10.price = 22000;
d10.openingStyle = "Single Swing";

Lock l10 = new Lock();
l10.securityLevel = "High";
l10.accessMode = "Key Lock";
l10.batteryLevel = 0;
l10.alarmEnabled = true;
l10.unlockMethod = "Key";

d10.lock = l10;
d10.getDoorDetails();


Door d11 = new Door();
d11.type = "Steel Security Door";
d11.brand = "Godrej";
d11.thickness = 4.5;
d11.price = 25000;
d11.openingStyle = "Single Swing";

Lock l11 = new Lock();
l11.securityLevel = "High";
l11.accessMode = "Padlock";
l11.batteryLevel = 0;
l11.alarmEnabled = false;
l11.unlockMethod = "Key";

d11.lock = l11;
d11.getDoorDetails();


Door d12 = new Door();
d12.type = "Pine Wood Door";
d12.brand = "CenturyPly";
d12.thickness = 3.2;
d12.price = 13000;
d12.openingStyle = "Single Swing";

Lock l12 = new Lock();
l12.securityLevel = "Low";
l12.accessMode = "Latch";
l12.batteryLevel = 0;
l12.alarmEnabled = false;
l12.unlockMethod = "Handle";

d12.lock = l12;
d12.getDoorDetails();


Door d13 = new Door();
d13.type = "Clear Glass Door";
d13.brand = "Saint-Gobain";
d13.thickness = 3.0;
d13.price = 15000;
d13.openingStyle = "Sliding";

Lock l13 = new Lock();
l13.securityLevel = "Very High";
l13.accessMode = "Digital";
l13.batteryLevel = 75;
l13.alarmEnabled = true;
l13.unlockMethod = "Face Recognition";

d13.lock = l13;
d13.getDoorDetails();


Door d14 = new Door();
d14.type = "PVC Bathroom Door";
d14.brand = "Sintex";
d14.thickness = 2.5;
d14.price = 6000;
d14.openingStyle = "Folding";

Lock l14 = new Lock();
l14.securityLevel = "Low";
l14.accessMode = "Manual";
l14.batteryLevel = 0;
l14.alarmEnabled = false;
l14.unlockMethod = "Handle";

d14.lock = l14;
d14.getDoorDetails();


Door d15 = new Door();
d15.type = "Walnut Wood Door";
d15.brand = "Greenply";
d15.thickness = 3.9;
d15.price = 21000;
d15.openingStyle = "Double Swing";

Lock l15 = new Lock();
l15.securityLevel = "Very High";
l15.accessMode = "Smart";
l15.batteryLevel = 85;
l15.alarmEnabled = true;
l15.unlockMethod = "Fingerprint";

d15.lock = l15;
d15.getDoorDetails();


Door d16 = new Door();
d16.type = "Metal Storage Door";
d16.brand = "Jindal";
d16.thickness = 3.5;
d16.price = 11000;
d16.openingStyle = "Sliding";

Lock l16 = new Lock();
l16.securityLevel = "High";
l16.accessMode = "Padlock";
l16.batteryLevel = 0;
l16.alarmEnabled = false;
l16.unlockMethod = "Key";

d16.lock = l16;
d16.getDoorDetails();


Door d17 = new Door();
d17.type = "Sal Wood Door";
d17.brand = "CenturyDoors";
d17.thickness = 3.7;
d17.price = 18000;
d17.openingStyle = "Single Swing";

Lock l17 = new Lock();
l17.securityLevel = "Medium";
l17.accessMode = "Key Lock";
l17.batteryLevel = 0;
l17.alarmEnabled = false;
l17.unlockMethod = "Key";

d17.lock = l17;
d17.getDoorDetails();


Door d18 = new Door();
d18.type = "Frosted Glass Door";
d18.brand = "AIS Glass";
d18.thickness = 3.2;
d18.price = 16000;
d18.openingStyle = "Sliding";

Lock l18 = new Lock();
l18.securityLevel = "High";
l18.accessMode = "Digital";
l18.batteryLevel = 68;
l18.alarmEnabled = true;
l18.unlockMethod = "PIN";

d18.lock = l18;
d18.getDoorDetails();


Door d19 = new Door();
d19.type = "PVC Utility Door";
d19.brand = "Sintex";
d19.thickness = 2.7;
d19.price = 7500;
d19.openingStyle = "Folding";

Lock l19 = new Lock();
l19.securityLevel = "Low";
l19.accessMode = "Latch";
l19.batteryLevel = 0;
l19.alarmEnabled = false;
l19.unlockMethod = "Handle";

d19.lock = l19;
d19.getDoorDetails();


Door d20 = new Door();
d20.type = "Teak Wood Premium Door";
d20.brand = "Greenply";
d20.thickness = 4.2;
d20.price = 26000;
d20.openingStyle = "Double Swing";

Lock l20 = new Lock();
l20.securityLevel = "Very High";
l20.accessMode = "Smart";
l20.batteryLevel = 90;
l20.alarmEnabled = true;
l20.unlockMethod = "Face Recognition";

d20.lock = l20;
d20.getDoorDetails();
}
}