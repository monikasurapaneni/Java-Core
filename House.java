class House{
String indoorGames[]=new String[5];
int index;

public boolean addindoorGame(String indoorGame){
boolean isindoorGamesAdded=true;

if(index<indoorGames.length){

if(indoorGame!=null && !indoorGame.isEmpty()){
indoorGames[index++]=indoorGame;
isindoorGamesAdded=true;
}else System.out.println(" The indoorGamesss added are invalid");

}else System.out.println("The House  is full of indoorGamesss... no space");
return isindoorGamesAdded;
}

public void getindoorGame(){
for(String indoorGame:indoorGames){
System.out.println(indoorGame);
}
}
public String getindoorGameByName(String indoorGame){
String name=null;

for(String game:indoorGames){
if(game==indoorGame){
name=game;
System.out.println(indoorGame+" Is added");
break;
}
}

if(name==null){
System.out.println(indoorGame+" not available");
}

return name;
}

public boolean updateindoorGame(String existingGame,String updatedGame){
boolean isUpdated=false;

for(int index=0;index<indoorGames.length;index++){
if(indoorGames[index]==existingGame){
indoorGames[index]=updatedGame;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingGame+" is not found");
}

return isUpdated;
}

public boolean deleteindoorGame(String indoorGame){
boolean isDeleted=false;

for(int index=0;index<indoorGames.length;index++){
if(indoorGames[index]==indoorGame){
indoorGames[index]=null;
isDeleted=true;
System.out.println(indoorGame+" is deleted");
}
}

if(isDeleted==false){
System.out.println(indoorGame+" is not found");
}

return isDeleted;
}
}
