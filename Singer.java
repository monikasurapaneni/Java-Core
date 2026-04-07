class Singer{
String singerNames[]=new String[10];
int index;

public boolean addsingerName(String singerName){
boolean issingerAdded=true;

if(index<singerNames.length){
if(singerName!=null && !singerName.isEmpty()){
singerNames[index++]=singerName;
issingerAdded=true;
}else System.out.println("The singer Names added are invalid");
}else System.out.println("The Singer is full of singer Names... no space");
return issingerAdded;
}

public void getsingerName(){
for(String singerName:singerNames){
System.out.println(singerName);
}
}

public String getsingerByName(String singerName){
String name=null;

for(String singer:singerNames){
if(singer==singerName){
name=singer;
System.out.println(singerName+" Is added");
break;
}
}

if(name==null){
System.out.println(singerName+" not available");
}

return name;
}

public boolean updatesingerName(String existingSingerName,String updatedSingerName){
boolean isUpdated=false;

for(int index=0;index<singerNames.length;index++){
if(singerNames[index]==existingSingerName){
singerNames[index]=updatedSingerName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingSingerName+" is not found");
}

return isUpdated;
}

public boolean deletesingerName(String singerName){
boolean isDeleted=false;

for(int index=0;index<singerNames.length;index++){
if(singerNames[index]==singerName){
singerNames[index]=null;
isDeleted=true;
System.out.println(singerName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(singerName+" is not found");
}

return isDeleted;
}
}