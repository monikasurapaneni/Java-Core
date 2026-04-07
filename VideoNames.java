class VideoNames{
public static void main(String[]args){

YouTube ref=new YouTube();

boolean added =ref.addvideoName("Java Tutorial");
System.out.println(added);

added =ref.addvideoName("Python Basics");
System.out.println(added);

added =ref.addvideoName("HTML & CSS Crash Course");
System.out.println(added);

added =ref.addvideoName("JavaScript Full Course");
System.out.println(added);

added =ref.addvideoName("React JS Tutorial");
System.out.println(added);

added =ref.addvideoName("Spring Boot Project");
System.out.println(added);

added =ref.addvideoName("SQL Tutorial");
System.out.println(added);

added =ref.addvideoName("Machine Learning Intro");
System.out.println(added);

added =ref.addvideoName("Data Structures in Java");
System.out.println(added);

added =ref.addvideoName("Cyber Security Basics");
System.out.println(added);

added =ref.addvideoName("Android App Development");
System.out.println(added);

added =ref.addvideoName("Docker Tutorial");
System.out.println(added);

added =ref.addvideoName("Kubernetes Basics");
System.out.println(added);

added =ref.addvideoName("Git & GitHub Tutorial");
System.out.println(added);

added =ref.addvideoName("System Design Basics");
System.out.println(added);

ref.getvideoName();

String videoName = ref.getvideoByName("Java Tutorial");
System.out.println(videoName+" is available");

boolean update = ref.updatevideoName("Java Tutorial","Advanced Java Tutorial");
System.out.println(update);

boolean delete = ref.deletevideoName("Advanced Java Tutorial");
System.out.println(delete);

ref.getvideoName();

}
}