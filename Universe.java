class Universe{
String galaxies[]=new String[11];
int index;

public boolean addgalaxie(String galaxie){
boolean isgalaxiesAdded=true;

if(index<galaxies.length){

if(galaxies!=null && !galaxie.isEmpty()){
galaxies[index++]=galaxie;
isgalaxiesAdded=true;
}else System.out.println(" The galaxiess added are invalid");

}else System.out.println("The South India  is full of galaxiess... no space");
return isgalaxiesAdded;
}

public void getgalaxie(){
for(String galaxie:galaxies){
System.out.println(galaxie);
}
}
public String getgalaxieByName(String galaxie){
String name=null;

for(String g:galaxies){
if(g==galaxie){
name=g;
System.out.println(galaxie+" Is added");
break;
}
}

if(name==null){
System.out.println(galaxie+" not available");
}

return name;
}

public boolean updategalaxie(String existingGalaxie,String updatedGalaxie){
boolean isUpdated=false;

for(int index=0;index<galaxies.length;index++){
if(galaxies[index]==existingGalaxie){
galaxies[index]=updatedGalaxie;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingGalaxie+" is not found");
}

return isUpdated;
}

public boolean deletegalaxie(String galaxie){
boolean isDeleted=false;

for(int index=0;index<galaxies.length;index++){
if(galaxies[index]==galaxie){
galaxies[index]=null;
isDeleted=true;
System.out.println(galaxie+" is deleted");
}
}

if(isDeleted==false){
System.out.println(galaxie+" is not found");
}

return isDeleted;
}
}
