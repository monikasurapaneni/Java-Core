class CoffeeMachineExecutor{
    public static void main(String[] args){

        int strength = CoffeeMachine.getStrength();
        System.out.println("Current Strength: " + strength);

        CoffeeMachine.increaseStrength();
        CoffeeMachine.increaseStrength();

        strength = CoffeeMachine.getStrength();
        System.out.println("Strength after increase: " + strength);

        CoffeeMachine.decreaseStrength();

        strength = CoffeeMachine.getStrength();
        System.out.println("Strength after decrease: " + strength);
    }
}