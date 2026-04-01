class FreelancerExecutor {

    public static void main(String[] args) {

        Freelancer f1 = new Freelancer();
        f1.name = "Monika";
        f1.skill = "Web Development";
        f1.experience = 2;
        f1.hourlyRate = 500;
        f1.platform = "Upwork";

        Client c1 = new Client();
        c1.clientName = "John";
        c1.company = "TechCorp";
        c1.projectType = "Website";
        c1.budget = 20000;
        c1.isInternational = true;

        f1.client = c1;
        f1.getFreelancerDetails();


        Freelancer f2 = new Freelancer();
        f2.name = "Rahul";
        f2.skill = "Graphic Design";
        f2.experience = 3;
        f2.hourlyRate = 400;
        f2.platform = "Fiverr";

        Client c2 = new Client();
        c2.clientName = "Anita";
        c2.company = "DesignHub";
        c2.projectType = "Logo Design";
        c2.budget = 8000;
        c2.isInternational = false;

        f2.client = c2;
        f2.getFreelancerDetails();


        Freelancer f3 = new Freelancer();
        f3.name = "Kiran";
        f3.skill = "App Development";
        f3.experience = 4;
        f3.hourlyRate = 700;
        f3.platform = "Freelancer";

        Client c3 = new Client();
        c3.clientName = "David";
        c3.company = "StartupX";
        c3.projectType = "Mobile App";
        c3.budget = 50000;
        c3.isInternational = true;

        f3.client = c3;
        f3.getFreelancerDetails();
		
		Freelancer f4 = new Freelancer();
		f4.name = "Arjun";
		f4.skill = "Content Writing";
		f4.experience = 3;
		f4.hourlyRate = 300;
		f4.platform = "Upwork";

		Client c4 = new Client();
		c4.clientName = "Riya";
		c4.company = "MediaHouse";
		c4.projectType = "Blog Writing";
		c4.budget = 7000;
		c4.isInternational = false;

		f4.client = c4;
		f4.getFreelancerDetails();


		Freelancer f5 = new Freelancer();
		f5.name = "Sneha";
		f5.skill = "Digital Marketing";
		f5.experience = 4;
		f5.hourlyRate = 600;
		f5.platform = "Fiverr";

		Client c5 = new Client();
		c5.clientName = "Alex";
		c5.company = "AdWorks";
		c5.projectType = "SEO";
		c5.budget = 15000;
		c5.isInternational = true;

		f5.client = c5;
		f5.getFreelancerDetails();


		Freelancer f6 = new Freelancer();
		f6.name = "Ravi";
		f6.skill = "Video Editing";
		f6.experience = 2;
		f6.hourlyRate = 350;
		f6.platform = "Freelancer";

		Client c6 = new Client();
		c6.clientName = "Kunal";
		c6.company = "StudioX";
		c6.projectType = "YouTube Editing";
		c6.budget = 10000;
		c6.isInternational = false;

		f6.client = c6;
		f6.getFreelancerDetails();


		Freelancer f7 = new Freelancer();
		f7.name = "Divya";
		f7.skill = "UI/UX Design";
		f7.experience = 5;
		f7.hourlyRate = 800;
		f7.platform = "Upwork";

		Client c7 = new Client();
		c7.clientName = "Sarah";
		c7.company = "DesignPro";
		c7.projectType = "App Design";
		c7.budget = 30000;
		c7.isInternational = true;

		f7.client = c7;
		f7.getFreelancerDetails();


		Freelancer f8 = new Freelancer();
		f8.name = "Karthik";
		f8.skill = "Data Analysis";
		f8.experience = 3;
		f8.hourlyRate = 650;
		f8.platform = "Freelancer";

		Client c8 = new Client();
		c8.clientName = "Meena";
		c8.company = "AnalyticsHub";
		c8.projectType = "Data Report";
		c8.budget = 20000;
		c8.isInternational = false;

		f8.client = c8;
		f8.getFreelancerDetails();


		Freelancer f9 = new Freelancer();
		f9.name = "Pooja";
		f9.skill = "SEO Specialist";
		f9.experience = 4;
		f9.hourlyRate = 500;
		f9.platform = "Fiverr";

		Client c9 = new Client();
		c9.clientName = "David";
		c9.company = "WebBoost";
		c9.projectType = "SEO Optimization";
		c9.budget = 18000;
		c9.isInternational = true;

		f9.client = c9;
		f9.getFreelancerDetails();


		Freelancer f10 = new Freelancer();
		f10.name = "Manoj";
		f10.skill = "App Testing";
		f10.experience = 2;
		f10.hourlyRate = 300;
		f10.platform = "Upwork";

		Client c10 = new Client();
		c10.clientName = "Rakesh";
		c10.company = "QA Labs";
		c10.projectType = "Testing";
		c10.budget = 9000;
		c10.isInternational = false;

		f10.client = c10;
		f10.getFreelancerDetails();


		Freelancer f11 = new Freelancer();
		f11.name = "Anjali";
		f11.skill = "Social Media Manager";
		f11.experience = 5;
		f11.hourlyRate = 700;
		f11.platform = "Fiverr";

		Client c11 = new Client();
		c11.clientName = "Emily";
		c11.company = "Brandify";
		c11.projectType = "Marketing";
		c11.budget = 25000;
		c11.isInternational = true;

		f11.client = c11;
		f11.getFreelancerDetails();


		Freelancer f12 = new Freelancer();
		f12.name = "Vikram";
		f12.skill = "Cyber Security";
		f12.experience = 6;
		f12.hourlyRate = 900;
		f12.platform = "Freelancer";

		Client c12 = new Client();
		c12.clientName = "Amit";
		c12.company = "SecureTech";
		c12.projectType = "Security Audit";
		c12.budget = 40000;
		c12.isInternational = false;

		f12.client = c12;
		f12.getFreelancerDetails();


		Freelancer f13 = new Freelancer();
		f13.name = "Ritika";
		f13.skill = "Illustration";
		f13.experience = 3;
		f13.hourlyRate = 450;
		f13.platform = "Upwork";

		Client c13 = new Client();
		c13.clientName = "Chris";
		c13.company = "ArtWorks";
		c13.projectType = "Illustrations";
		c13.budget = 12000;
		c13.isInternational = true;

		f13.client = c13;
		f13.getFreelancerDetails();


		Freelancer f14 = new Freelancer();
		f14.name = "Suresh";
		f14.skill = "Cloud Computing";
		f14.experience = 5;
		f14.hourlyRate = 850;
		f14.platform = "Freelancer";

		Client c14 = new Client();
		c14.clientName = "Naveen";
		c14.company = "CloudNet";
		c14.projectType = "Cloud Setup";
		c14.budget = 35000;
		c14.isInternational = false;

		f14.client = c14;
		f14.getFreelancerDetails();


		Freelancer f15 = new Freelancer();
		f15.name = "Keerthi";
		f15.skill = "Photography";
		f15.experience = 4;
		f15.hourlyRate = 600;
		f15.platform = "Fiverr";

		Client c15 = new Client();
		c15.clientName = "Olivia";
		c15.company = "PhotoStudio";
		c15.projectType = "Photoshoot";
		c15.budget = 20000;
		c15.isInternational = true;

		f15.client = c15;
		f15.getFreelancerDetails();


		Freelancer f16 = new Freelancer();
		f16.name = "Ajay";
		f16.skill = "Game Development";
		f16.experience = 5;
		f16.hourlyRate = 950;
		f16.platform = "Upwork";

		Client c16 = new Client();
		c16.clientName = "Rohit";
		c16.company = "GameZone";
		c16.projectType = "Game App";
		c16.budget = 60000;
		c16.isInternational = false;

		f16.client = c16;
		f16.getFreelancerDetails();


		Freelancer f17 = new Freelancer();
		f17.name = "Nisha";
		f17.skill = "Translation";
		f17.experience = 3;
		f17.hourlyRate = 300;
		f17.platform = "Freelancer";

		Client c17 = new Client();
		c17.clientName = "Maria";
		c17.company = "GlobalText";
		c17.projectType = "Translation";
		c17.budget = 8000;
		c17.isInternational = true;

		f17.client = c17;
		f17.getFreelancerDetails();


		Freelancer f18 = new Freelancer();
		f18.name = "Sanjay";
		f18.skill = "DevOps";
		f18.experience = 6;
		f18.hourlyRate = 1000;
		f18.platform = "Upwork";

		Client c18 = new Client();
		c18.clientName = "Karthik";
		c18.company = "DeployTech";
		c18.projectType = "Deployment";
		c18.budget = 45000;
		c18.isInternational = false;

		f18.client = c18;
		f18.getFreelancerDetails();


		Freelancer f19 = new Freelancer();
		f19.name = "Pallavi";
		f19.skill = "Voice Over";
		f19.experience = 2;
		f19.hourlyRate = 250;
		f19.platform = "Fiverr";

		Client c19 = new Client();
		c19.clientName = "James";
		c19.company = "MediaVoice";
		c19.projectType = "Voice Recording";
		c19.budget = 6000;
		c19.isInternational = true;

		f19.client = c19;
		f19.getFreelancerDetails();


		Freelancer f20 = new Freelancer();
		f20.name = "Deepak";
		f20.skill = "AI Development";
		f20.experience = 5;
		f20.hourlyRate = 1200;
		f20.platform = "Freelancer";

		Client c20 = new Client();
		c20.clientName = "Sundar";
		c20.company = "TechAI";
		c20.projectType = "AI Model";
		c20.budget = 70000;
		c20.isInternational = true;

		f20.client = c20;
		f20.getFreelancerDetails();
    }
}