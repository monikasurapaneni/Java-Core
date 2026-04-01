class TVExecutor {

    public static void main(String[] args) {

        TV t1 = new TV();
        t1.brand = "Samsung";
        t1.model = "QLED Q60";
        t1.price = 60000;
        t1.screenType = "QLED";
        t1.screenSize = 55;

        Remote r1 = new Remote();
        r1.brand = "Samsung";
        r1.connectivity = "Bluetooth";
        r1.numberOfButtons = 40;
        r1.voiceControl = true;
        r1.batteryType = "AAA";

        t1.remote = r1;
        t1.getTVDetails();

        TV t2 = new TV();
        t2.brand = "LG";
        t2.model = "OLED C2";
        t2.price = 80000;
        t2.screenType = "OLED";
        t2.screenSize = 65;

        Remote r2 = new Remote();
        r2.brand = "LG";
        r2.connectivity = "Infrared";
        r2.numberOfButtons = 35;
        r2.voiceControl = true;
        r2.batteryType = "AA";

        t2.remote = r2;
        t2.getTVDetails();


        TV t3 = new TV();
        t3.brand = "Sony";
        t3.model = "Bravia X75";
        t3.price = 55000;
        t3.screenType = "LED";
        t3.screenSize = 50;

        Remote r3 = new Remote();
        r3.brand = "Sony";
        r3.connectivity = "Bluetooth";
        r3.numberOfButtons = 38;
        r3.voiceControl = false;
        r3.batteryType = "AAA";

        t3.remote = r3;
        t3.getTVDetails();
		
				
		TV t4 = new TV();
		t4.brand = "OnePlus";
		t4.model = "Y Series";
		t4.price = 30000;
		t4.screenType = "LED";
		t4.screenSize = 43;

		Remote r4 = new Remote();
		r4.brand = "OnePlus";
		r4.connectivity = "Bluetooth";
		r4.numberOfButtons = 30;
		r4.voiceControl = true;
		r4.batteryType = "AAA";

		t4.remote = r4;
		t4.getTVDetails();

		TV t5 = new TV();
		t5.brand = "Mi";
		t5.model = "X Pro";
		t5.price = 35000;
		t5.screenType = "LED";
		t5.screenSize = 50;

		Remote r5 = new Remote();
		r5.brand = "Mi";
		r5.connectivity = "Bluetooth";
		r5.numberOfButtons = 28;
		r5.voiceControl = true;
		r5.batteryType = "AAA";

		t5.remote = r5;
		t5.getTVDetails();


		TV t6 = new TV();
		t6.brand = "Panasonic";
		t6.model = "Viera";
		t6.price = 40000;
		t6.screenType = "LED";
		t6.screenSize = 55;

		Remote r6 = new Remote();
		r6.brand = "Panasonic";
		r6.connectivity = "Infrared";
		r6.numberOfButtons = 35;
		r6.voiceControl = false;
		r6.batteryType = "AA";

		t6.remote = r6;
		t6.getTVDetails();

		TV t7 = new TV();
		t7.brand = "TCL";
		t7.model = "C Series";
		t7.price = 45000;
		t7.screenType = "QLED";
		t7.screenSize = 55;

		Remote r7 = new Remote();
		r7.brand = "TCL";
		r7.connectivity = "Bluetooth";
		r7.numberOfButtons = 32;
		r7.voiceControl = true;
		r7.batteryType = "AAA";

		t7.remote = r7;
		t7.getTVDetails();


		TV t8 = new TV();
		t8.brand = "Vu";
		t8.model = "Premium";
		t8.price = 38000;
		t8.screenType = "LED";
		t8.screenSize = 50;

		Remote r8 = new Remote();
		r8.brand = "Vu";
		r8.connectivity = "Infrared";
		r8.numberOfButtons = 29;
		r8.voiceControl = false;
		r8.batteryType = "AA";

		t8.remote = r8;
		t8.getTVDetails();

		TV t9 = new TV();
		t9.brand = "Philips";
		t9.model = "Ambilight";
		t9.price = 50000;
		t9.screenType = "LED";
		t9.screenSize = 55;

		Remote r9 = new Remote();
		r9.brand = "Philips";
		r9.connectivity = "Bluetooth";
		r9.numberOfButtons = 34;
		r9.voiceControl = true;
		r9.batteryType = "AAA";

		t9.remote = r9;
		t9.getTVDetails();

		TV t10 = new TV();
		t10.brand = "Realme";
		t10.model = "Smart TV";
		t10.price = 28000;
		t10.screenType = "LED";
		t10.screenSize = 43;

		Remote r10 = new Remote();
		r10.brand = "Realme";
		r10.connectivity = "Bluetooth";
		r10.numberOfButtons = 27;
		r10.voiceControl = true;
		r10.batteryType = "AAA";

		t10.remote = r10;
		t10.getTVDetails();


		TV t11 = new TV();
		t11.brand = "Samsung";
		t11.model = "Crystal UHD";
		t11.price = 55000;
		t11.screenType = "LED";
		t11.screenSize = 65;

		Remote r11 = new Remote();
		r11.brand = "Samsung";
		r11.connectivity = "Bluetooth";
		r11.numberOfButtons = 40;
		r11.voiceControl = true;
		r11.batteryType = "AAA";

		t11.remote = r11;
		t11.getTVDetails();


		TV t12 = new TV();
		t12.brand = "LG";
		t12.model = "NanoCell";
		t12.price = 60000;
		t12.screenType = "LED";
		t12.screenSize = 65;

		Remote r12 = new Remote();
		r12.brand = "LG";
		r12.connectivity = "Infrared";
		r12.numberOfButtons = 36;
		r12.voiceControl = true;
		r12.batteryType = "AA";

		t12.remote = r12;
		t12.getTVDetails();


		TV t13 = new TV();
		t13.brand = "Sony";
		t13.model = "Bravia XR";
		t13.price = 90000;
		t13.screenType = "OLED";
		t13.screenSize = 65;

		Remote r13 = new Remote();
		r13.brand = "Sony";
		r13.connectivity = "Bluetooth";
		r13.numberOfButtons = 38;
		r13.voiceControl = true;
		r13.batteryType = "AAA";

		t13.remote = r13;
		t13.getTVDetails();


		TV t14 = new TV();
		t14.brand = "OnePlus";
		t14.model = "U Series";
		t14.price = 42000;
		t14.screenType = "LED";
		t14.screenSize = 55;

		Remote r14 = new Remote();
		r14.brand = "OnePlus";
		r14.connectivity = "Bluetooth";
		r14.numberOfButtons = 30;
		r14.voiceControl = true;
		r14.batteryType = "AAA";

		t14.remote = r14;
		t14.getTVDetails();


		TV t15 = new TV();
		t15.brand = "Mi";
		t15.model = "4X";
		t15.price = 32000;
		t15.screenType = "LED";
		t15.screenSize = 50;

		Remote r15 = new Remote();
		r15.brand = "Mi";
		r15.connectivity = "Bluetooth";
		r15.numberOfButtons = 28;
		r15.voiceControl = true;
		r15.batteryType = "AAA";

		t15.remote = r15;
		t15.getTVDetails();


		TV t16 = new TV();
		t16.brand = "Panasonic";
		t16.model = "HX Series";
		t16.price = 47000;
		t16.screenType = "LED";
		t16.screenSize = 55;

		Remote r16 = new Remote();
		r16.brand = "Panasonic";
		r16.connectivity = "Infrared";
		r16.numberOfButtons = 35;
		r16.voiceControl = false;
		r16.batteryType = "AA";

		t16.remote = r16;
		t16.getTVDetails();


		TV t17 = new TV();
		t17.brand = "TCL";
		t17.model = "P Series";
		t17.price = 39000;
		t17.screenType = "LED";
		t17.screenSize = 50;

		Remote r17 = new Remote();
		r17.brand = "TCL";
		r17.connectivity = "Bluetooth";
		r17.numberOfButtons = 32;
		r17.voiceControl = true;
		r17.batteryType = "AAA";

		t17.remote = r17;
		t17.getTVDetails();


		TV t18 = new TV();
		t18.brand = "Vu";
		t18.model = "Cinema TV";
		t18.price = 45000;
		t18.screenType = "LED";
		t18.screenSize = 55;

		Remote r18 = new Remote();
		r18.brand = "Vu";
		r18.connectivity = "Infrared";
		r18.numberOfButtons = 29;
		r18.voiceControl = false;
		r18.batteryType = "AA";

		t18.remote = r18;
		t18.getTVDetails();


		TV t19 = new TV();
		t19.brand = "Philips";
		t19.model = "Smart LED";
		t19.price = 48000;
		t19.screenType = "LED";
		t19.screenSize = 55;

		Remote r19 = new Remote();
		r19.brand = "Philips";
		r19.connectivity = "Bluetooth";
		r19.numberOfButtons = 34;
		r19.voiceControl = true;
		r19.batteryType = "AAA";

		t19.remote = r19;
		t19.getTVDetails();


		TV t20 = new TV();
		t20.brand = "Realme";
		t20.model = "4K Smart";
		t20.price = 35000;
		t20.screenType = "LED";
		t20.screenSize = 50;

		Remote r20 = new Remote();
		r20.brand = "Realme";
		r20.connectivity = "Bluetooth";
		r20.numberOfButtons = 27;
		r20.voiceControl = true;
		r20.batteryType = "AAA";

		t20.remote = r20;
		t20.getTVDetails();
    }
}