class Heater{

    static int maxTemp = 40;
    static int minTemp = 20;
    static int currentTemp = 25;
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
            System.out.println("Heater is off");
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
            System.out.println("Heater is off");
        }
    }
}