class StandRunner{
	
	public static void main(String[]args){
		
		Stand stand1 = new Stand();
		System.out.println(stand1);
		
		System.out.println("Before initializing values");
		
		System.out.println(stand1.rating);
		System.out.println(stand1.height);
		System.out.println(stand1.quantity);
		System.out.println(stand1.serialNumber);
		System.out.println(stand1.weight);
		System.out.println(stand1.cost);
		System.out.println(stand1.grade);
		System.out.println(stand1.isAvailable);
		System.out.println(stand1.brand);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("After initializing values");
		
		byte rating = 5;
		short height = 150;
		int quantity = 6;
		long serialNumber = 2314567893L;
		float weight = 15.5f;
		double cost = 999.99;
		char grade = 'A';
		boolean isAvailable = true;
		String brand = "IKEA";
		
		System.out.println(rating);
		System.out.println(height);
		System.out.println(quantity);
		System.out.println(serialNumber);
		System.out.println(weight);
		System.out.println(cost);
		System.out.println(grade);
		System.out.println(isAvailable);
		System.out.println(brand);
	}
	
}