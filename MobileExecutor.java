class MobileExecutor{
    public static void main(String[] args){

        Mobile.power();

        int brightness = Mobile.getBrightness();
        System.out.println("Current Brightness: " + brightness);

        Mobile.increaseBrightness();
        Mobile.increaseBrightness();

        brightness = Mobile.getBrightness();
        System.out.println("Brightness after increase: " + brightness);

        Mobile.decreaseBrightness();

        brightness = Mobile.getBrightness();
        System.out.println("Brightness after decrease: " + brightness);
    }
}