class Treadmill{

    static int maxSpeed = 12;
    static int minSpeed = 0;
    static int currentSpeed;
    static boolean isRunning;

    static void startStop(){
        if(isRunning == false){
            isRunning = true;
        }else{
            isRunning = false;
        }
    }

    static int getSpeed(){
        return currentSpeed;
    }

    static void increaseSpeed(){
        if(isRunning){
            if(currentSpeed < maxSpeed){
                currentSpeed++;
                System.out.println("Speed increased to: " + currentSpeed);
            }else{
                System.out.println("Maximum speed reached");
            }
        }else{
            System.out.println("Treadmill is stopped");
        }
    }

    static void decreaseSpeed(){
        if(isRunning){
            if(currentSpeed > minSpeed){
                currentSpeed--;
                System.out.println("Speed decreased to: " + currentSpeed);
            }else{
                System.out.println("Minimum speed reached");
            }
        }else{
            System.out.println("Treadmill is stopped");
        }
    }
}