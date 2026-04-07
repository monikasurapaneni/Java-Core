class WeaponNames{
public static void main(String[]args){

Military ref=new Military();

boolean added =ref.addweaponName("Rifle");
System.out.println(added);

added =ref.addweaponName("Pistol");
System.out.println(added);

added =ref.addweaponName("Machine Gun");
System.out.println(added);

added =ref.addweaponName("Sniper Rifle");
System.out.println(added);

added =ref.addweaponName("Shotgun");
System.out.println(added);

added =ref.addweaponName("Grenade");
System.out.println(added);

added =ref.addweaponName("Rocket Launcher");
System.out.println(added);

added =ref.addweaponName("Missile");
System.out.println(added);

added =ref.addweaponName("Tank");
System.out.println(added);

added =ref.addweaponName("Fighter Jet");
System.out.println(added);

added =ref.addweaponName("Warship");
System.out.println(added);

added =ref.addweaponName("Submarine");
System.out.println(added);

added =ref.addweaponName("Drone");
System.out.println(added);

added =ref.addweaponName("Mortar");
System.out.println(added);

added =ref.addweaponName("Bazooka");
System.out.println(added);

added =ref.addweaponName("Flamethrower");
System.out.println(added);

added =ref.addweaponName("Torpedo");
System.out.println(added);

added =ref.addweaponName("Landmine");
System.out.println(added);

added =ref.addweaponName("Anti-Aircraft Gun");
System.out.println(added);

added =ref.addweaponName("Combat Knife");
System.out.println(added);

added =ref.addweaponName("Artillery Gun");
System.out.println(added);


ref.getweaponName();

String weaponName = ref.getweaponByName("Tank");
System.out.println(weaponName+" is available");


boolean update = ref.updateweaponName("Tank","Battle Tank");
System.out.println(update);


boolean delete = ref.deleteweaponName("Battle Tank");
System.out.println(delete);


ref.getweaponName();

}
}
