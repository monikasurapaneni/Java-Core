class TV{

    static int maxVolume = 20;
    static int minVolume = 0;
    static int currentVolume;
    static boolean isOn;

    static void power(){
        if(isOn == false){
            isOn = true;
        }
        else{
            isOn = false;
        }
    }

    static int getVolume(){
        return currentVolume;
    }

    static void increaseVolume(){
        if(isOn){
            if(currentVolume < maxVolume){
                currentVolume++;
                System.out.println("Volume increased to: " + currentVolume);
            }
            else{
                System.out.println("Volume already at maximum");
            }
        }
        else{
            System.out.println("TV is off");
        }
    }

    static void decreaseVolume(){
        if(isOn){
            if(currentVolume > minVolume){
                currentVolume--;
                System.out.println("Volume decreased to: " + currentVolume);
            }
            else{
                System.out.println("Volume already at minimum");
            }
        }
        else{
            System.out.println("TV is off");
        }
    }
}