class  StateElection{
String partyNames[]=new String[7];
int index;

public boolean addpartyName(String partyName){
boolean ispartyName=true;

if(index<partyNames.length){

if(partyName!=null && !partyName.isEmpty()){
partyNames[index++]=partyName;
ispartyName=true;
}else System.out.println(" The Party Names added are invalid");

}else System.out.println("The State Election is full of Party Names... no space");
return ispartyName;
}

public void getpartyName(){
for(String partyName:partyNames){
System.out.println(partyName);
}
}
public String getpartyByName(String partyName){
String name=null;

for(String party:partyNames){
if(party==partyName){
name=party;
System.out.println(partyName+" Is added");
break;
}
}

if(name==null){
System.out.println(partyName+" not available");
}

return name;
}


public boolean updatepartyName(String existingPartyName,String updatedPartyName){
boolean isPartyUpdated=false;

for(int index=0;index<partyNames.length;index++){
if(partyNames[index]==existingPartyName){
partyNames[index]=updatedPartyName;
isPartyUpdated=true;
}
}

if(isPartyUpdated==false){
System.out.println(existingPartyName+" is not found");
}

return isPartyUpdated;
}


public boolean deletepartyName(String partyName){
boolean isDeleted=false;

for(int index=0;index<partyNames.length;index++){
if(partyNames[index]==partyName){
partyNames[index]=null;
isDeleted=true;
System.out.println(partyName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(partyName+" is not found");
}

return isDeleted;
}
}
