class TVChannel{

    static int maxChannel = 100;
    static int minChannel = 1;
    static int currentChannel = 1;
    static boolean isOn;

    static void power(){
        if(isOn == false){
            isOn = true;
        }else{
            isOn = false;
        }
    }

    static int getChannel(){
        return currentChannel;
    }

    static void nextChannel(){
        if(isOn){
            if(currentChannel < maxChannel){
                currentChannel++;
                System.out.println("Channel changed to: " + currentChannel);
            }else{
                System.out.println("Already at last channel");
            }
        }else{
            System.out.println("TV is off");
        }
    }

    static void previousChannel(){
        if(isOn){
            if(currentChannel > minChannel){
                currentChannel--;
                System.out.println("Channel changed to: " + currentChannel);
            }else{
                System.out.println("Already at first channel");
            }
        }else{
            System.out.println("TV is off");
        }
    }
}