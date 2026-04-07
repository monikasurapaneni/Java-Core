class  PetShop {
String accessories[]=new String[16];
int index;

public boolean addaccessorie(String accessorie){
boolean isaccessoriesAdded=true;

if(index<accessories.length){

if(accessorie!=null && !accessorie.isEmpty()){
accessories[index++]=accessorie;
isaccessoriesAdded=true;
}else System.out.println(" The accessories added are invalid");

}else System.out.println("The PetShop is full of cast accessories... no space");
return isaccessoriesAdded;
}

public void getaccessorie(){
for(String accessorie:accessories){
System.out.println(accessorie);
}
}

public String getaccessorieByName(String accessorie){
String name=null;

for(String item:accessories){
if(item==accessorie){
name=item;
System.out.println(accessorie+" Is added");
break;
}
}

if(name==null){
System.out.println(accessorie+" not available");
}

return name;
}


public boolean updateaccessorie(String existingAccessorie,String updatedAccessorie){
boolean isUpdated=false;

for(int index=0;index<accessories.length;index++){
if(accessories[index]==existingAccessorie){
accessories[index]=updatedAccessorie;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingAccessorie+" is not found");
}

return isUpdated;
}


public boolean deleteaccessorie(String accessorie){
boolean isDeleted=false;

for(int index=0;index<accessories.length;index++){
if(accessories[index]==accessorie){
accessories[index]=null;
isDeleted=true;
System.out.println(accessorie+" is deleted");
}
}

if(isDeleted==false){
System.out.println(accessorie+" is not found");
}

return isDeleted;
}
}
