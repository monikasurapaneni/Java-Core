class AirPurifier{

    static int maxSpeed = 5;
    static int minSpeed = 0;
    static int currentSpeed;
    static boolean isOn;

    static void power(){
        if(isOn == false){
            isOn = true;
        }else{
            isOn = false;
        }
    }

    static int getSpeed(){
        return currentSpeed;
    }

    static void increaseSpeed(){
        if(isOn){
            if(currentSpeed < maxSpeed){
                currentSpeed++;
                System.out.println("Speed increased to: " + currentSpeed);
            }else{
                System.out.println("Already at maximum speed");
            }
        }else{
            System.out.println("Air purifier is off");
        }
    }

    static void decreaseSpeed(){
        if(isOn){
            if(currentSpeed > minSpeed){
                currentSpeed--;
                System.out.println("Speed decreased to: " + currentSpeed);
            }else{
                System.out.println("Already at minimum speed");
            }
        }else{
            System.out.println("Air purifier is off");
        }
    }
}