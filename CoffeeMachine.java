class CoffeeMachine{

    static int maxLevel = 5;
    static int minLevel = 1;
    static int currentLevel = 1;

    static int getStrength(){
        return currentLevel;
    }

    static void increaseStrength(){
        if(currentLevel < maxLevel){
            currentLevel++;
            System.out.println("Coffee strength increased to: " + currentLevel);
        }else{
            System.out.println("Already at maximum strength");
        }
    }

    static void decreaseStrength(){
        if(currentLevel > minLevel){
            currentLevel--;
            System.out.println("Coffee strength decreased to: " + currentLevel);
        }else{
            System.out.println("Already at minimum strength");
        }
    }
}