class StudyLamp{

    static int maxLevel = 5;
    static int minLevel = 0;
    static int currentLevel;
    static boolean isOn;

    static void power(){
        if(isOn == false){
            isOn = true;
        }else{
            isOn = false;
        }
    }

    static int getLevel(){
        return currentLevel;
    }

    static void increaseLevel(){
        if(isOn){
            if(currentLevel < maxLevel){
                currentLevel++;
                System.out.println("Brightness increased to: " + currentLevel);
            }else{
                System.out.println("Brightness already maximum");
            }
        }else{
            System.out.println("Lamp is off");
        }
    }

    static void decreaseLevel(){
        if(isOn){
            if(currentLevel > minLevel){
                currentLevel--;
                System.out.println("Brightness decreased to: " + currentLevel);
            }else{
                System.out.println("Brightness already minimum");
            }
        }else{
            System.out.println("Lamp is off");
        }
    }
}