class Course{
String technologyNames[]=new String[15];
int index;

public boolean addtechnologyName(String technologyName){
boolean istechnologyNamesAdded=true;

if(index<technologyNames.length){

if(technologyName!=null && !technologyName.isEmpty()){
technologyNames[index++]=technologyName;
istechnologyNamesAdded=true;
}else System.out.println(" The technology Names added are invalid");

}else System.out.println("The Course is full of technologyNames... no space");
return istechnologyNamesAdded;
}

public void gettechnologyName(){
for(String technologyName:technologyNames){
System.out.println(technologyName);
}
}
public String gettechnologyByName(String technologyName){
String name=null;

for(String tech:technologyNames){
if(tech==technologyName){
name=tech;
System.out.println(technologyName+" Is added");
break;
}
}

if(name==null){
System.out.println(technologyName+" not available");
}

return name;
}


public boolean updatetechnologyName(String existingTechnology,String updatedTechnology){
boolean isUpdated=false;

for(int index=0;index<technologyNames.length;index++){
if(technologyNames[index]==existingTechnology){
technologyNames[index]=updatedTechnology;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingTechnology+" is not found");
}

return isUpdated;
}


public boolean deletetechnologyName(String technologyName){
boolean isDeleted=false;

for(int index=0;index<technologyNames.length;index++){
if(technologyNames[index]==technologyName){
technologyNames[index]=null;
isDeleted=true;
System.out.println(technologyName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(technologyName+" is not found");
}

return isDeleted;
}
}
