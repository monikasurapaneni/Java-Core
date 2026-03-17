class TVExecutor{
    public static void main(String[] args){

        TV.power();

        int volume = TV.getVolume();
        System.out.println("Current Volume: " + volume);

        TV.increaseVolume();
        TV.increaseVolume();

        volume = TV.getVolume();
        System.out.println("Volume after increase: " + volume);

        TV.decreaseVolume();

        volume = TV.getVolume();
        System.out.println("Volume after decrease: " + volume);
    }
}