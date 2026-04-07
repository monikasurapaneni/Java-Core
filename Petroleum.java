class Petroleum{
String fuelNames[]=new String[10];
int index;

public boolean addfuelName(String fuelName){
boolean isfuelAdded=true;

if(index<fuelNames.length){
if(fuelName!=null && !fuelName.isEmpty()){
fuelNames[index++]=fuelName;
isfuelAdded=true;
}else System.out.println("The fuel Names added are invalid");
}else System.out.println("The Petroleum is full of fuel Names... no space");
return isfuelAdded;
}

public void getfuelName(){
for(String fuelName:fuelNames){
System.out.println(fuelName);
}
}

public String getfuelByName(String fuelName){
String name=null;

for(String fuel:fuelNames){
if(fuel==fuelName){
name=fuel;
System.out.println(fuelName+" Is added");
break;
}
}

if(name==null){
System.out.println(fuelName+" not available");
}

return name;
}

public boolean updatefuelName(String existingFuelName,String updatedFuelName){
boolean isUpdated=false;

for(int index=0;index<fuelNames.length;index++){
if(fuelNames[index]==existingFuelName){
fuelNames[index]=updatedFuelName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingFuelName+" is not found");
}

return isUpdated;
}

public boolean deletefuelName(String fuelName){
boolean isDeleted=false;

for(int index=0;index<fuelNames.length;index++){
if(fuelNames[index]==fuelName){
fuelNames[index]=null;
isDeleted=true;
System.out.println(fuelName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(fuelName+" is not found");
}

return isDeleted;
}
}