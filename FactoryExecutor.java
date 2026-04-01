class FactoryExecutor {

    public static void main(String[] args) {

        Factory f1 = new Factory();
        f1.factoryName = "Tata Motors";
        f1.location = "Pune";
        f1.industryType = "Automobile";
        f1.numberOfWorkers = 500;
        f1.productionCapacity = 1000;

        Machine m1 = new Machine();
        m1.machineName = "Assembly Robot";
        m1.machineType = "Robotic";
        m1.brand = "ABB";
        m1.power = 150.5;
        m1.isAutomated = true;

        f1.machine = m1;
        f1.getFactoryDetails();


        Factory f2 = new Factory();
        f2.factoryName = "Amul Dairy";
        f2.location = "Gujarat";
        f2.industryType = "Food Processing";
        f2.numberOfWorkers = 300;
        f2.productionCapacity = 800;

        Machine m2 = new Machine();
        m2.machineName = "Milk Processing Unit";
        m2.machineType = "Semi-Automatic";
        m2.brand = "GEA";
        m2.power = 120.0;
        m2.isAutomated = false;

        f2.machine = m2;
        f2.getFactoryDetails();


        Factory f3 = new Factory();
        f3.factoryName = "Infosys Manufacturing Unit";
        f3.location = "Bangalore";
        f3.industryType = "Electronics";
        f3.numberOfWorkers = 400;
        f3.productionCapacity = 900;

        Machine m3 = new Machine();
        m3.machineName = "PCB Machine";
        m3.machineType = "Automatic";
        m3.brand = "Siemens";
        m3.power = 200.0;
        m3.isAutomated = true;

        f3.machine = m3;
        f3.getFactoryDetails();
		
		    Factory f4 = new Factory();
			f4.factoryName = "Reliance Industries";
			f4.location = "Mumbai";
			f4.industryType = "Petrochemical";
			f4.numberOfWorkers = 600;
			f4.productionCapacity = 1500;

			Machine m4 = new Machine();
			m4.machineName = "Refinery Unit";
			m4.machineType = "Automatic";
			m4.brand = "Shell";
			m4.power = 300.0;
			m4.isAutomated = true;

			f4.machine = m4;
			f4.getFactoryDetails();


			Factory f5 = new Factory();
			f5.factoryName = "Ashok Leyland";
			f5.location = "Chennai";
			f5.industryType = "Automobile";
			f5.numberOfWorkers = 450;
			f5.productionCapacity = 1100;

			Machine m5 = new Machine();
			m5.machineName = "Engine Assembly";
			m5.machineType = "Robotic";
			m5.brand = "Bosch";
			m5.power = 180.0;
			m5.isAutomated = true;

			f5.machine = m5;
			f5.getFactoryDetails();


			Factory f6 = new Factory();
			f6.factoryName = "Nestle India";
			f6.location = "Haryana";
			f6.industryType = "Food";
			f6.numberOfWorkers = 350;
			f6.productionCapacity = 900;

			Machine m6 = new Machine();
			m6.machineName = "Packaging Machine";
			m6.machineType = "Semi-Automatic";
			m6.brand = "Tetra Pak";
			m6.power = 140.0;
			m6.isAutomated = false;

			f6.machine = m6;
			f6.getFactoryDetails();


			Factory f7 = new Factory();
			f7.factoryName = "ITC Factory";
			f7.location = "Kolkata";
			f7.industryType = "FMCG";
			f7.numberOfWorkers = 300;
			f7.productionCapacity = 850;

			Machine m7 = new Machine();
			m7.machineName = "Sorting Machine";
			m7.machineType = "Automatic";
			m7.brand = "Hitachi";
			m7.power = 130.0;
			m7.isAutomated = true;

			f7.machine = m7;
			f7.getFactoryDetails();


			Factory f8 = new Factory();
			f8.factoryName = "Maruti Suzuki";
			f8.location = "Gurgaon";
			f8.industryType = "Automobile";
			f8.numberOfWorkers = 700;
			f8.productionCapacity = 1600;

			Machine m8 = new Machine();
			m8.machineName = "Welding Robot";
			m8.machineType = "Robotic";
			m8.brand = "KUKA";
			m8.power = 220.0;
			m8.isAutomated = true;

			f8.machine = m8;
			f8.getFactoryDetails();


			Factory f9 = new Factory();
			f9.factoryName = "Parle Factory";
			f9.location = "Mumbai";
			f9.industryType = "Food";
			f9.numberOfWorkers = 280;
			f9.productionCapacity = 750;

			Machine m9 = new Machine();
			m9.machineName = "Biscuit Maker";
			m9.machineType = "Automatic";
			m9.brand = "BakerTech";
			m9.power = 120.0;
			m9.isAutomated = true;

			f9.machine = m9;
			f9.getFactoryDetails();


			Factory f10 = new Factory();
			f10.factoryName = "Hindustan Unilever";
			f10.location = "Bangalore";
			f10.industryType = "FMCG";
			f10.numberOfWorkers = 500;
			f10.productionCapacity = 1200;

			Machine m10 = new Machine();
			m10.machineName = "Liquid Filling Machine";
			m10.machineType = "Semi-Automatic";
			m10.brand = "GEA";
			m10.power = 150.0;
			m10.isAutomated = false;

			f10.machine = m10;
			f10.getFactoryDetails();


			Factory f11 = new Factory();
			f11.factoryName = "BHEL";
			f11.location = "Bhopal";
			f11.industryType = "Engineering";
			f11.numberOfWorkers = 600;
			f11.productionCapacity = 1400;

			Machine m11 = new Machine();
			m11.machineName = "Turbine Machine";
			m11.machineType = "Automatic";
			m11.brand = "Siemens";
			m11.power = 350.0;
			m11.isAutomated = true;

			f11.machine = m11;
			f11.getFactoryDetails();


			Factory f12 = new Factory();
			f12.factoryName = "Dabur";
			f12.location = "Ghaziabad";
			f12.industryType = "Ayurvedic";
			f12.numberOfWorkers = 320;
			f12.productionCapacity = 800;

			Machine m12 = new Machine();
			m12.machineName = "Herbal Mixer";
			m12.machineType = "Semi-Automatic";
			m12.brand = "Philips";
			m12.power = 110.0;
			m12.isAutomated = false;

			f12.machine = m12;
			f12.getFactoryDetails();


			Factory f13 = new Factory();
			f13.factoryName = "Wipro Manufacturing";
			f13.location = "Mysore";
			f13.industryType = "Electronics";
			f13.numberOfWorkers = 400;
			f13.productionCapacity = 950;

			Machine m13 = new Machine();
			m13.machineName = "Circuit Machine";
			m13.machineType = "Automatic";
			m13.brand = "Samsung";
			m13.power = 200.0;
			m13.isAutomated = true;

			f13.machine = m13;
			f13.getFactoryDetails();


			Factory f14 = new Factory();
			f14.factoryName = "Tata Steel";
			f14.location = "Jamshedpur";
			f14.industryType = "Steel";
			f14.numberOfWorkers = 800;
			f14.productionCapacity = 2000;

			Machine m14 = new Machine();
			m14.machineName = "Blast Furnace";
			m14.machineType = "Heavy";
			m14.brand = "L&T";
			m14.power = 500.0;
			m14.isAutomated = true;

			f14.machine = m14;
			f14.getFactoryDetails();


			Factory f15 = new Factory();
			f15.factoryName = "Britannia";
			f15.location = "Bangalore";
			f15.industryType = "Food";
			f15.numberOfWorkers = 350;
			f15.productionCapacity = 900;

			Machine m15 = new Machine();
			m15.machineName = "Cake Processor";
			m15.machineType = "Automatic";
			m15.brand = "BakeMaster";
			m15.power = 130.0;
			m15.isAutomated = true;

			f15.machine = m15;
			f15.getFactoryDetails();


			Factory f16 = new Factory();
			f16.factoryName = "Hero Motors";
			f16.location = "Delhi";
			f16.industryType = "Automobile";
			f16.numberOfWorkers = 550;
			f16.productionCapacity = 1300;

			Machine m16 = new Machine();
			m16.machineName = "Bike Assembly";
			m16.machineType = "Robotic";
			m16.brand = "Bosch";
			m16.power = 210.0;
			m16.isAutomated = true;

			f16.machine = m16;
			f16.getFactoryDetails();


			Factory f17 = new Factory();
			f17.factoryName = "Samsung Factory";
			f17.location = "Noida";
			f17.industryType = "Electronics";
			f17.numberOfWorkers = 700;
			f17.productionCapacity = 1700;

			Machine m17 = new Machine();
			m17.machineName = "Mobile Assembler";
			m17.machineType = "Automatic";
			m17.brand = "Samsung";
			m17.power = 190.0;
			m17.isAutomated = true;

			f17.machine = m17;
			f17.getFactoryDetails();


			Factory f18 = new Factory();
			f18.factoryName = "Colgate Factory";
			f18.location = "Goa";
			f18.industryType = "FMCG";
			f18.numberOfWorkers = 300;
			f18.productionCapacity = 850;

			Machine m18 = new Machine();
			m18.machineName = "Toothpaste Filler";
			m18.machineType = "Semi-Automatic";
			m18.brand = "GEA";
			m18.power = 120.0;
			m18.isAutomated = false;

			f18.machine = m18;
			f18.getFactoryDetails();


			Factory f19 = new Factory();
			f19.factoryName = "Asian Paints";
			f19.location = "Mumbai";
			f19.industryType = "Paint";
			f19.numberOfWorkers = 420;
			f19.productionCapacity = 1000;

			Machine m19 = new Machine();
			m19.machineName = "Paint Mixer";
			m19.machineType = "Automatic";
			m19.brand = "Berger";
			m19.power = 160.0;
			m19.isAutomated = true;

			f19.machine = m19;
			f19.getFactoryDetails();


			Factory f20 = new Factory();
			f20.factoryName = "LG Electronics";
			f20.location = "Pune";
			f20.industryType = "Electronics";
			f20.numberOfWorkers = 650;
			f20.productionCapacity = 1500;

			Machine m20 = new Machine();
			m20.machineName = "TV Assembly";
			m20.machineType = "Automatic";
			m20.brand = "LG";
			m20.power = 180.0;
			m20.isAutomated = true;

			f20.machine = m20;
			f20.getFactoryDetails();
    }
}