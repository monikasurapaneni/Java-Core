class WashingMachineExecutor{
    public static void main(String[] args){

        WashingMachine.power();

        int mode = WashingMachine.getMode();
        System.out.println("Current Mode: " + mode);

        WashingMachine.nextMode();
        WashingMachine.nextMode();

        mode = WashingMachine.getMode();
        System.out.println("Mode after change: " + mode);

        WashingMachine.previousMode();

        mode = WashingMachine.getMode();
        System.out.println("Mode after decrease: " + mode);
    }
}