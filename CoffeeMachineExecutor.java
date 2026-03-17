class CoffeeMachineExecutor {

    public static void main(String[] args) {

        System.out.println("Main Started");

        System.out.println("Brand: " + CoffeeMachine.getBrand());
        System.out.println("Type: " + CoffeeMachine.getType());
        System.out.println("Water Tank: " + CoffeeMachine.getWaterTankCapacity() + "L");
        System.out.println("Power: " + CoffeeMachine.getPower() + "W");
        System.out.println("Price: " + CoffeeMachine.getPrice());

        System.out.println("Main Ended");
    }
}