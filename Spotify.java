class Spotify{
String songNames[]=new String[10];
int index;

public boolean addsongName(String songName){
boolean issongName=true;

if(index<songNames.length){

if(songName!=null && !songName.isEmpty()){
songNames[index++]=songName;
issongName=true;
}else System.out.println(" The Song Names added are invalid");

}else System.out.println("The Spotify is full of Song Names... no space");
return issongName;
}

public void getsongName(){
for(String songName:songNames){
System.out.println(songName);
}
}
public String getsongByName(String songName){
String name=null;

for(String song:songNames){
if(song==songName){
name=song;
System.out.println(songName+" Is added");
break;
}
}

if(name==null){
System.out.println(songName+" not available");
}

return name;
}

public boolean updatesongName(String existingSongName,String updatedSongName){
boolean isSongUpdated=false;

for(int index=0;index<songNames.length;index++){
if(songNames[index]==existingSongName){
songNames[index]=updatedSongName;
isSongUpdated=true;
}
}

if(isSongUpdated==false){
System.out.println(existingSongName+" is not found");
}

return isSongUpdated;
}

public boolean deletesongName(String songName){
boolean isDeleted=false;

for(int index=0;index<songNames.length;index++){
if(songNames[index]==songName){
songNames[index]=null;
isDeleted=true;
System.out.println(songName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(songName+" is not found");
}

return isDeleted;
}
}
