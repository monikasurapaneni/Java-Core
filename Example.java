class Tv{

static boolean isConnected;
static int currentVolume;
static int maxVolume =7;
static int minVolume;

public static void onOrOff(){
System.out.println("onOrOff started ");
if(isConnected ==  false)
{
isConnected=true;
}else{
isConnected == false;
}

System.out.println("onOrOff ended");
}

increaseVolume(){
 if(isConnected){
 if(currentVolume< maxVolume){
 currentVolume=currentVolume+1;
 sop("The currentVolume is"+ currentVolume)
 }else{
 }
 
 else{
 sop("the tv is off");
 }
 


}









