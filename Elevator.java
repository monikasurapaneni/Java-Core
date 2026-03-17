class Elevator{

    static int maxFloor = 10;
    static int minFloor = 0;
    static int currentFloor;

    static int getFloor(){
        return currentFloor;
    }

    static void goUp(){
        if(currentFloor < maxFloor){
            currentFloor++;
            System.out.println("Elevator moved up to floor: " + currentFloor);
        }
        else{
            System.out.println("Top floor reached");
        }
    }

    static void goDown(){
        if(currentFloor > minFloor){
            currentFloor--;
            System.out.println("Elevator moved down to floor: " + currentFloor);
        }
        else{
            System.out.println("Ground floor reached");
        }
    }
}