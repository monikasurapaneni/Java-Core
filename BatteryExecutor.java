class BatteryExecutor{
    public static void main(String[] args){

        int level = Battery.getLevel();
        System.out.println("Current Battery Level: " + level);

        Battery.charge();
        Battery.charge();

        level = Battery.getLevel();
        System.out.println("Battery after charging: " + level);

        Battery.useBattery();

        level = Battery.getLevel();
        System.out.println("Battery after usage: " + level);
    }
}