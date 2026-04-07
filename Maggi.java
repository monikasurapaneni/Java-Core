class  Maggi{
String ingredients[]=new String[12];
int index;

public boolean addingredient(String ingredient){
boolean isingredientAdded=true;

if(index<ingredients.length){

if(ingredient!=null && !ingredient.isEmpty()){
ingredients[index++]=ingredient;
isingredientAdded=true;
}else System.out.println(" The ingredients added are invalid");

}else System.out.println("The Maggi is full of ingredients... no space");
return isingredientAdded;
}

public void getingredient(){
for(String ingredient:ingredients){
System.out.println(ingredient);
}
}
public String getingredientByName(String ingredient){
String name=null;

for(String ing:ingredients){
if(ing==ingredient){
name=ing;
System.out.println(ingredient+" Is added");
break;
}
}

if(name==null){
System.out.println(ingredient+" not available");
}

return name;
}

public boolean updateingredient(String existingIngredient,String updatedIngredient){
boolean isUpdated=false;

for(int index=0;index<ingredients.length;index++){
if(ingredients[index]==existingIngredient){
ingredients[index]=updatedIngredient;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingIngredient+" is not found");
}

return isUpdated;
}

public boolean deleteingredient(String ingredient){
boolean isDeleted=false;

for(int index=0;index<ingredients.length;index++){
if(ingredients[index]==ingredient){
ingredients[index]=null;
isDeleted=true;
System.out.println(ingredient+" is deleted");
}
}

if(isDeleted==false){
System.out.println(ingredient+" is not found");
}

return isDeleted;
}
}
