class Library{
String bookNames[]=new String[13];
int index;

public boolean addbookName(String bookName){
boolean isbookName=true;

if(index<bookNames.length){

if(bookName!=null && !bookName.isEmpty()){
bookNames[index++]=bookName;
isbookName=true;
}else System.out.println(" The Book Names added are invalid");

}else System.out.println("The Library is full of Book Names... no space");
return isbookName;
}

public void getbookName(){
for(String bookName:bookNames){
System.out.println(bookName);
}
}
public String getbookByName(String bookName){
String name=null;
for(String book:bookNames){
    if(book==bookName){
    name=book;
    System.out.println(bookName+" Is added");
     break;
}
}
if(name==null){
System.out.println(bookName+" not available");
}
return name;
}
public boolean updatebookName(String existingBookName,String updatedBookName){
boolean isBookUpdated=false;
for(int index=0;index<bookNames.length;index++){
 if(bookNames[index]==existingBookName){
  bookNames[index]=updatedBookName;
    isBookUpdated=true;
}
}

 if(isBookUpdated==false){
  System.out.println(existingBookName+" is not found");
 }
return isBookUpdated;
}

public boolean deleteBook(String bookName){
boolean isDeleted=false;
for(int index=0; index<bookNames.length; index++){
if(bookNames[index]==bookName){
   bookNames[index]=null;
   isDeleted=true;
   System.out.println(bookName+" is deleted");
}
}

 if(isDeleted==false){
 System.out.println(bookName+" is not found");
}

return isDeleted;
}
}