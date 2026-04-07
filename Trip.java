class Trip{
String placeNames[]=new String[13];
int index;

public boolean addplaceName(String placeName){
boolean isplaceName=true;

if(index<placeNames.length){

if(placeName!=null && !placeName.isEmpty()){
placeNames[index++]=placeName;
isplaceName=true;
}else System.out.println(" The place Names added are invalid");

}else System.out.println("The Trip is full of Place Names... no space");
return isplaceName;
}

public void getplaceName(){
for(String placeName:placeNames){
System.out.println(placeName);
}
}
public boolean updateplaceName(String existingPlaceName,String updatedPlaceName){
boolean isPlaceUpdated=false;

for(int index=0;index<placeNames.length;index++){
if(placeNames[index]==existingPlaceName){
placeNames[index]=updatedPlaceName;
isPlaceUpdated=true;
}
}

if(isPlaceUpdated==false){
System.out.println(existingPlaceName+" is not found");
}

return isPlaceUpdated;
}


public boolean deleteplaceName(String placeName){
boolean isDeleted=false;

for(int index=0;index<placeNames.length;index++){
if(placeNames[index]==placeName){
placeNames[index]=null;
isDeleted=true;
System.out.println(placeName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(placeName+" is not found");
}

return isDeleted;
}
}

