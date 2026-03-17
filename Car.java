class Car{

    static int maxSpeed = 120;
    static int minSpeed = 0;
    static int currentSpeed;
    static boolean isStarted;

    static void startStop(){
        if(isStarted == false){
            isStarted = true;
        }
        else{
            isStarted = false;
        }
    }

    static int getSpeed(){
        return currentSpeed;
    }

    static void accelerate(){
        if(isStarted){
            if(currentSpeed < maxSpeed){
                currentSpeed = currentSpeed + 10;
                System.out.println("Speed increased to: " + currentSpeed);
            }
            else{
                System.out.println("Car already at maximum speed");
            }
        }
        else{
            System.out.println("Car is not started");
        }
    }

    static void brake(){
        if(isStarted){
            if(currentSpeed > minSpeed){
                currentSpeed = currentSpeed - 10;
                System.out.println("Speed decreased to: " + currentSpeed);
            }
            else{
                System.out.println("Car already stopped");
            }
        }
        else{
            System.out.println("Car is not started");
        }
    }
}