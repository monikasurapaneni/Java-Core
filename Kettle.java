class Kettle{
String kettleNames[]=new String[10];
int index;

public boolean addkettleName(String kettleName){
boolean iskettleAdded=true;

if(index<kettleNames.length){
if(kettleName!=null && !kettleName.isEmpty()){
kettleNames[index++]=kettleName;
iskettleAdded=true;
}else System.out.println("The kettle Names added are invalid");
}else System.out.println("The Kettle is full of kettle Names... no space");
return iskettleAdded;
}

public void getkettleName(){
for(String kettleName:kettleNames){
System.out.println(kettleName);
}
}

public String getkettleByName(String kettleName){
String name=null;

for(String kettle:kettleNames){
if(kettle==kettleName){
name=kettle;
System.out.println(kettleName+" Is added");
break;
}
}

if(name==null){
System.out.println(kettleName+" not available");
}

return name;
}

public boolean updatekettleName(String existingKettleName,String updatedKettleName){
boolean isUpdated=false;

for(int index=0;index<kettleNames.length;index++){
if(kettleNames[index]==existingKettleName){
kettleNames[index]=updatedKettleName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingKettleName+" is not found");
}

return isUpdated;
}


public boolean deletekettleName(String kettleName){
boolean isDeleted=false;

for(int index=0;index<kettleNames.length;index++){
if(kettleNames[index]==kettleName){
kettleNames[index]=null;
isDeleted=true;
System.out.println(kettleName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(kettleName+" is not found");
}

return isDeleted;
}
}