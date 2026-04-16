class BrainWaveExecutor {

    public static void main(String[] args){

        BrainWave waveOne = new BrainWave();
        waveOne.waveId = 1;
        waveOne.intensity = "High";
        waveOne.state = "Active";

        BrainWave waveTwo = new BrainWave();
        waveTwo.waveId = 2;
        waveTwo.intensity = "Medium";
        waveTwo.state = "Relaxed";

        BrainWave waveThree = new BrainWave();
        waveThree.waveId = 3;
        waveThree.intensity = "Low";
        waveThree.state = "Sleep";

        BrainWave waveFour = new BrainWave();
        waveFour.waveId = 4;
        waveFour.intensity = "High";
        waveFour.state = "Focused";

        BrainWave waveFive = new BrainWave();
        waveFive.waveId = 5;
        waveFive.intensity = "Medium";
        waveFive.state = "Calm";

        BrainWave waveSix = new BrainWave();
        waveSix.waveId = 6;
        waveSix.intensity = "Low";
        waveSix.state = "Drowsy";

        BrainWave waveSeven = new BrainWave();
        waveSeven.waveId = 7;
        waveSeven.intensity = "High";
        waveSeven.state = "Alert";

        BrainWave waveEight = new BrainWave();
        waveEight.waveId = 8;
        waveEight.intensity = "Medium";
        waveEight.state = "Neutral";

        BrainWave waveNine = new BrainWave();
        waveNine.waveId = 9;
        waveNine.intensity = "Low";
        waveNine.state = "Rest";

        BrainWave waveTen = new BrainWave();
        waveTen.waveId = 10;
        waveTen.intensity = "High";
        waveTen.state = "Thinking";

        BrainWave waveEleven = new BrainWave();
        waveEleven.waveId = 11;
        waveEleven.intensity = "Medium";
        waveEleven.state = "Calm";

        BrainWave waveTwelve = new BrainWave();
        waveTwelve.waveId = 12;
        waveTwelve.intensity = "Low";
        waveTwelve.state = "Sleep";

        BrainWave waveThirteen = new BrainWave();
        waveThirteen.waveId = 13;
        waveThirteen.intensity = "High";
        waveThirteen.state = "Focused";

        BrainWave waveFourteen = new BrainWave();
        waveFourteen.waveId = 14;
        waveFourteen.intensity = "Medium";
        waveFourteen.state = "Relaxed";

        BrainWave waveFifteen = new BrainWave();
        waveFifteen.waveId = 15;
        waveFifteen.intensity = "Low";
        waveFifteen.state = "Idle";

        BrainWave waves[] = new BrainWave[15];
        waves[0] = waveOne;
        waves[1] = waveTwo;
        waves[2] = waveThree;
        waves[3] = waveFour;
        waves[4] = waveFive;
        waves[5] = waveSix;
        waves[6] = waveSeven;
        waves[7] = waveEight;
        waves[8] = waveNine;
        waves[9] = waveTen;
        waves[10] = waveEleven;
        waves[11] = waveTwelve;
        waves[12] = waveThirteen;
        waves[13] = waveFourteen;
        waves[14] = waveFifteen;

        for(BrainWave wave : waves){
            System.out.println("The wave Id is " + wave.waveId);
            System.out.println("The intensity is " + wave.intensity);
            System.out.println("The state is " + wave.state);
            System.out.println("                     ");
        }
    }
}