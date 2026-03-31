class Kajal {

String brand;
String color;
String type;
String finishType;
String waterproof;
String smudgeProof;
String skinType;
String specialFeature;



Kajal(String b , String c, String t, String f,String w, String s, String sk,String sf){
	brand = b;
	color = c;
	type=t;
	finishType = f;
	waterproof=w;
	smudgeProof=s;
	skinType=sk;
	specialFeature=sf;	
}

public void displayDetails(){
System.out.println(brand);
System.out.println(color);
System.out.println(type);
System.out.println(finishType);
System.out.println(waterproof);
System.out.println(smudgeProof);
System.out.println(skinType);
System.out.println(specialFeature);

}

}