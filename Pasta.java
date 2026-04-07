class Pasta{
String pastaNames[]=new String[10];
int index;

public boolean addpastaName(String pastaName){
boolean ispastaAdded=true;

if(index<pastaNames.length){
if(pastaName!=null && !pastaName.isEmpty()){
pastaNames[index++]=pastaName;
ispastaAdded=true;
}else System.out.println("The pasta Names added are invalid");
}else System.out.println("The Pasta is full of pasta Names... no space");
return ispastaAdded;
}

public void getpastaName(){
for(String pastaName:pastaNames){
System.out.println(pastaName);
}
}

public String getpastaByName(String pastaName){
String name=null;

for(String pasta:pastaNames){
if(pasta==pastaName){
name=pasta;
System.out.println(pastaName+" Is added");
break;
}
}

if(name==null){
System.out.println(pastaName+" not available");
}

return name;
}

public boolean updatepastaName(String existingPastaName,String updatedPastaName){
boolean isUpdated=false;

for(int index=0;index<pastaNames.length;index++){
if(pastaNames[index]==existingPastaName){
pastaNames[index]=updatedPastaName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingPastaName+" is not found");
}

return isUpdated;
}

public boolean deletepastaName(String pastaName){
boolean isDeleted=false;

for(int index=0;index<pastaNames.length;index++){
if(pastaNames[index]==pastaName){
pastaNames[index]=null;
isDeleted=true;
System.out.println(pastaName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(pastaName+" is not found");
}

return isDeleted;
}
}