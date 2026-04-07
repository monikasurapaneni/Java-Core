class LaptopBrandNames {
    public static void main(String[] args) {

        DigitalZone ref = new DigitalZone();

        boolean added = ref.addLaptopBrandName("Dell XPS 13");
        System.out.println(added);

        added = ref.addLaptopBrandName("HP Pavilion 15");
        System.out.println(added);

        added = ref.addLaptopBrandName("Lenovo IdeaPad Slim 3");
        System.out.println(added);

        added = ref.addLaptopBrandName("Apple MacBook Air M1");
        System.out.println(added);

        added = ref.addLaptopBrandName("Asus VivoBook 14");
        System.out.println(added);

        added = ref.addLaptopBrandName("Acer Aspire 5");
        System.out.println(added);

        added = ref.addLaptopBrandName("Samsung Galaxy Book 3 Pro");
        System.out.println(added);

        
        ref.getLaptopBrandName();

        
        String laptopBrandName = ref.getLaptopBrandByName("Samsung Galaxy Book 3 Pro");
        System.out.println(laptopBrandName + " is available");

       
        boolean update = ref.updateLaptopBrand("Acer Aspire 5", "Lenovo Legion 5");
        System.out.println(update);

        
        ref.getLaptopBrandName();
		
		boolean delete = ref.deleteLaptopBrand("Lenovo Legion 5");
       System.out.println(delete);

        ref.getLaptopBrandName();
    }
}