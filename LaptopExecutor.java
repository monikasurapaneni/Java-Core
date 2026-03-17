class LaptopExecutor{
    public static void main(String[] args){

        Laptop.power();

        int volume = Laptop.getVolume();
        System.out.println("Current Volume: " + volume);

        Laptop.increaseVolume();
        Laptop.increaseVolume();

        volume = Laptop.getVolume();
        System.out.println("Volume after increase: " + volume);

        Laptop.decreaseVolume();

        volume = Laptop.getVolume();
        System.out.println("Volume after decrease: " + volume);
    }
}