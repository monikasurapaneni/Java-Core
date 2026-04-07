class Cylinder{
String cylinderNames[]=new String[10];
int index;

public boolean addcylinderName(String cylinderName){
boolean iscylinderAdded=true;

if(index<cylinderNames.length){
if(cylinderName!=null && !cylinderName.isEmpty()){
cylinderNames[index++]=cylinderName;
iscylinderAdded=true;
}else System.out.println("The cylinder Names added are invalid");
}else System.out.println("The Cylinder is full of cylinder Names... no space");
return iscylinderAdded;
}

public void getcylinderName(){
for(String cylinderName:cylinderNames){
System.out.println(cylinderName);
}
}

public String getcylinderByName(String cylinderName){
String name=null;

for(String cylinder:cylinderNames){
if(cylinder==cylinderName){
name=cylinder;
System.out.println(cylinderName+" Is added");
break;
}
}

if(name==null){
System.out.println(cylinderName+" not available");
}

return name;
}

public boolean updatecylinderName(String existingCylinderName,String updatedCylinderName){
boolean isUpdated=false;

for(int index=0;index<cylinderNames.length;index++){
if(cylinderNames[index]==existingCylinderName){
cylinderNames[index]=updatedCylinderName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingCylinderName+" is not found");
}

return isUpdated;
}

public boolean deletecylinderName(String cylinderName){
boolean isDeleted=false;

for(int index=0;index<cylinderNames.length;index++){
if(cylinderNames[index]==cylinderName){
cylinderNames[index]=null;
isDeleted=true;
System.out.println(cylinderName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(cylinderName+" is not found");
}

return isDeleted;
}
}