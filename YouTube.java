class YouTube{
String videoNames[]=new String[15];
int index;

public boolean addvideoName(String videoName){
boolean isvideoAdded=true;

if(index<videoNames.length){
if(videoName!=null && !videoName.isEmpty()){
videoNames[index++]=videoName;
isvideoAdded=true;
}else System.out.println("The video Names added are invalid");
}else System.out.println("The YouTube is full of video Names... no space");
return isvideoAdded;
}

public void getvideoName(){
for(String videoName:videoNames){
System.out.println(videoName);
}
}

public String getvideoByName(String videoName){
String name=null;

for(String video:videoNames){
if(video==videoName){
name=video;
System.out.println(videoName+" Is added");
break;
}
}

if(name==null){
System.out.println(videoName+" not available");
}

return name;
}

public boolean updatevideoName(String existingVideoName,String updatedVideoName){
boolean isUpdated=false;

for(int index=0;index<videoNames.length;index++){
if(videoNames[index]==existingVideoName){
videoNames[index]=updatedVideoName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingVideoName+" is not found");
}

return isUpdated;
}

public boolean deletevideoName(String videoName){
boolean isDeleted=false;

for(int index=0;index<videoNames.length;index++){
if(videoNames[index]==videoName){
videoNames[index]=null;
isDeleted=true;
System.out.println(videoName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(videoName+" is not found");
}

return isDeleted;
}
}