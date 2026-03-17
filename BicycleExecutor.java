class BicycleExecutor{
    public static void main(String[] args){

        int gear = Bicycle.getGear();
        System.out.println("Current Gear: " + gear);

        Bicycle.gearUp();
        Bicycle.gearUp();

        gear = Bicycle.getGear();
        System.out.println("Gear after increase: " + gear);

        Bicycle.gearDown();

        gear = Bicycle.getGear();
        System.out.println("Gear after decrease: " + gear);
    }
}