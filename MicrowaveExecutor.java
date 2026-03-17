class MicrowaveExecutor{
    public static void main(String[] args){

        Microwave.power();

        int time = Microwave.getTime();
        System.out.println("Current Time: " + time);

        Microwave.increaseTime();
        Microwave.increaseTime();

        time = Microwave.getTime();
        System.out.println("Time after increase: " + time);

        Microwave.decreaseTime();

        time = Microwave.getTime();
        System.out.println("Time after decrease: " + time);
    }
}