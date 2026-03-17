class TVChannelExecutor{
    public static void main(String[] args){

        TVChannel.power();

        int channel = TVChannel.getChannel();
        System.out.println("Current Channel: " + channel);

        TVChannel.nextChannel();
        TVChannel.nextChannel();

        channel = TVChannel.getChannel();
        System.out.println("Channel after change: " + channel);

        TVChannel.previousChannel();

        channel = TVChannel.getChannel();
        System.out.println("Channel after decrease: " + channel);
    }
}