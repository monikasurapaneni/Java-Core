class IndianTestTeam{
String playerNames[]=new String[11];
int index;

public boolean addplayerName(String playerName){
boolean isplayerNameAdded=true;

if(index<playerNames.length){

if(playerName!=null && !playerName.isEmpty()){
playerNames[index++]=playerName;
isplayerNameAdded=true;
}else System.out.println(" The playerNames added are invalid");

}else System.out.println("The Indian Test Team is full of playerNames... no space");
return isplayerNameAdded;
}

public void getplayerName(){
for(String playerName:playerNames){
System.out.println(playerName);
}
}
public String getplayerByName(String playerName){
String name=null;

for(String player:playerNames){
if(player==playerName){
name=player;
System.out.println(playerName+" Is added");
break;
}
}

if(name==null){
System.out.println(playerName+" not available");
}

return name;
}

public boolean updateplayerName(String existingPlayerName,String updatedPlayerName){
boolean isUpdated=false;

for(int index=0;index<playerNames.length;index++){
if(playerNames[index]==existingPlayerName){
playerNames[index]=updatedPlayerName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingPlayerName+" is not found");
}

return isUpdated;
}

public boolean deleteplayerName(String playerName){
boolean isDeleted=false;

for(int index=0;index<playerNames.length;index++){
if(playerNames[index]==playerName){
playerNames[index]=null;
isDeleted=true;
System.out.println(playerName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(playerName+" is not found");
}

return isDeleted;
}
}
