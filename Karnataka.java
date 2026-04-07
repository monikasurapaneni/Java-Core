class Karnataka{
  int pincodes[] =new int[5];
  int index;
  public boolean addPincode(int pincode){
  boolean isPincodesAdded = false;
  if(pincode!=0 && pincode>0){
    pincodes[index++]=pincode;
	
	return isPincodesAdded=true;
  }
  else System.out.println(pincode + "is invalid");
  
  return isPincodesAdded;
  }
  
  public void getPincode(){
  for(int pincode:pincodes){
   System.out.println(" The Availalble pincodes are " + pincode);
   }
   }
   }