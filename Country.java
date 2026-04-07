class Country{

String states[]= new String[29];
int index;

public boolean addState(String state){
boolean isStatesAdded=false;

if(index<states.length){

if(state!=null && !state.isEmpty()){
states[index++]=state;
isStatesAdded=true;
}else  System.out.println("The states added is invalid");

}else System.out.println("The Country is full of States");
return isStatesAdded;
}

public void getStates(){
	for(String state:states){
		System.out.println(state);
}
}
public String getStateByName(String stateName){
	String name =null;
	for(String state:states){
		  
	  if(stateName==state){
		  name= state;
		  
		  System.out.println(stateName + "Is added");
		  break;
	  }
	  
	}
	
	if(name==null){
		  System.out.println(stateName + "not available");
	  
      }
	return name;
  }
	public boolean updateState(String existingStateName, String updatedStateName){
		boolean isStateUpdated=false;
		for(int index=0;index < states.length;index++){
			if(states[index]== existingStateName){
				states[index]=updatedStateName;
			isStateUpdated=true;
		}
		}	
		if(isStateUpdated==false){
			System.out.println(existingStateName + " is not found");
		}
		
		return isStateUpdated;
		
}
public boolean deleteState(String stateName){
boolean isDeleted=false;

for(int index=0;index<states.length;index++){
if(states[index]==stateName){
states[index]=null;
isDeleted=true;
System.out.println(stateName+" is deleted");
}
}

if(isDeleted==false){
System.out.println(stateName+" is not found");
}

return isDeleted;
}
}
