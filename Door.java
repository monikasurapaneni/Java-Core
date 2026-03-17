class Door{

    static boolean isLocked = true;

    static void toggleLock(){
        if(isLocked){
            isLocked = false;
            System.out.println("Door Unlocked");
        }
        else{
            isLocked = true;
            System.out.println("Door Locked");
        }
    }

    static boolean getStatus(){
        return isLocked;
    }
}