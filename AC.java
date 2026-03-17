class AC{

    static int maxTemp = 30;
    static int minTemp = 16;
    static int currentTemp = 20;
    static boolean isOn;

    static void power(){
        if(isOn == false){
            isOn = true;
        }
        else{
            isOn = false;
        }
    }

    static int getTemperature(){
        return currentTemp;
    }

    static void increaseTemp(){
        if(isOn){
            if(currentTemp < maxTemp){
                currentTemp++;
                System.out.println("Temperature increased to: " + currentTemp);
            }
            else{
                System.out.println("Temperature already maximum");
            }
        }
        else{
            System.out.println("AC is off");
        }
    }

    static void decreaseTemp(){
        if(isOn){
            if(currentTemp > minTemp){
                currentTemp--;
                System.out.println("Temperature decreased to: " + currentTemp);
            }
            else{
                System.out.println("Temperature already minimum");
            }
        }
        else{
            System.out.println("AC is off");
        }
    }
}