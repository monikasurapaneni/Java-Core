class WaterTankExecutor{
    public static void main(String[] args){

        int level = WaterTank.getLevel();
        System.out.println("Current Water Level: " + level);

        WaterTank.fillWater();
        WaterTank.fillWater();

        level = WaterTank.getLevel();
        System.out.println("Water Level after filling: " + level);

        WaterTank.useWater();

        level = WaterTank.getLevel();
        System.out.println("Water Level after use: " + level);
    }
}