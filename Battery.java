class Battery{

    static int maxLevel = 100;
    static int minLevel = 0;
    static int currentLevel = 50;

    static int getLevel(){
        return currentLevel;
    }

    static void charge(){
        if(currentLevel < maxLevel){
            currentLevel = currentLevel + 10;
            System.out.println("Battery charged to: " + currentLevel);
        }else{
            System.out.println("Battery already full");
        }
    }

    static void useBattery(){
        if(currentLevel > minLevel){
            currentLevel = currentLevel - 10;
            System.out.println("Battery level decreased to: " + currentLevel);
        }else{
            System.out.println("Battery empty");
        }
    }
}