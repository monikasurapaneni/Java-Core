class ElevatorExecutor{
    public static void main(String[] args){

        int floor = Elevator.getFloor();
        System.out.println("Current Floor: " + floor);

        Elevator.goUp();
        Elevator.goUp();

        floor = Elevator.getFloor();
        System.out.println("Floor after going up: " + floor);

        Elevator.goDown();

        floor = Elevator.getFloor();
        System.out.println("Floor after going down: " + floor);
    }
}