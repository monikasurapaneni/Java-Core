class StudyLampExecutor{
    public static void main(String[] args){

        StudyLamp.power();

        int level = StudyLamp.getLevel();
        System.out.println("Current Brightness: " + level);

        StudyLamp.increaseLevel();
        StudyLamp.increaseLevel();

        level = StudyLamp.getLevel();
        System.out.println("Brightness after increase: " + level);

        StudyLamp.decreaseLevel();

        level = StudyLamp.getLevel();
        System.out.println("Brightness after decrease: " + level);
    }
}