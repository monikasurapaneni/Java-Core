class DigitalZone {
String laptopBrandNames[] = new String[6];
int index;
public boolean addLaptopBrandName(String laptopBrandName) {
boolean isLaptopBrandNameAdded = true;
if (index < laptopBrandNames.length) {
if (laptopBrandName != null && !laptopBrandName.isEmpty()) {
 laptopBrandNames[index++] = laptopBrandName;
  isLaptopBrandNameAdded = true;
 } else {
  System.out.println("laptopBrandName is not valid");
  }
} else {
    System.out.println("DigitalZone is full of laptop brand names");
  }
  return isLaptopBrandNameAdded;
    }

public void getLaptopBrandName() {
for (String laptopBrandName : laptopBrandNames) {
 System.out.println(laptopBrandName);
 }
    }

public String getLaptopBrandByName(String laptopBrandName) {
String name = null;
 for (String laptop : laptopBrandNames) {
if (laptop == laptopBrandName) {   
   name = laptop;
System.out.println(laptopBrandName + " Is added");
break;
}
  }

if (name == null) {
System.out.println(laptopBrandName + " not available");
 }

 return name;
 }

 public boolean updateLaptopBrand(String existingLaptopName, String updatedLaptopName) {
 boolean isLaptopUpdated = false;
for (int index = 0; index < laptopBrandNames.length; index++) {
if (laptopBrandNames[index] == existingLaptopName) {  
     laptopBrandNames[index] = updatedLaptopName;
    isLaptopUpdated = true;
}
}
if (isLaptopUpdated == false) {
System.out.println(existingLaptopName + " is not found");
}

return isLaptopUpdated;
    }
	
public boolean deleteLaptopBrand(String laptopName){
 boolean isDeleted=false;
for(int index=0;index<laptopBrandNames.length;index++){
if(laptopBrandNames[index]==laptopName){
 laptopBrandNames[index]=null;
isDeleted=true;
 System.out.println(laptopName+" is deleted");
        }
    }

 if(isDeleted==false){
 System.out.println(laptopName+" is not found");
}

  return isDeleted;
}
}