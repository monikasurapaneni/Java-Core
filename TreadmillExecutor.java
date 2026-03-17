class TreadmillExecutor{
    public static void main(String[] args){

        Treadmill.startStop();

        int speed = Treadmill.getSpeed();
        System.out.println("Current Speed: " + speed);

        Treadmill.increaseSpeed();
        Treadmill.increaseSpeed();

        speed = Treadmill.getSpeed();
        System.out.println("Speed after increase: " + speed);

        Treadmill.decreaseSpeed();

        speed = Treadmill.getSpeed();
        System.out.println("Speed after decrease: " + speed);
    }
}