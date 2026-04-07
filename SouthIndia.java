class  SouthIndia{

String airportNames[]=new String[9];
int index;

public boolean addairportName(String airportName){
boolean isairportNameAdded=true;

if(index<airportNames.length){

if(airportName!=null && !airportName.isEmpty()){
airportNames[index++]=airportName;
isairportNameAdded=true;
}else System.out.println(" The airportNames added are invalid");

}else System.out.println("The South India  is full of airportNames... no space");
return isairportNameAdded;
}

public void getairportName(){
for(String airportName:airportNames){
System.out.println(airportName);
}
}
public String getairportByName(String airportName){
String name=null;

for(String airport:airportNames){
if(airport==airportName){
name=airport;
System.out.println(airportName+" Is added");
break;
}
}

if(name==null){
System.out.println(airportName+" not available");
}

return name;
}

public boolean updateairportName(String existingAirportName,String updatedAirportName){
boolean isUpdated=false;

for(int index=0;index<airportNames.length;index++){
if(airportNames[index]==existingAirportName){
airportNames[index]=updatedAirportName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingAirportName+" is not found");
}

return isUpdated;
}

public boolean deleteairportName(String airportName){
boolean isDeleted=false;

for(int index=0;index<airportNames.length;index++){
if(airportNames[index]==airportName){
airportNames[index]=null;
isDeleted=true;
System.out.println(airportName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(airportName+" is not found");
}

return isDeleted;
}
}