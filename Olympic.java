class Olympic{

String sportNames[]=new String[11];
int index;

public boolean addSportNames(String sportName){
boolean isSportNamesAdded=true;

if(index<sportNames.length){

if(sportName!=null && !sportName.isEmpty()){
sportNames[index++]=sportName;
isSportNamesAdded=true;
}else System.out.println(" The Sport Names added are invalid");

}else System.out.println("The olympics is full of sports... no space");
return isSportNamesAdded;
}

public void getSportName(){
for(String sportName:sportNames){
System.out.println(sportName);
}
}
public String getSportByNames(String sportByName){
String name =null;
for(String sportName:sportNames){
if(sportName==sportByName){
name= sportName;
System.out.println(sportByName + "Is added");
 break;
 }
}
	
if(name==null){
	System.out.println(sportByName + "not available");
 }
	return name;
  }
public boolean updateSportNames(String existingSportName, String updatedSportName){
boolean isSportNamesUpdated=false;
for(int index=0;index < sportNames.length;index++){
 if(sportNames[index]== existingSportName){
  sportNames[index]=updatedSportName;
isSportNamesUpdated=true;
}
}	
if(isSportNamesUpdated==false){
System.out.println(existingSportName + " is not found");
}
return isSportNamesUpdated;
		
}
public boolean deleteSport(String sportName){
boolean isDeleted=false;

for(int index=0;index<sports.length;index++){
if(sports[index]==sportName){
sports[index]=null;
isDeleted=true;
System.out.println(sportName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(sportName+" is not found");
}

return isDeleted;
}
}


