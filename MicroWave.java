class Microwave{

    static int maxTime = 30;
    static int minTime = 0;
    static int currentTime;
    static boolean isOn;

    static void power(){
        if(isOn == false){
            isOn = true;
        }else{
            isOn = false;
        }
    }

    static int getTime(){
        return currentTime;
    }

    static void increaseTime(){
        if(isOn){
            if(currentTime < maxTime){
                currentTime++;
                System.out.println("Time increased to: " + currentTime);
            }else{
                System.out.println("Maximum time reached");
            }
        }else{
            System.out.println("Microwave is off");
        }
    }

    static void decreaseTime(){
        if(isOn){
            if(currentTime > minTime){
                currentTime--;
                System.out.println("Time decreased to: " + currentTime);
            }else{
                System.out.println("Minimum time reached");
            }
        }else{
            System.out.println("Microwave is off");
        }
    }
}