class HeatSensorExecutor {

    public static void main(String[] args){

        HeatSensor sensorOne = new HeatSensor();
        sensorOne.sensorId = 1;
        sensorOne.temperature = 32.5;
        sensorOne.status = "Normal";

        HeatSensor sensorTwo = new HeatSensor();
        sensorTwo.sensorId = 2;
        sensorTwo.temperature = 45.2;
        sensorTwo.status = "High";

        HeatSensor sensorThree = new HeatSensor();
        sensorThree.sensorId = 3;
        sensorThree.temperature = 28.0;
        sensorThree.status = "Low";

        HeatSensor sensorFour = new HeatSensor();
        sensorFour.sensorId = 4;
        sensorFour.temperature = 50.1;
        sensorFour.status = "Critical";

        HeatSensor sensorFive = new HeatSensor();
        sensorFive.sensorId = 5;
        sensorFive.temperature = 35.7;
        sensorFive.status = "Normal";

        HeatSensor sensorSix = new HeatSensor();
        sensorSix.sensorId = 6;
        sensorSix.temperature = 40.0;
        sensorSix.status = "High";

        HeatSensor sensorSeven = new HeatSensor();
        sensorSeven.sensorId = 7;
        sensorSeven.temperature = 27.5;
        sensorSeven.status = "Low";

        HeatSensor sensorEight = new HeatSensor();
        sensorEight.sensorId = 8;
        sensorEight.temperature = 48.3;
        sensorEight.status = "Critical";

        HeatSensor sensorNine = new HeatSensor();
        sensorNine.sensorId = 9;
        sensorNine.temperature = 33.3;
        sensorNine.status = "Normal";

        HeatSensor sensorTen = new HeatSensor();
        sensorTen.sensorId = 10;
        sensorTen.temperature = 42.6;
        sensorTen.status = "High";

        HeatSensor sensorEleven = new HeatSensor();
        sensorEleven.sensorId = 11;
        sensorEleven.temperature = 29.4;
        sensorEleven.status = "Low";

        HeatSensor sensorTwelve = new HeatSensor();
        sensorTwelve.sensorId = 12;
        sensorTwelve.temperature = 51.0;
        sensorTwelve.status = "Critical";

        HeatSensor sensorThirteen = new HeatSensor();
        sensorThirteen.sensorId = 13;
        sensorThirteen.temperature = 36.8;
        sensorThirteen.status = "Normal";

        HeatSensor sensorFourteen = new HeatSensor();
        sensorFourteen.sensorId = 14;
        sensorFourteen.temperature = 44.9;
        sensorFourteen.status = "High";

        HeatSensor sensorFifteen = new HeatSensor();
        sensorFifteen.sensorId = 15;
        sensorFifteen.temperature = 30.2;
        sensorFifteen.status = "Low";

        HeatSensor sensors[] = new HeatSensor[15];
        sensors[0] = sensorOne;
        sensors[1] = sensorTwo;
        sensors[2] = sensorThree;
        sensors[3] = sensorFour;
        sensors[4] = sensorFive;
        sensors[5] = sensorSix;
        sensors[6] = sensorSeven;
        sensors[7] = sensorEight;
        sensors[8] = sensorNine;
        sensors[9] = sensorTen;
        sensors[10] = sensorEleven;
        sensors[11] = sensorTwelve;
        sensors[12] = sensorThirteen;
        sensors[13] = sensorFourteen;
        sensors[14] = sensorFifteen;

        for(HeatSensor sensor : sensors){
            System.out.println("The sensor Id is " + sensor.sensorId);
            System.out.println("The temperature is " + sensor.temperature);
            System.out.println("The status is " + sensor.status);
            System.out.println("                     ");
        }
    }
}