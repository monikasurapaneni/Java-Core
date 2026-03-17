class Mxplayer {
    public static void main(String[] args) {

        String kannadaRealityShows[] = {
            "BiggBossKannada","ComedyKhiladigalu","DanceKarnatakaDance","KannadadaKotyadhipati",
            "DramaJuniors","MasterChefKannada","SaregamapaKannada","SuperSingerKannada",
            "WeekendWithRamesh","HosaComedyTime","MajaaTalkies","ComedyRajaKalakararu",
            "KitchenKhiladigalu","PatreLovers","GenesKannada","Kick",
            "Takadhimita","HejjeGeetham","BangaraPatagalu","LifeGuru",
            "MahaJodi","Maharani","ComedyUtsava","StarSingerKannada",
            "GicchiGiliGili","KannadaGottilla","CookkuKannada",
            "GameOfTheStars","SuperStarKannada","DancingChampionKannada"
        };

        String teluguRealityShows[] = {
            "BiggBossTelugu","Dhee","Jabardasth","ExtraJabardasth","PaduthaTheeyaga",
            "SuperSingerTelugu","SaregamapaTelugu","MasterChefTelugu","AataJunior",
            "Cash","BoomBoom","StarMahila","Rangoli","BharthiCanCook",
            "DramaJuniorsTelugu","CookWithComaliTelugu","TheVoiceTelugu",
            "Wow","FamilyCircus","ChampionOfTheYear",
            "SumaAdda","TeluguGotTalent","ComedyStars",
            "DancePlusTelugu","SuperChef","GenesTelugu",
            "BigCelebrityChallenge","AhaBhojanambu",
            "StarSingerTelugu","FoodFactoryTelugu"
        };

        String hindiRealityShows[] = {
            "BiggBossHindi","KhatronKeKhiladi","IndianIdol","DanceIndiaDance",
            "SaReGaMaPa","Roadies","Splitsvilla","MTVHustle",
            "MasterChefIndia","SuperDancer","IndiaGotTalent","ComedyCircus",
            "TheKapilSharmaShow","NachBaliye","SmartJodi","LockUpp",
            "SharkTankIndia","TemptationIsland","FearFactor",
            "IndiaBestDancer","KitchenChampion","DilHaiHindustani",
            "SurvivorIndia","MTVRoadiesRising","MTVRoadiesXtreme",
            "BiggBossOTT","JhalakDikhhlaJaa","Hunarbaz",
            "DancePlus","TheVoiceIndia"
        };

        String tamilRealityShows[] = {
            "BiggBossTamil","CookWithComali","SuperSingerTamil","SaregamapaTamil",
            "DanceJodiDance","KingsOfComedy","KalakkaPovathuYaaru","StartMusic",
            "MasterChefTamil","TheWallTamil","JodiNo1","NeeyaNaana",
            "DramaJuniorsTamil","ReadySteadyPo","SuperMom","OruKodi",
            "JuniorSuperSinger","TamizhaTamizha","SurvivorTamil",
            "ComedyRajaKalakarargal","Aarambikkalama","StarSingerTamil",
            "TamilGotTalent","KitchenSuperStar","RamarVeedu",
            "NammaVeetuKalyanam","BhakthiThiruvizha","Vaanavil",
            "MrAndMrsTamil","SuperChefTamil"
        };

        String englishRealityShows[] = {
            "AmericaGotTalent","BritainsGotTalent","TheVoice","TheVoiceUS",
            "TheVoiceUK","MasterChefUS","MasterChefAustralia","Survivor",
            "BigBrother","XFactor","AmericasNextTopModel","FearFactorUS",
            "TheAmazingRace","LoveIsland","TooHotToHandle",
            "HellKitchen","TopChef","NailedIt","QueerEye",
            "RuPaulsDragRace","TheCircle","SharkTankUS",
            "ProjectRunway","DancingWithTheStars","SoYouThinkYouCanDance",
            "KitchenNightmares","InkMaster","GlowUp",
            "NextInFashion","MasterChefCanada"
        };

        String malayalamRealityShows[] = {
            "BiggBossMalayalam","ComedyStars","FlowersComedy","StarSingerMalayalam",
            "UgramUjjwalam","MusicIndiaMalayalam","Super4","SellMeTheAnswer",
            "ComedyUtsavam","KitchenMagic","BumperChiri","DareTheFear",
            "LetsRock","Midukki","OnnumOnnumMoonnu",
            "NingalkkumAakamKodeswaran","D4Dance","ComedyThammil",
            "MalayalamGotTalent","CookeryShow","BestSinger",
            "ComedyFestival","StarChallenge","SuperChefMalayalam",
            "ChillOut","LaughingVilla","TalkShowMalayalam",
            "VerumOruAlbhutham","MazhavilManoramaQuiz","MusicCorner"
        };

        System.out.println("MX Player Kannada Reality Shows:");
        //System.out.println(
          //  kannadaRealityShows[0]+"\n"+kannadaRealityShows[1]+"\n"+kannadaRealityShows[2]+"\n"+kannadaRealityShows[3]+"\n"+kannadaRealityShows[4]+"\n"+
         //   kannadaRealityShows[5]+"\n"+kannadaRealityShows[6]+"\n"+kannadaRealityShows[7]+"\n"+kannadaRealityShows[8]+"\n"+kannadaRealityShows[9]+"\n"+
         //   kannadaRealityShows[10]+"\n"+kannadaRealityShows[11]+"\n"+kannadaRealityShows[12]+"\n"+kannadaRealityShows[13]+"\n"+kannadaRealityShows[14]+"\n"+
         //   kannadaRealityShows[15]+"\n"+kannadaRealityShows[16]+"\n"+kannadaRealityShows[17]+"\n"+kannadaRealityShows[18]+"\n"+kannadaRealityShows[19]+"\n"+
         //   kannadaRealityShows[20]+"\n"+kannadaRealityShows[21]+"\n"+kannadaRealityShows[22]+"\n"+kannadaRealityShows[23]+"\n"+kannadaRealityShows[24]+"\n"+
         //   kannadaRealityShows[25]+"\n"+kannadaRealityShows[26]+"\n"+kannadaRealityShows[27]+"\n"+kannadaRealityShows[28]+"\n"+kannadaRealityShows[29]
       // );
String k1=kannadaRealityShows[0]; System.out.println(k1);
String k2=kannadaRealityShows[1]; System.out.println(k2);
String k3=kannadaRealityShows[2]; System.out.println(k3);
String k4=kannadaRealityShows[3]; System.out.println(k4);
String k5=kannadaRealityShows[4]; System.out.println(k5);
String k6=kannadaRealityShows[5]; System.out.println(k6);
String k7=kannadaRealityShows[6]; System.out.println(k7);
String k8=kannadaRealityShows[7]; System.out.println(k8);
String k9=kannadaRealityShows[8]; System.out.println(k9);
String k10=kannadaRealityShows[9]; System.out.println(k10);
String k11=kannadaRealityShows[10]; System.out.println(k11);
String k12=kannadaRealityShows[11]; System.out.println(k12);
String k13=kannadaRealityShows[12]; System.out.println(k13);
String k14=kannadaRealityShows[13]; System.out.println(k14);
String k15=kannadaRealityShows[14]; System.out.println(k15);
String k16=kannadaRealityShows[15]; System.out.println(k16);
String k17=kannadaRealityShows[16]; System.out.println(k17);
String k18=kannadaRealityShows[17]; System.out.println(k18);
String k19=kannadaRealityShows[18]; System.out.println(k19);
String k20=kannadaRealityShows[19]; System.out.println(k20);
String k21=kannadaRealityShows[20]; System.out.println(k21);
String k22=kannadaRealityShows[21]; System.out.println(k22);
String k23=kannadaRealityShows[22]; System.out.println(k23);
String k24=kannadaRealityShows[23]; System.out.println(k24);
String k25=kannadaRealityShows[24]; System.out.println(k25);
String k26=kannadaRealityShows[25]; System.out.println(k26);
String k27=kannadaRealityShows[26]; System.out.println(k27);
String k28=kannadaRealityShows[27]; System.out.println(k28);
String k29=kannadaRealityShows[28]; System.out.println(k29);
String k30=kannadaRealityShows[29]; System.out.println(k30);

        System.out.println("\nMX Player Telugu Reality Shows:");
       // System.out.println( teluguRealityShows[0]+"\n"+teluguRealityShows[1]+"\n"+teluguRealityShows[2]+"\n"+teluguRealityShows[3]+"\n"+teluguRealityShows[4]+"\n"+
       //     teluguRealityShows[5]+"\n"+teluguRealityShows[6]+"\n"+teluguRealityShows[7]+"\n"+teluguRealityShows[8]+"\n"+teluguRealityShows[9]+"\n"+
       //     teluguRealityShows[10]+"\n"+teluguRealityShows[11]+"\n"+teluguRealityShows[12]+"\n"+teluguRealityShows[13]+"\n"+teluguRealityShows[14]+"\n"+
         //   teluguRealityShows[15]+"\n"+teluguRealityShows[16]+"\n"+teluguRealityShows[17]+"\n"+teluguRealityShows[18]+"\n"+teluguRealityShows[19]+"\n"+
         //   teluguRealityShows[20]+"\n"+teluguRealityShows[21]+"\n"+teluguRealityShows[22]+"\n"+teluguRealityShows[23]+"\n"+teluguRealityShows[24]+"\n"+
         //   teluguRealityShows[25]+"\n"+teluguRealityShows[26]+"\n"+teluguRealityShows[27]+"\n"+teluguRealityShows[28]+"\n"+teluguRealityShows[29]
      //  );
String te1=teluguRealityShows[0]; System.out.println(te1);
String te2=teluguRealityShows[1]; System.out.println(te2);
String te3=teluguRealityShows[2]; System.out.println(te3);
String te4=teluguRealityShows[3]; System.out.println(te4);
String te5=teluguRealityShows[4]; System.out.println(te5);
String te6=teluguRealityShows[5]; System.out.println(te6);
String te7=teluguRealityShows[6]; System.out.println(te7);
String te8=teluguRealityShows[7]; System.out.println(te8);
String te9=teluguRealityShows[8]; System.out.println(te9);
String te10=teluguRealityShows[9]; System.out.println(te10);
String te11=teluguRealityShows[10]; System.out.println(te11);
String te12=teluguRealityShows[11]; System.out.println(te12);
String te13=teluguRealityShows[12]; System.out.println(te13);
String te14=teluguRealityShows[13]; System.out.println(te14);
String te15=teluguRealityShows[14]; System.out.println(te15);
String te16=teluguRealityShows[15]; System.out.println(te16);
String te17=teluguRealityShows[16]; System.out.println(te17);
String te18=teluguRealityShows[17]; System.out.println(te18);
String te19=teluguRealityShows[18]; System.out.println(te19);
String te20=teluguRealityShows[19]; System.out.println(te20);
String te21=teluguRealityShows[20]; System.out.println(te21);
String te22=teluguRealityShows[21]; System.out.println(te22);
String te23=teluguRealityShows[22]; System.out.println(te23);
String te24=teluguRealityShows[23]; System.out.println(te24);
String te25=teluguRealityShows[24]; System.out.println(te25);
String te26=teluguRealityShows[25]; System.out.println(te26);
String te27=teluguRealityShows[26]; System.out.println(te27);
String te28=teluguRealityShows[27]; System.out.println(te28);
String te29=teluguRealityShows[28]; System.out.println(te29);
String te30=teluguRealityShows[29]; System.out.println(te30);

        System.out.println("\nMX Player Hindi Reality Shows:");
      //  System.out.println(
       //     hindiRealityShows[0]+"\n"+hindiRealityShows[1]+"\n"+hindiRealityShows[2]+"\n"+hindiRealityShows[3]+"\n"+hindiRealityShows[4]+"\n"+
       //     hindiRealityShows[5]+"\n"+hindiRealityShows[6]+"\n"+hindiRealityShows[7]+"\n"+hindiRealityShows[8]+"\n"+hindiRealityShows[9]+"\n"+
        //    hindiRealityShows[10]+"\n"+hindiRealityShows[11]+"\n"+hindiRealityShows[12]+"\n"+hindiRealityShows[13]+"\n"+hindiRealityShows[14]+"\n"+
        //    hindiRealityShows[15]+"\n"+hindiRealityShows[16]+"\n"+hindiRealityShows[17]+"\n"+hindiRealityShows[18]+"\n"+hindiRealityShows[19]+"\n"+
        //    hindiRealityShows[20]+"\n"+hindiRealityShows[21]+"\n"+hindiRealityShows[22]+"\n"+hindiRealityShows[23]+"\n"+hindiRealityShows[24]+"\n"+
       //     hindiRealityShows[25]+"\n"+hindiRealityShows[26]+"\n"+hindiRealityShows[27]+"\n"+hindiRealityShows[28]+"\n"+hindiRealityShows[29]
      //  );
String h1=hindiRealityShows[0]; System.out.println(h1);
String h2=hindiRealityShows[1]; System.out.println(h2);
String h3=hindiRealityShows[2]; System.out.println(h3);
String h4=hindiRealityShows[3]; System.out.println(h4);
String h5=hindiRealityShows[4]; System.out.println(h5);
String h6=hindiRealityShows[5]; System.out.println(h6);
String h7=hindiRealityShows[6]; System.out.println(h7);
String h8=hindiRealityShows[7]; System.out.println(h8);
String h9=hindiRealityShows[8]; System.out.println(h9);
String h10=hindiRealityShows[9]; System.out.println(h10);
String h11=hindiRealityShows[10]; System.out.println(h11);
String h12=hindiRealityShows[11]; System.out.println(h12);
String h13=hindiRealityShows[12]; System.out.println(h13);
String h14=hindiRealityShows[13]; System.out.println(h14);
String h15=hindiRealityShows[14]; System.out.println(h15);
String h16=hindiRealityShows[15]; System.out.println(h16);
String h17=hindiRealityShows[16]; System.out.println(h17);
String h18=hindiRealityShows[17]; System.out.println(h18);
String h19=hindiRealityShows[18]; System.out.println(h19);
String h20=hindiRealityShows[19]; System.out.println(h20);
String h21=hindiRealityShows[20]; System.out.println(h21);
String h22=hindiRealityShows[21]; System.out.println(h22);
String h23=hindiRealityShows[22]; System.out.println(h23);
String h24=hindiRealityShows[23]; System.out.println(h24);
String h25=hindiRealityShows[24]; System.out.println(h25);
String h26=hindiRealityShows[25]; System.out.println(h26);
String h27=hindiRealityShows[26]; System.out.println(h27);
String h28=hindiRealityShows[27]; System.out.println(h28);
String h29=hindiRealityShows[28]; System.out.println(h29);
String h30=hindiRealityShows[29]; System.out.println(h30);

        System.out.println("\nMX Player Tamil Reality Shows:");
     //   System.out.println(
      //      tamilRealityShows[0]+"\n"+tamilRealityShows[1]+"\n"+tamilRealityShows[2]+"\n"+tamilRealityShows[3]+"\n"+tamilRealityShows[4]+"\n"+
       //     tamilRealityShows[5]+"\n"+tamilRealityShows[6]+"\n"+tamilRealityShows[7]+"\n"+tamilRealityShows[8]+"\n"+tamilRealityShows[9]+"\n"+
       //     tamilRealityShows[10]+"\n"+tamilRealityShows[11]+"\n"+tamilRealityShows[12]+"\n"+tamilRealityShows[13]+"\n"+tamilRealityShows[14]+"\n"+
       //    tamilRealityShows[15]+"\n"+tamilRealityShows[16]+"\n"+tamilRealityShows[17]+"\n"+tamilRealityShows[18]+"\n"+tamilRealityShows[19]+"\n"+
       //     tamilRealityShows[20]+"\n"+tamilRealityShows[21]+"\n"+tamilRealityShows[22]+"\n"+tamilRealityShows[23]+"\n"+tamilRealityShows[24]+"\n"+
       //     tamilRealityShows[25]+"\n"+tamilRealityShows[26]+"\n"+tamilRealityShows[27]+"\n"+tamilRealityShows[28]+"\n"+tamilRealityShows[29]
     //   );
String t1=tamilRealityShows[0]; System.out.println(t1);
String t2=tamilRealityShows[1]; System.out.println(t2);
String t3=tamilRealityShows[2]; System.out.println(t3);
String t4=tamilRealityShows[3]; System.out.println(t4);
String t5=tamilRealityShows[4]; System.out.println(t5);
String t6=tamilRealityShows[5]; System.out.println(t6);
String t7=tamilRealityShows[6]; System.out.println(t7);
String t8=tamilRealityShows[7]; System.out.println(t8);
String t9=tamilRealityShows[8]; System.out.println(t9);
String t10=tamilRealityShows[9]; System.out.println(t10);
String t11=tamilRealityShows[10]; System.out.println(t11);
String t12=tamilRealityShows[11]; System.out.println(t12);
String t13=tamilRealityShows[12]; System.out.println(t13);
String t14=tamilRealityShows[13]; System.out.println(t14);
String t15=tamilRealityShows[14]; System.out.println(t15);
String t16=tamilRealityShows[15]; System.out.println(t16);
String t17=tamilRealityShows[16]; System.out.println(t17);
String t18=tamilRealityShows[17]; System.out.println(t18);
String t19=tamilRealityShows[18]; System.out.println(t19);
String t20=tamilRealityShows[19]; System.out.println(t20);
String t21=tamilRealityShows[20]; System.out.println(t21);
String t22=tamilRealityShows[21]; System.out.println(t22);
String t23=tamilRealityShows[22]; System.out.println(t23);
String t24=tamilRealityShows[23]; System.out.println(t24);
String t25=tamilRealityShows[24]; System.out.println(t25);
String t26=tamilRealityShows[25]; System.out.println(t26);
String t27=tamilRealityShows[26]; System.out.println(t27);
String t28=tamilRealityShows[27]; System.out.println(t28);
String t29=tamilRealityShows[28]; System.out.println(t29);
String t30=tamilRealityShows[29]; System.out.println(t30);

        System.out.println("\nMX Player English Reality Shows:");
      //  System.out.println(
      //      englishRealityShows[0]+"\n"+englishRealityShows[1]+"\n"+englishRealityShows[2]+"\n"+englishRealityShows[3]+"\n"+englishRealityShows[4]+"\n"+
      //      englishRealityShows[5]+"\n"+englishRealityShows[6]+"\n"+englishRealityShows[7]+"\n"+englishRealityShows[8]+"\n"+englishRealityShows[9]+"\n"+
      //      englishRealityShows[10]+"\n"+englishRealityShows[11]+"\n"+englishRealityShows[12]+"\n"+englishRealityShows[13]+"\n"+englishRealityShows[14]+"\n"+
      //      englishRealityShows[15]+"\n"+englishRealityShows[16]+"\n"+englishRealityShows[17]+"\n"+englishRealityShows[18]+"\n"+englishRealityShows[19]+"\n"+
      //      englishRealityShows[20]+"\n"+englishRealityShows[21]+"\n"+englishRealityShows[22]+"\n"+englishRealityShows[23]+"\n"+englishRealityShows[24]+"\n"+
      //      englishRealityShows[25]+"\n"+englishRealityShows[26]+"\n"+englishRealityShows[27]+"\n"+englishRealityShows[28]+"\n"+englishRealityShows[29]
     //   );
String e1 = englishRealityShows[0];  System.out.println(e1);
String e2 = englishRealityShows[1];  System.out.println(e2);
String e3 = englishRealityShows[2];  System.out.println(e3);
String e4 = englishRealityShows[3];  System.out.println(e4);
String e5 = englishRealityShows[4];  System.out.println(e5);
String e6 = englishRealityShows[5];  System.out.println(e6);
String e7 = englishRealityShows[6];  System.out.println(e7);
String e8 = englishRealityShows[7];  System.out.println(e8);
String e9 = englishRealityShows[8];  System.out.println(e9);
String e10 = englishRealityShows[9]; System.out.println(e10);
String e11 = englishRealityShows[10]; System.out.println(e11);
String e12 = englishRealityShows[11]; System.out.println(e12);
String e13 = englishRealityShows[12]; System.out.println(e13);
String e14 = englishRealityShows[13]; System.out.println(e14);
String e15 = englishRealityShows[14]; System.out.println(e15);
String e16 = englishRealityShows[15]; System.out.println(e16);
String e17 = englishRealityShows[16]; System.out.println(e17);
String e18 = englishRealityShows[17]; System.out.println(e18);
String e19 = englishRealityShows[18]; System.out.println(e19);
String e20 = englishRealityShows[19]; System.out.println(e20);
String e21 = englishRealityShows[20]; System.out.println(e21);
String e22 = englishRealityShows[21]; System.out.println(e22);
String e23 = englishRealityShows[22]; System.out.println(e23);
String e24 = englishRealityShows[23]; System.out.println(e24);
String e25 = englishRealityShows[24]; System.out.println(e25);
String e26 = englishRealityShows[25]; System.out.println(e26);
String e27 = englishRealityShows[26]; System.out.println(e27);
String e28 = englishRealityShows[27]; System.out.println(e28);
String e29 = englishRealityShows[28]; System.out.println(e29);
String e30 = englishRealityShows[29]; System.out.println(e30);

        System.out.println("\nMX Player Malayalam Reality Shows:");
     //   System.out.println(
     //       malayalamRealityShows[0]+"\n"+malayalamRealityShows[1]+"\n"+malayalamRealityShows[2]+"\n"+malayalamRealityShows[3]+"\n"+malayalamRealityShows[4]+"\n"+
    //        malayalamRealityShows[5]+"\n"+malayalamRealityShows[6]+"\n"+malayalamRealityShows[7]+"\n"+malayalamRealityShows[8]+"\n"+malayalamRealityShows[9]+"\n"+
     //       malayalamRealityShows[10]+"\n"+malayalamRealityShows[11]+"\n"+malayalamRealityShows[12]+"\n"+malayalamRealityShows[13]+"\n"+malayalamRealityShows[14]+"\n"+
     //       malayalamRealityShows[15]+"\n"+malayalamRealityShows[16]+"\n"+malayalamRealityShows[17]+"\n"+malayalamRealityShows[18]+"\n"+malayalamRealityShows[19]+"\n"+
     //       malayalamRealityShows[20]+"\n"+malayalamRealityShows[21]+"\n"+malayalamRealityShows[22]+"\n"+malayalamRealityShows[23]+"\n"+malayalamRealityShows[24]+"\n"+
      //      malayalamRealityShows[25]+"\n"+malayalamRealityShows[26]+"\n"+malayalamRealityShows[27]+"\n"+malayalamRealityShows[28]+"\n"+malayalamRealityShows[29]
      //  );
String m1=malayalamRealityShows[0]; System.out.println(m1);
String m2=malayalamRealityShows[1]; System.out.println(m2);
String m3=malayalamRealityShows[2]; System.out.println(m3);
String m4=malayalamRealityShows[3]; System.out.println(m4);
String m5=malayalamRealityShows[4]; System.out.println(m5);
String m6=malayalamRealityShows[5]; System.out.println(m6);
String m7=malayalamRealityShows[6]; System.out.println(m7);
String m8=malayalamRealityShows[7]; System.out.println(m8);
String m9=malayalamRealityShows[8]; System.out.println(m9);
String m10=malayalamRealityShows[9]; System.out.println(m10);
String m11=malayalamRealityShows[10]; System.out.println(m11);
String m12=malayalamRealityShows[11]; System.out.println(m12);
String m13=malayalamRealityShows[12]; System.out.println(m13);
String m14=malayalamRealityShows[13]; System.out.println(m14);
String m15=malayalamRealityShows[14]; System.out.println(m15);
String m16=malayalamRealityShows[15]; System.out.println(m16);
String m17=malayalamRealityShows[16]; System.out.println(m17);
String m18=malayalamRealityShows[17]; System.out.println(m18);
String m19=malayalamRealityShows[18]; System.out.println(m19);
String m20=malayalamRealityShows[19]; System.out.println(m20);
String m21=malayalamRealityShows[20]; System.out.println(m21);
String m22=malayalamRealityShows[21]; System.out.println(m22);
String m23=malayalamRealityShows[22]; System.out.println(m23);
String m24=malayalamRealityShows[23]; System.out.println(m24);
String m25=malayalamRealityShows[24]; System.out.println(m25);
String m26=malayalamRealityShows[25]; System.out.println(m26);
String m27=malayalamRealityShows[26]; System.out.println(m27);
String m28=malayalamRealityShows[27]; System.out.println(m28);
String m29=malayalamRealityShows[28]; System.out.println(m29);
String m30=malayalamRealityShows[29]; System.out.println(m30);
    }
}