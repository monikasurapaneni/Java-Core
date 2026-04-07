class TechnologyNames{
public static void main(String[]args){

Course ref=new Course();

boolean added =ref.addtechnologyName("Java");
System.out.println(added);

added =ref.addtechnologyName("Python");
System.out.println(added);

added =ref.addtechnologyName("C Programming");
System.out.println(added);

added =ref.addtechnologyName("C++");
System.out.println(added);

added =ref.addtechnologyName("JavaScript");
System.out.println(added);

added =ref.addtechnologyName("HTML");
System.out.println(added);

added =ref.addtechnologyName("CSS");
System.out.println(added);

added =ref.addtechnologyName("SQL");
System.out.println(added);

added =ref.addtechnologyName("Spring Boot");
System.out.println(added);

added =ref.addtechnologyName("React JS");
System.out.println(added);

added =ref.addtechnologyName("Angular");
System.out.println(added);

added =ref.addtechnologyName("Machine Learning");
System.out.println(added);

added =ref.addtechnologyName("Artificial Intelligence");
System.out.println(added);

added =ref.addtechnologyName("Cloud Computing");
System.out.println(added);

added =ref.addtechnologyName("Cyber Security");
System.out.println(added);


ref.gettechnologyName();

String techName = ref.gettechnologyByName("Java");
System.out.println(techName+" is available");


boolean update = ref.updatetechnologyName("Java","Advanced Java");
System.out.println(update);


boolean delete = ref.deletetechnologyName("Advanced Java");
System.out.println(delete);


ref.gettechnologyName();

}
}
