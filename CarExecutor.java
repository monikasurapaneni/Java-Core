class CarExecutor{
    public static void main(String[] args){

        Car.startStop();

        int speed = Car.getSpeed();
        System.out.println("Current Speed: " + speed);

        Car.accelerate();
        Car.accelerate();

        speed = Car.getSpeed();
        System.out.println("Speed after increase: " + speed);

        Car.brake();

        speed = Car.getSpeed();
        System.out.println("Speed after decrease: " + speed);
    }
}