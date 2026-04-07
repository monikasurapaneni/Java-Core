class  MedicalShop{
String medicineNames[]=new String[10];
int index;

public boolean addmedicineName(String medicineName){
boolean ismedicineName=true;

if(index<medicineNames.length){

if(medicineName!=null && !medicineName.isEmpty()){
medicineNames[index++]=medicineName;
ismedicineName=true;
}else System.out.println(" The Medicine Names added are invalid");

}else System.out.println("The Medical Shop is full of Medicine Names... no space");
return ismedicineName;
}

public void getmedicineName(){
for(String medicineName:medicineNames){
System.out.println(medicineName);
}
}

public String getmedicineByName(String medicineName){
String name=null;

for(String medicine:medicineNames){
if(medicine==medicineName){
name=medicine;
System.out.println(medicineName+" Is added");
break;
}
}

if(name==null){
System.out.println(medicineName+" not available");
}

return name;
}


public boolean updatemedicineName(String existingMedicineName,String updatedMedicineName){
boolean isMedicineUpdated=false;

for(int index=0;index<medicineNames.length;index++){
if(medicineNames[index]==existingMedicineName){
medicineNames[index]=updatedMedicineName;
isMedicineUpdated=true;
}
}

if(isMedicineUpdated==false){
System.out.println(existingMedicineName+" is not found");
}

return isMedicineUpdated;
}


public boolean deletemedicineName(String medicineName){
boolean isDeleted=false;

for(int index=0;index<medicineNames.length;index++){
if(medicineNames[index]==medicineName){
medicineNames[index]=null;
isDeleted=true;
System.out.println(medicineName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(medicineName+" is not found");
}

return isDeleted;
}
}
