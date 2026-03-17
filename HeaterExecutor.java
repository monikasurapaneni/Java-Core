class HeaterExecutor{
    public static void main(String[] args){

        Heater.power();

        int temp = Heater.getTemperature();
        System.out.println("Current Temperature: " + temp);

        Heater.increaseTemp();
        Heater.increaseTemp();

        temp = Heater.getTemperature();
        System.out.println("Temperature after increase: " + temp);

        Heater.decreaseTemp();

        temp = Heater.getTemperature();
        System.out.println("Temperature after decrease: " + temp);
    }
}