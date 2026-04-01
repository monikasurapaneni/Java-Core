class Bangalore {

    String cityName;
    String state;
    int population;
    String famousFor;
    String climate;

    MallOfAsia mall; 

    public void getBangaloreDetails() {
        System.out.println("City Details:");
        System.out.println("City Name: " + cityName);
        System.out.println("State: " + state);
        System.out.println("Population: " + population);
        System.out.println("Famous For: " + famousFor);
        System.out.println("Climate: " + climate);
        System.out.println("--------------------------------");

        mall.getMallDetails();

        System.out.println("=================================");
    }
}