class ACExecutor{
    public static void main(String[] args){

        AC.power();

        int temp = AC.getTemperature();
        System.out.println("Current Temperature: " + temp);

        AC.increaseTemp();
        AC.increaseTemp();

        temp = AC.getTemperature();
        System.out.println("Temperature after increase: " + temp);

        AC.decreaseTemp();

        temp = AC.getTemperature();
        System.out.println("Temperature after decrease: " + temp);
    }
}