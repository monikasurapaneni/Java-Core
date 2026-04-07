class Hungama {
String showNames[]=new String[15];
int index;

public boolean addshowName(String showName){
boolean isshowNameAdded=true;

if(index<showNames.length){

if(showName!=null && !showName.isEmpty()){
showNames[index++]=showName;
isshowNameAdded=true;
}else System.out.println(" The show Names added are invalid");

}else System.out.println("The Hungama is full of showNames... no space");
return isshowNameAdded;
}

public void getshowName(){
for(String showName:showNames){
System.out.println(showName);
}
}
public String getshowByName(String showName){
String name=null;

for(String show:showNames){
if(show==showName){
name=show;
System.out.println(showName+" Is added");
break;
}
}

if(name==null){
System.out.println(showName+" not available");
}

return name;
}


public boolean updateshowName(String existingShowName,String updatedShowName){
boolean isUpdated=false;

for(int index=0;index<showNames.length;index++){
if(showNames[index]==existingShowName){
showNames[index]=updatedShowName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingShowName+" is not found");
}

return isUpdated;
}


public boolean deleteshowName(String showName){
boolean isDeleted=false;

for(int index=0;index<showNames.length;index++){
if(showNames[index]==showName){
showNames[index]=null;
isDeleted=true;
System.out.println(showName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(showName+" is not found");
}

return isDeleted;
}
}

