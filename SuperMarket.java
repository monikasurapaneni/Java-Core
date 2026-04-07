class SuperMarket{

String productNames[]=new String[8];
int index;

public boolean addproductName(String productName){
boolean isproductName=true;

if(index<productNames.length){

if(productName!=null && !productName.isEmpty()){
productNames[index++]=productName;
isproductName=true;
}else System.out.println(" The product  Names added are invalid");

}else System.out.println("The SuperMarket is full of product Names... no space");
return isproductName;
}

public void getproductName(){
for(String productName:productNames){
System.out.println(productName);
}
}
public String getproductByName(String productName) {
String name = null;
for (String product : productNames) {
if (product == productName) {   
    name = product;
	System.out.println(productName + " Is added");
     break;
}
}
if (name == null) {
System.out.println(productName + " not available");
}
return name;
}

public boolean updateproductName(String existingProductName, String updatedProductName) {
boolean isProductUpdated = false;
for (int index = 0; index < productNames.length; index++) {
if (productNames[index] == existingProductName) {   // kept ==
     productNames[index] = updatedProductName;
    isProductUpdated = true;
}
}

if (isProductUpdated == false) {
 System.out.println(existingProductName + " is not found");
 }
 return isProductUpdated;
}

public boolean deleteproductName(String productName){
boolean isDeleted=false;

for(int index=0;index<productNames.length;index++){
if(productNames[index]==productName){
productNames[index]=null;
isDeleted=true;
System.out.println(productName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(productName+" is not found");
}

return isDeleted;
}
}
