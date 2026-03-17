class WaterTank{

    static int maxLevel = 10;
    static int minLevel = 0;
    static int currentLevel;

    static int getLevel(){
        return currentLevel;
    }

    static void fillWater(){
        if(currentLevel < maxLevel){
            currentLevel++;
            System.out.println("Water level increased to: " + currentLevel);
        }
        else{
            System.out.println("Tank is full");
        }
    }

    static void useWater(){
        if(currentLevel > minLevel){
            currentLevel--;
            System.out.println("Water level decreased to: " + currentLevel);
        }
        else{
            System.out.println("Tank is empty");
        }
    }
}