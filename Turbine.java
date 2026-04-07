class Turbine{
String turbineNames[]=new String[10];
int index;

public boolean addturbineName(String turbineName){
boolean isturbineAdded=true;

if(index<turbineNames.length){
if(turbineName!=null && !turbineName.isEmpty()){
turbineNames[index++]=turbineName;
isturbineAdded=true;
}else System.out.println("The turbine Names added are invalid");
}else System.out.println("The Turbine is full of turbine Names... no space");
return isturbineAdded;
}

public void getturbineName(){
for(String turbineName:turbineNames){
System.out.println(turbineName);
}
}

public String getturbineByName(String turbineName){
String name=null;

for(String turbine:turbineNames){
if(turbine==turbineName){
name=turbine;
System.out.println(turbineName+" Is added");
break;
}
}

if(name==null){
System.out.println(turbineName+" not available");
}

return name;
}

public boolean updateturbineName(String existingTurbineName,String updatedTurbineName){
boolean isUpdated=false;

for(int index=0;index<turbineNames.length;index++){
if(turbineNames[index]==existingTurbineName){
turbineNames[index]=updatedTurbineName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingTurbineName+" is not found");
}

return isUpdated;
}

public boolean deleteturbineName(String turbineName){
boolean isDeleted=false;

for(int index=0;index<turbineNames.length;index++){
if(turbineNames[index]==turbineName){
turbineNames[index]=null;
isDeleted=true;
System.out.println(turbineName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(turbineName+" is not found");
}

return isDeleted;
}
}