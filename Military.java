class Military{
String weaponNames[]=new String[21];
int index;

public boolean addweaponName(String weaponName){
boolean isweaponNamesAdded=true;

if(index<weaponNames.length){

if(weaponName!=null && !weaponName.isEmpty()){
weaponNames[index++]=weaponName;
isweaponNamesAdded=true;
}else System.out.println(" The weaponNames added are invalid");

}else System.out.println("The Military is full of cast weaponNames... no space");
return isweaponNamesAdded;
}

public void getweaponName(){
for(String weaponName:weaponNames){
System.out.println(weaponName);
}
}
public String getweaponByName(String weaponName){
String name=null;

for(String weapon:weaponNames){
if(weapon==weaponName){
name=weapon;
System.out.println(weaponName+" Is added");
break;
}
}

if(name==null){
System.out.println(weaponName+" not available");
}

return name;
}


public boolean updateweaponName(String existingWeaponName,String updatedWeaponName){
boolean isUpdated=false;

for(int index=0;index<weaponNames.length;index++){
if(weaponNames[index]==existingWeaponName){
weaponNames[index]=updatedWeaponName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingWeaponName+" is not found");
}

return isUpdated;
}


public boolean deleteweaponName(String weaponName){
boolean isDeleted=false;

for(int index=0;index<weaponNames.length;index++){
if(weaponNames[index]==weaponName){
weaponNames[index]=null;
isDeleted=true;
System.out.println(weaponName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(weaponName+" is not found");
}

return isDeleted;
}
}
