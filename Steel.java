class Steel{
String steelTypes[]=new String[10];
int index;

public boolean addsteelType(String steelType){
boolean issteelAdded=true;

if(index<steelTypes.length){
if(steelType!=null && !steelType.isEmpty()){
steelTypes[index++]=steelType;
issteelAdded=true;
}else System.out.println("The steel Types added are invalid");
}else System.out.println("The Steel is full of steel Types... no space");
return issteelAdded;
}

public void getsteelType(){
for(String steelType:steelTypes){
System.out.println(steelType);
}
}

public String getsteelByName(String steelType){
String name=null;

for(String steel:steelTypes){
if(steel==steelType){
name=steel;
System.out.println(steelType+" Is added");
break;
}
}

if(name==null){
System.out.println(steelType+" not available");
}

return name;
}

public boolean updatesteelType(String existingSteelType,String updatedSteelType){
boolean isUpdated=false;

for(int index=0;index<steelTypes.length;index++){
if(steelTypes[index]==existingSteelType){
steelTypes[index]=updatedSteelType;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingSteelType+" is not found");
}

return isUpdated;
}

public boolean deletesteelType(String steelType){
boolean isDeleted=false;

for(int index=0;index<steelTypes.length;index++){
if(steelTypes[index]==steelType){
steelTypes[index]=null;
isDeleted=true;
System.out.println(steelType+" is deleted");
}
}

if(isDeleted==false){
System.out.println(steelType+" is not found");
}

return isDeleted;
}
}