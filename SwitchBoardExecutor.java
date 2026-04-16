class SwitchBoardExecutor{
public static void main(String[]args){

SwitchBoard switchboardOne=new SwitchBoard();

switchboardOne.boardId=1;
switchboardOne.numberOfSwitches=4;
switchboardOne.numberOfSockets=7;

SwitchBoard switchboardTwo=new SwitchBoard();

switchboardTwo.boardId=2;
switchboardTwo.numberOfSwitches=4;
switchboardTwo.numberOfSockets=9;

SwitchBoard switchboardThree=new SwitchBoard();

switchboardThree.boardId=3;
switchboardThree.numberOfSwitches=7;
switchboardThree.numberOfSockets=8;

SwitchBoard switchboardFour=new SwitchBoard();

switchboardFour.boardId=4;
switchboardFour.numberOfSwitches=2;
switchboardFour.numberOfSockets=10;

SwitchBoard switchboardFive=new SwitchBoard();

switchboardFive.boardId=5;
switchboardFive.numberOfSwitches=56;
switchboardFive.numberOfSockets=9;

SwitchBoard switchboardSix=new SwitchBoard();

switchboardSix.boardId=6;
switchboardSix.numberOfSwitches=8;
switchboardSix.numberOfSockets=34;

SwitchBoard switchboardSeven=new SwitchBoard();

switchboardSeven.boardId=7;
switchboardSeven.numberOfSwitches=4;
switchboardSeven.numberOfSockets=11;

SwitchBoard switchboardEight=new SwitchBoard();

switchboardEight.boardId=8;
switchboardEight.numberOfSwitches=7;
switchboardEight.numberOfSockets=9;

SwitchBoard switchboardNine=new SwitchBoard();

switchboardNine.boardId=9;
switchboardNine.numberOfSwitches=6;
switchboardNine.numberOfSockets=10;

SwitchBoard switchboardTen=new SwitchBoard();

switchboardTen.boardId=10;
switchboardTen.numberOfSwitches=14;
switchboardTen.numberOfSockets=9;

SwitchBoard switchboardEleven=new SwitchBoard();

switchboardEleven.boardId=11;
switchboardEleven.numberOfSwitches=21;
switchboardEleven.numberOfSockets=4;

SwitchBoard switchboardTwelve=new SwitchBoard();

switchboardTwelve.boardId=12;
switchboardTwelve.numberOfSwitches=13;
switchboardTwelve.numberOfSockets=6;

SwitchBoard switchboardThirteen=new SwitchBoard();

switchboardThirteen.boardId=13;
switchboardThirteen.numberOfSwitches=23;
switchboardThirteen.numberOfSockets=7;

SwitchBoard switchboardFourteen=new SwitchBoard();

switchboardFourteen.boardId=14;
switchboardFourteen.numberOfSwitches=11;
switchboardFourteen.numberOfSockets=9;

SwitchBoard switchboardFifteen=new SwitchBoard();

switchboardFifteen.boardId=15;
switchboardFifteen.numberOfSwitches=6;
switchboardFifteen.numberOfSockets=3;

SwitchBoard switchboards[] = new SwitchBoard[15];
switchboards[0]=switchboardOne;
switchboards[1]=switchboardTwo;
switchboards[2]=switchboardThree;
switchboards[3]=switchboardFour;
switchboards[4]=switchboardFive;
switchboards[5]=switchboardSix;
switchboards[6]=switchboardSeven;
switchboards[7]=switchboardEight;
switchboards[8]=switchboardNine;
switchboards[9]=switchboardTen;
switchboards[10]=switchboardEleven;
switchboards[11]=switchboardTwelve;
switchboards[12]=switchboardThirteen;
switchboards[13]=switchboardFourteen;
switchboards[14]= switchboardFifteen;

for(SwitchBoard switchboard:switchboards){
System.out.println("The switchboard Id is "+switchboard.boardId);
 System.out.println(" The switch board number of switches is"+ switchboard.numberOfSwitches );
 System.out.println("The switch board number of sockets are" + switchboard.numberOfSockets);
 System.out.println("                              ");
}
}
}