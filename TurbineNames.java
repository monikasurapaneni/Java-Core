class TurbineNames{
public static void main(String[]args){

Turbine ref=new Turbine();

boolean added =ref.addturbineName("Steam Turbine");
System.out.println(added);

added =ref.addturbineName("Gas Turbine");
System.out.println(added);

added =ref.addturbineName("Hydraulic Turbine");
System.out.println(added);

added =ref.addturbineName("Wind Turbine");
System.out.println(added);

added =ref.addturbineName("Pelton Turbine");
System.out.println(added);

added =ref.addturbineName("Francis Turbine");
System.out.println(added);

added =ref.addturbineName("Kaplan Turbine");
System.out.println(added);

added =ref.addturbineName("Impulse Turbine");
System.out.println(added);

added =ref.addturbineName("Reaction Turbine");
System.out.println(added);

added =ref.addturbineName("Micro Turbine");
System.out.println(added);

ref.getturbineName();

String turbineName = ref.getturbineByName("Wind Turbine");
System.out.println(turbineName+" is available");

boolean update = ref.updateturbineName("Wind Turbine","Advanced Wind Turbine");
System.out.println(update);

boolean delete = ref.deleteturbineName("Advanced Wind Turbine");
System.out.println(delete);

ref.getturbineName();

}
}