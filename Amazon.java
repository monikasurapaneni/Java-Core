class Amazon{
String categoryNames[]=new String[21];
int index;

public boolean addcategoryName(String categoryName){
boolean iscategoryName=true;

if(index<categoryNames.length){

if(categoryName!=null && !categoryName.isEmpty()){
categoryNames[index++]=categoryName;
iscategoryName=true;
}else System.out.println(" The category Names added are invalid");

}else System.out.println("The Amazon is full of category Names... no space");
return iscategoryName;
}

public void getcategoryName(){
for(String categoryName:categoryNames){
System.out.println(categoryName);
}
}
public String getcategoryByName(String categoryName){
String name=null;

for(String category:categoryNames){
if(category==categoryName){
name=category;
System.out.println(categoryName+" Is added");
break;
}
}

if(name==null){
System.out.println(categoryName+" not available");
}

return name;
}


public boolean updatecategoryName(String existingCategoryName,String updatedCategoryName){
boolean isCategoryUpdated=false;

for(int index=0;index<categoryNames.length;index++){
if(categoryNames[index]==existingCategoryName){
categoryNames[index]=updatedCategoryName;
isCategoryUpdated=true;
}
}

if(isCategoryUpdated==false){
System.out.println(existingCategoryName+" is not found");
}

return isCategoryUpdated;
}


public boolean deletecategoryName(String categoryName){
boolean isDeleted=false;

for(int index=0;index<categoryNames.length;index++){
if(categoryNames[index]==categoryName){
categoryNames[index]=null;
isDeleted=true;
System.out.println(categoryName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(categoryName+" is not found");
}

return isDeleted;
}
}
