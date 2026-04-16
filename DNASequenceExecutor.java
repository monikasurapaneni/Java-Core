class DNASequenceExecutor {

    public static void main(String[] args){

        DNASequence seqOne = new DNASequence();
        seqOne.sequenceId = 1;
        seqOne.type = "ATCG";
        seqOne.length = 120;

        DNASequence seqTwo = new DNASequence();
        seqTwo.sequenceId = 2;
        seqTwo.type = "CGTA";
        seqTwo.length = 150;

        DNASequence seqThree = new DNASequence();
        seqThree.sequenceId = 3;
        seqThree.type = "TTAA";
        seqThree.length = 90;

        DNASequence seqFour = new DNASequence();
        seqFour.sequenceId = 4;
        seqFour.type = "GGCC";
        seqFour.length = 200;

        DNASequence seqFive = new DNASequence();
        seqFive.sequenceId = 5;
        seqFive.type = "AATT";
        seqFive.length = 110;

        DNASequence seqSix = new DNASequence();
        seqSix.sequenceId = 6;
        seqSix.type = "CCGG";
        seqSix.length = 140;

        DNASequence seqSeven = new DNASequence();
        seqSeven.sequenceId = 7;
        seqSeven.type = "TAGC";
        seqSeven.length = 130;

        DNASequence seqEight = new DNASequence();
        seqEight.sequenceId = 8;
        seqEight.type = "GCTA";
        seqEight.length = 160;

        DNASequence seqNine = new DNASequence();
        seqNine.sequenceId = 9;
        seqNine.type = "ATAT";
        seqNine.length = 100;

        DNASequence seqTen = new DNASequence();
        seqTen.sequenceId = 10;
        seqTen.type = "CGCG";
        seqTen.length = 180;

        DNASequence seqEleven = new DNASequence();
        seqEleven.sequenceId = 11;
        seqEleven.type = "TATA";
        seqEleven.length = 95;

        DNASequence seqTwelve = new DNASequence();
        seqTwelve.sequenceId = 12;
        seqTwelve.type = "GCGC";
        seqTwelve.length = 170;

        DNASequence seqThirteen = new DNASequence();
        seqThirteen.sequenceId = 13;
        seqThirteen.type = "AAGG";
        seqThirteen.length = 125;

        DNASequence seqFourteen = new DNASequence();
        seqFourteen.sequenceId = 14;
        seqFourteen.type = "TTCC";
        seqFourteen.length = 135;

        DNASequence seqFifteen = new DNASequence();
        seqFifteen.sequenceId = 15;
        seqFifteen.type = "GGTT";
        seqFifteen.length = 145;

        DNASequence sequences[] = new DNASequence[15];
        sequences[0] = seqOne;
        sequences[1] = seqTwo;
        sequences[2] = seqThree;
        sequences[3] = seqFour;
        sequences[4] = seqFive;
        sequences[5] = seqSix;
        sequences[6] = seqSeven;
        sequences[7] = seqEight;
        sequences[8] = seqNine;
        sequences[9] = seqTen;
        sequences[10] = seqEleven;
        sequences[11] = seqTwelve;
        sequences[12] = seqThirteen;
        sequences[13] = seqFourteen;
        sequences[14] = seqFifteen;

        for(DNASequence seq : sequences){
            System.out.println("The sequence Id is " + seq.sequenceId);
            System.out.println("The type is " + seq.type);
            System.out.println("The length is " + seq.length);
            System.out.println("                     ");
        }
    }
}