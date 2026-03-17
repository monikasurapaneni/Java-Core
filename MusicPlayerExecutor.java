class MusicPlayerExecutor{
    public static void main(String[] args){

        MusicPlayer.playPause();

        int volume = MusicPlayer.getVolume();
        System.out.println("Current Volume: " + volume);

        MusicPlayer.increaseVolume();
        MusicPlayer.increaseVolume();

        volume = MusicPlayer.getVolume();
        System.out.println("Volume after increase: " + volume);

        MusicPlayer.decreaseVolume();

        volume = MusicPlayer.getVolume();
        System.out.println("Volume after decrease: " + volume);
    }
}