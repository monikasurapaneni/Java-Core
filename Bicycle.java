class Bicycle{

    static int maxGear = 6;
    static int minGear = 1;
    static int currentGear = 1;

    static int getGear(){
        return currentGear;
    }

    static void gearUp(){
        if(currentGear < maxGear){
            currentGear++;
            System.out.println("Gear increased to: " + currentGear);
        }else{
            System.out.println("Already at highest gear");
        }
    }

    static void gearDown(){
        if(currentGear > minGear){
            currentGear--;
            System.out.println("Gear decreased to: " + currentGear);
        }else{
            System.out.println("Already at lowest gear");
        }
    }
}