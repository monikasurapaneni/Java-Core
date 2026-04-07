class Ibacco{

String icecreams[]= new String[10];
int index;

 public boolean addIcecream(String icecream){
 boolean isIceCreamAdded =true;
 
 if(index<icecreams.length){
 if(icecream!=null && !icecream.isEmpty()){
  icecreams[index ++]= icecream;
  
  isIceCreamAdded=true;
  }
   else System.out.println("icecream" + "is not valid");
 }else System.out.println("Ibacco is full in Icecreams");
  return isIceCreamAdded;
   }
   
   public void  getIceCream(){
  
    for(String icecream: icecreams){
		 System.out.println(icecream);
   }
  }
  
  public String geticecreambyname(String icecreamName){
	String name =null;
	for(String icecream:icecreams){
		  
	  if(icecreamName==icecream){
		  name= icecream;
		  
		  System.out.println(icecreamName + "Is added");
		  break;
	  }
	  
	}
	
	if(name==null){
		  System.out.println(icecreamName + "not available");
	  
      }
	return name;
  }
	public boolean updateIcecream(String existingIcecreamName, String updatedIceCreamName){
		boolean isIceCreamUpdated=false;
		for(int index=0;index < icecreams.length;index++){
			if(icecreams[index]== existingIcecreamName){
				icecreams[index]=updatedIceCreamName;
			isIceCreamUpdated=true;
		}
		}	
		if(isIceCreamUpdated==false){
			System.out.println(existingIcecreamName + " is not found");
		}
		
		return isIceCreamUpdated;
		
}
}