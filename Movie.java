class Movie{
String castReadings[]=new String[9];
int index;

public boolean addcastReading(String castReading){
boolean iscastReadingsAdded=true;

if(index<castReadings.length){

if(castReading!=null && !castReading.isEmpty()){
castReadings[index++]=castReading;
iscastReadingsAdded=true;
}else System.out.println(" The cast Readings added are invalid");

}else System.out.println("The Movie is full of cast Readings... no space");
return iscastReadingsAdded;
}

public void getcastReading(){
for(String castReading:castReadings){
System.out.println(castReading);
}
}
public String getcastByName(String castReading){
String name=null;

for(String cast:castReadings){
if(cast==castReading){
name=cast;
System.out.println(castReading+" Is added");
break;
}
}

if(name==null){
System.out.println(castReading+" not available");
}

return name;
}

public boolean updatecastReading(String existingCast,String updatedCast){
boolean isUpdated=false;

for(int index=0;index<castReadings.length;index++){
if(castReadings[index]==existingCast){
castReadings[index]=updatedCast;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingCast+" is not found");
}

return isUpdated;
}


public boolean deletecastReading(String castReading){
boolean isDeleted=false;

for(int index=0;index<castReadings.length;index++){
if(castReadings[index]==castReading){
castReadings[index]=null;
isDeleted=true;
System.out.println(castReading+" is deleted");
}
}

if(isDeleted==false){
System.out.println(castReading+" is not found");
}

return isDeleted;
}
}

