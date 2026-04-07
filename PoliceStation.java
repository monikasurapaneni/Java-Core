class PoliceStation{
String caseNames[]=new String[16];
int index;

public boolean addcaseName(String caseName){
boolean iscaseName=true;

if(index<caseNames.length){

if(caseName!=null && !caseName.isEmpty()){
caseNames[index++]=caseName;
iscaseName=true;
}else System.out.println(" The Case Names added are invalid");

}else System.out.println("The Police Station is full of Case Names... no space");
return iscaseName;
}

public void getcaseName(){
for(String caseName:caseNames){
System.out.println(caseName);
}
}

public String getcaseByName(String caseName){
String name=null;

for(String caseName1:caseNames){
if(caseName1==caseName){
name=caseName1;
System.out.println(caseName+" Is added");
break;
}
}

if(name==null){
System.out.println(caseName+" not available");
}

return name;
}


public boolean updatecaseName(String existingCaseName,String updatedCaseName){
boolean isCaseUpdated=false;

for(int index=0;index<caseNames.length;index++){
if(caseNames[index]==existingCaseName){
caseNames[index]=updatedCaseName;
isCaseUpdated=true;
}
}

if(isCaseUpdated==false){
System.out.println(existingCaseName+" is not found");
}

return isCaseUpdated;
}


public boolean deletecaseName(String caseName){
boolean isDeleted=false;

for(int index=0;index<caseNames.length;index++){
if(caseNames[index]==caseName){
caseNames[index]=null;
isDeleted=true;
System.out.println(caseName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(caseName+" is not found");
}

return isDeleted;
}




}