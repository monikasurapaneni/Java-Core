class LightExecutor{
    public static void main(String[] args){

        Light.power();

        int brightness = Light.getBrightness();
        System.out.println("Current Brightness: " + brightness);

        Light.increaseBrightness();
        Light.increaseBrightness();

        brightness = Light.getBrightness();
        System.out.println("Brightness after increase: " + brightness);

        Light.decreaseBrightness();

        brightness = Light.getBrightness();
        System.out.println("Brightness after decrease: " + brightness);
    }
}