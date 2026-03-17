class Light{

    static int maxBrightness = 10;
    static int minBrightness = 0;
    static int currentBrightness;
    static boolean isOn;

    static void power(){
        if(isOn == false){
            isOn = true;
        }
        else{
            isOn = false;
        }
    }

    static int getBrightness(){
        return currentBrightness;
    }

    static void increaseBrightness(){
        if(isOn){
            if(currentBrightness < maxBrightness){
                currentBrightness = currentBrightness + 1;
                System.out.println("Brightness increased to: " + currentBrightness);
            }
            else{
                System.out.println("Brightness is already maximum");
            }
        }
        else{
            System.out.println("Light is off");
        }
    }

    static void decreaseBrightness(){
        if(isOn){
            if(currentBrightness > minBrightness){
                currentBrightness = currentBrightness - 1;
                System.out.println("Brightness decreased to: " + currentBrightness);
            }
            else{
                System.out.println("Brightness is already minimum");
            }
        }
        else{
            System.out.println("Light is off");
        }
    }
}