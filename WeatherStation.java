class WeatherStation{
String temparatureReadings[]=new String[17];
int index;

public boolean addtemparatureReading(String temparatureReading){
boolean istemparatureReading=true;

if(index<temparatureReadings.length){

if(temparatureReading!=null && !temparatureReading.isEmpty()){
temparatureReadings[index++]=temparatureReading;
istemparatureReading=true;
}else System.out.println(" The temparature Readings added are invalid");

}else System.out.println("The Weather Station is full of temparatureReadings... no space");
return istemparatureReading;
}

public void gettemparatureReading(){
for(String temparatureReading:temparatureReadings){
System.out.println(temparatureReading);
}
}
public String gettemparatureByName(String temparatureReading){
String name=null;

for(String temp:temparatureReadings){
if(temp==temparatureReading){
name=temp;
System.out.println(temparatureReading+" Is added");
break;
}
}

if(name==null){
System.out.println(temparatureReading+" not available");
}

return name;
}


public boolean updatetemparatureReading(String existingTemparature,String updatedTemparature){
boolean isUpdated=false;

for(int index=0;index<temparatureReadings.length;index++){
if(temparatureReadings[index]==existingTemparature){
temparatureReadings[index]=updatedTemparature;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingTemparature+" is not found");
}

return isUpdated;
}


public boolean deletetemparatureReading(String temparatureReading){
boolean isDeleted=false;

for(int index=0;index<temparatureReadings.length;index++){
if(temparatureReadings[index]==temparatureReading){
temparatureReadings[index]=null;
isDeleted=true;
System.out.println(temparatureReading+" is deleted");
}
}

if(isDeleted==false){
System.out.println(temparatureReading+" is not found");
}

return isDeleted;
}
}
