class AlienSpeciesExecutor {

    public static void main(String[] args){

        AlienSpecies a1 = new AlienSpecies();
        a1.speciesId = 1;
        a1.planetName = "Zebulon";
        a1.ability = "Mind Reading";

        AlienSpecies a2 = new AlienSpecies();
        a2.speciesId = 2;
        a2.planetName = "Xenor";
        a2.ability = "Shape Shifting";

        AlienSpecies a3 = new AlienSpecies();
        a3.speciesId = 3;
        a3.planetName = "Krypton";
        a3.ability = "Super Strength";

        AlienSpecies a4 = new AlienSpecies();
        a4.speciesId = 4;
        a4.planetName = "Orion";
        a4.ability = "Teleportation";

        AlienSpecies a5 = new AlienSpecies();
        a5.speciesId = 5;
        a5.planetName = "Nebula";
        a5.ability = "Invisibility";

        AlienSpecies a6 = new AlienSpecies();
        a6.speciesId = 6;
        a6.planetName = "Vortex";
        a6.ability = "Time Travel";

        AlienSpecies a7 = new AlienSpecies();
        a7.speciesId = 7;
        a7.planetName = "Zypher";
        a7.ability = "Flight";

        AlienSpecies a8 = new AlienSpecies();
        a8.speciesId = 8;
        a8.planetName = "Xandar";
        a8.ability = "Energy Blast";

        AlienSpecies a9 = new AlienSpecies();
        a9.speciesId = 9;
        a9.planetName = "Lumina";
        a9.ability = "Light Control";

        AlienSpecies a10 = new AlienSpecies();
        a10.speciesId = 10;
        a10.planetName = "Drakon";
        a10.ability = "Fire Breathing";

        AlienSpecies a11 = new AlienSpecies();
        a11.speciesId = 11;
        a11.planetName = "Cryon";
        a11.ability = "Ice Control";

        AlienSpecies a12 = new AlienSpecies();
        a12.speciesId = 12;
        a12.planetName = "TerraX";
        a12.ability = "Earth Manipulation";

        AlienSpecies a13 = new AlienSpecies();
        a13.speciesId = 13;
        a13.planetName = "AquaPrime";
        a13.ability = "Water Control";

        AlienSpecies a14 = new AlienSpecies();
        a14.speciesId = 14;
        a14.planetName = "Voltaris";
        a14.ability = "Electric Shock";

        AlienSpecies a15 = new AlienSpecies();
        a15.speciesId = 15;
        a15.planetName = "ShadowX";
        a15.ability = "Shadow Control";

        AlienSpecies aliens[] = new AlienSpecies[15];

        aliens[0] = a1;
        aliens[1] = a2;
        aliens[2] = a3;
        aliens[3] = a4;
        aliens[4] = a5;
        aliens[5] = a6;
        aliens[6] = a7;
        aliens[7] = a8;
        aliens[8] = a9;
        aliens[9] = a10;
        aliens[10] = a11;
        aliens[11] = a12;
        aliens[12] = a13;
        aliens[13] = a14;
        aliens[14] = a15;

        for(AlienSpecies alien : aliens){
            System.out.println("Species Id: " + alien.speciesId);
            System.out.println("Planet: " + alien.planetName);
            System.out.println("Ability: " + alien.ability);
            System.out.println("-----------");
        }
    }
}