class Tree{
String treeNames[]=new String[10];
int index;

public boolean addtreeName(String treeName){
boolean istreeAdded=true;

if(index<treeNames.length){
if(treeName!=null && !treeName.isEmpty()){
treeNames[index++]=treeName;
istreeAdded=true;
}else System.out.println("The tree Names added are invalid");
}else System.out.println("The Tree is full of tree Names... no space");
return istreeAdded;
}

public void gettreeName(){
for(String treeName:treeNames){
System.out.println(treeName);
}
}

public String gettreeByName(String treeName){
String name=null;

for(String tree:treeNames){
if(tree==treeName){
name=tree;
System.out.println(treeName+" Is added");
break;
}
}

if(name==null){
System.out.println(treeName+" not available");
}

return name;
}

public boolean updatetreeName(String existingTreeName,String updatedTreeName){
boolean isUpdated=false;

for(int index=0;index<treeNames.length;index++){
if(treeNames[index]==existingTreeName){
treeNames[index]=updatedTreeName;
isUpdated=true;
}
}

if(isUpdated==false){
System.out.println(existingTreeName+" is not found");
}

return isUpdated;
}

public boolean deletetreeName(String treeName){
boolean isDeleted=false;

for(int index=0;index<treeNames.length;index++){
if(treeNames[index]==treeName){
treeNames[index]=null;
isDeleted=true;
System.out.println(treeName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(treeName+" is not found");
}

return isDeleted;
}
}