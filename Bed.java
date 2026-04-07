class Bed{
String bedNames[]=new String[10];
int index;

public boolean addbedName(String bedName){
boolean isbedAdded=true;

if(index<bedNames.length){
if(bedName!=null && !bedName.isEmpty()){
bedNames[index++]=bedName;
isbedAdded=true;
}else System.out.println("The bed Names added are invalid");
}else System.out.println("The Bed is full of bed Names... no space");
return isbedAdded;
}

public void getbedName(){
for(String bedName:bedNames){
System.out.println(bedName);
}
}

public String getbedByName(String bedName){
String name=null;

for(String bed:bedNames){
if(bed==bedName){
name=bed;
System.out.println(bedName+" Is added");
break;
}
}

if(name==null){
System.out.println(bedName+" not available");
}

return name;
}

public boolean updatebedName(String existingBedName,String updatedBedName){
boolean isUpdated=false;

for(int index=0;index<bedNames.length;index++){
if(bedNames[index]==existingBedName){
bedNames[index]=updatedBedName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingBedName+" is not found");
}

return isUpdated;
}

public boolean deletebedName(String bedName){
boolean isDeleted=false;

for(int index=0;index<bedNames.length;index++){
if(bedNames[index]==bedName){
bedNames[index]=null;
isDeleted=true;
System.out.println(bedName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(bedName+" is not found");
}

return isDeleted;
}
}