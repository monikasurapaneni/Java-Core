class MusicPlayer{

    static int maxVolume = 15;
    static int minVolume = 0;
    static int currentVolume;
    static boolean isPlaying;

    static void playPause(){
        if(isPlaying == false){
            isPlaying = true;
        }
        else{
            isPlaying = false;
        }
    }

    static int getVolume(){
        return currentVolume;
    }

    static void increaseVolume(){
        if(isPlaying){
            if(currentVolume < maxVolume){
                currentVolume++;
                System.out.println("Volume increased to: " + currentVolume);
            }
            else{
                System.out.println("Volume already maximum");
            }
        }
        else{
            System.out.println("Music player is paused");
        }
    }

    static void decreaseVolume(){
        if(isPlaying){
            if(currentVolume > minVolume){
                currentVolume--;
                System.out.println("Volume decreased to: " + currentVolume);
            }
            else{
                System.out.println("Volume already minimum");
            }
        }
        else{
            System.out.println("Music player is paused");
        }
    }
}