class DoorExecutor{
    public static void main(String[] args){

        boolean status = Door.getStatus();
        System.out.println("Door Locked: " + status);

        Door.toggleLock();
        Door.toggleLock();

        status = Door.getStatus();
        System.out.println("Door Locked: " + status);
    }
}