class  Salon{
String services[]=new String[7];
int index;

public boolean addservice(String service){
boolean isservicesAdded=true;

if(index<services.length){

if(service!=null && !service.isEmpty()){
services[index++]=service;
isservicesAdded=true;
}else System.out.println(" The services added are invalid");

}else System.out.println("The Salon is full of services... no space");
return isservicesAdded;
}

public void getservice(){
for(String service:services){
System.out.println(service);
}
}
public String getserviceByName(String service){
String name=null;

for(String s:services){
if(s==service){
name=s;
System.out.println(service+" Is added");
break;
}
}

if(name==null){
System.out.println(service+" not available");
}

return name;
}


public boolean updateservice(String existingService,String updatedService){
boolean isUpdated=false;

for(int index=0;index<services.length;index++){
if(services[index]==existingService){
services[index]=updatedService;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingService+" is not found");
}

return isUpdated;
}


public boolean deleteservice(String service){
boolean isDeleted=false;

for(int index=0;index<services.length;index++){
if(services[index]==service){
services[index]=null;
isDeleted=true;
System.out.println(service+" is deleted");
}
}

if(isDeleted==false){
System.out.println(service+" is not found");
}

return isDeleted;
}
}

