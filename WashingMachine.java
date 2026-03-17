class WashingMachine{

    static int maxMode = 5;
    static int minMode = 0;
    static int currentMode;
    static boolean isOn;

    static void power(){
        if(isOn == false){
            isOn = true;
        }
        else{
            isOn = false;
        }
    }

    static int getMode(){
        return currentMode;
    }

    static void nextMode(){
        if(isOn){
            if(currentMode < maxMode){
                currentMode++;
                System.out.println("Mode changed to: " + currentMode);
            }
            else{
                System.out.println("Already in highest mode");
            }
        }
        else{
            System.out.println("Machine is off");
        }
    }

    static void previousMode(){
        if(isOn){
            if(currentMode > minMode){
                currentMode--;
                System.out.println("Mode changed to: " + currentMode);
            }
            else{
                System.out.println("Already in lowest mode");
            }
        }
        else{
            System.out.println("Machine is off");
        }
    }
}