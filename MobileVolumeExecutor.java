class MobileVolumeExecutor{
    public static void main(String[] args){

        MobileVolume.power();

        int volume = MobileVolume.getVolume();
        System.out.println("Current Volume: " + volume);

        MobileVolume.increaseVolume();
        MobileVolume.increaseVolume();

        volume = MobileVolume.getVolume();
        System.out.println("Volume after increase: " + volume);

        MobileVolume.decreaseVolume();

        volume = MobileVolume.getVolume();
        System.out.println("Volume after decrease: " + volume);
    }
}