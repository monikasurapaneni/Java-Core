class ShowRoom{
String managerNames[]=new String[8];
int index;

public boolean addmanagerName(String managerName){
boolean ismanagerNamesAdded=true;

if(index<managerNames.length){

if(managerName!=null && !managerName.isEmpty()){
managerNames[index++]=managerName;
ismanagerNamesAdded=true;
}else System.out.println(" The Manager Names added are invalid");

}else System.out.println("The Show Room is full of cast manager Names... no space");
return ismanagerNamesAdded;
}

public void getmanagerName(){
for(String managerName:managerNames){
System.out.println(managerName);
}
}
public String getmanagerByName(String managerName){
String name=null;

for(String manager:managerNames){
if(manager==managerName){
name=manager;
System.out.println(managerName+" Is added");
break;
}
}

if(name==null){
System.out.println(managerName+" not available");
}

return name;
}


public boolean updatemanagerName(String existingManagerName,String updatedManagerName){
boolean isUpdated=false;

for(int index=0;index<managerNames.length;index++){
if(managerNames[index]==existingManagerName){
managerNames[index]=updatedManagerName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingManagerName+" is not found");
}

return isUpdated;
}

public boolean deletemanagerName(String managerName){
boolean isDeleted=false;

for(int index=0;index<managerNames.length;index++){
if(managerNames[index]==managerName){
managerNames[index]=null;
isDeleted=true;
System.out.println(managerName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(managerName+" is not found");
}

return isDeleted;
}
}

