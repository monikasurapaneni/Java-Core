class BankExecutor{
	    public static void main(String args[]){
		
		Bank b1 = new Bank();
        b1.bankName = "SBI";
        b1.ifscCode = "SBIN0001234";
        b1.location = "Bangalore";
        b1.numberOfEmployees = 50;
        b1.bankType = "Public";

        AccountHolder a1 = new AccountHolder();
        a1.name = "Monika";
        a1.age = 22;
        a1.accountType = "Savings";
        a1.balance = 50000;
        a1.branch = "Main Branch";

        b1.accountHolder = a1;
        b1.getBankDetails();

        Bank b2 = new Bank();
        b2.bankName = "HDFC";
        b2.ifscCode = "HDFC0005678";
        b2.location = "Hyderabad";
        b2.numberOfEmployees = 40;
        b2.bankType = "Private";

        AccountHolder a2 = new AccountHolder();
        a2.name = "Rahul";
        a2.age = 28;
        a2.accountType = "Current";
        a2.balance = 120000;
        a2.branch = "City Branch";

        b2.accountHolder = a2;
        b2.getBankDetails();

        Bank b3 = new Bank();
        b3.bankName = "ICICI";
        b3.ifscCode = "ICIC0009876";
        b3.location = "Chennai";
        b3.numberOfEmployees = 35;
        b3.bankType = "Private";

        AccountHolder a3 = new AccountHolder();
        a3.name = "Anjali";
        a3.age = 25;
        a3.accountType = "Savings";
        a3.balance = 75000;
        a3.branch = "South Branch";

        b3.accountHolder = a3;
        b3.getBankDetails(); 
		
		Bank b4 = new Bank();
		b4.bankName = "Axis";
		b4.ifscCode = "UTIB0001122";
		b4.location = "Mumbai";
		b4.numberOfEmployees = 45;
		b4.bankType = "Private";

		AccountHolder a4 = new AccountHolder();
		a4.name = "Kiran";
		a4.age = 30;
		a4.accountType = "Savings";
		a4.balance = 60000;
		a4.branch = "West Branch";

		b4.accountHolder = a4;
		b4.getBankDetails();

		Bank b5 = new Bank();
		b5.bankName = "Canara";
		b5.ifscCode = "CNRB0003344";
		b5.location = "Delhi";
		b5.numberOfEmployees = 55;
		b5.bankType = "Public";

		AccountHolder a5 = new AccountHolder();
		a5.name = "Sneha";
		a5.age = 27;
		a5.accountType = "Current";
		a5.balance = 80000;
		a5.branch = "North Branch";

		b5.accountHolder = a5;
		b5.getBankDetails();

		Bank b6 = new Bank();
		b6.bankName = "Union";
		b6.ifscCode = "UBIN0005566";
		b6.location = "Pune";
		b6.numberOfEmployees = 38;
		b6.bankType = "Public";

		AccountHolder a6 = new AccountHolder();
		a6.name = "Arjun";
		a6.age = 26;
		a6.accountType = "Savings";
		a6.balance = 45000;
		a6.branch = "Central Branch";

		b6.accountHolder = a6;
		b6.getBankDetails();


		Bank b7 = new Bank();
		b7.bankName = "Kotak";
		b7.ifscCode = "KKBK0007788";
		b7.location = "Kolkata";
		b7.numberOfEmployees = 33;
		b7.bankType = "Private";

		AccountHolder a7 = new AccountHolder();
		a7.name = "Divya";
		a7.age = 24;
		a7.accountType = "Savings";
		a7.balance = 52000;
		a7.branch = "East Branch";

		b7.accountHolder = a7;
		b7.getBankDetails();

		Bank b8 = new Bank();
		b8.bankName = "Bank of Baroda";
		b8.ifscCode = "BARB0009988";
		b8.location = "Ahmedabad";
		b8.numberOfEmployees = 60;
		b8.bankType = "Public";

		AccountHolder a8 = new AccountHolder();
		a8.name = "Rohit";
		a8.age = 29;
		a8.accountType = "Current";
		a8.balance = 90000;
		a8.branch = "Main Branch";

		b8.accountHolder = a8;
		b8.getBankDetails();


		Bank b9 = new Bank();
		b9.bankName = "IndusInd";
		b9.ifscCode = "INDB0002233";
		b9.location = "Jaipur";
		b9.numberOfEmployees = 28;
		b9.bankType = "Private";

		AccountHolder a9 = new AccountHolder();
		a9.name = "Pooja";
		a9.age = 23;
		a9.accountType = "Savings";
		a9.balance = 40000;
		a9.branch = "Pink City Branch";

		b9.accountHolder = a9;
		b9.getBankDetails();

		Bank b10 = new Bank();
		b10.bankName = "Yes Bank";
		b10.ifscCode = "YESB0004455";
		b10.location = "Noida";
		b10.numberOfEmployees = 32;
		b10.bankType = "Private";

		AccountHolder a10 = new AccountHolder();
		a10.name = "Naveen";
		a10.age = 31;
		a10.accountType = "Current";
		a10.balance = 110000;
		a10.branch = "Sector Branch";

		b10.accountHolder = a10;
		b10.getBankDetails();

		Bank b11 = new Bank();
		b11.bankName = "IDBI";
		b11.ifscCode = "IBKL0006677";
		b11.location = "Lucknow";
		b11.numberOfEmployees = 36;
		b11.bankType = "Public";

		AccountHolder a11 = new AccountHolder();
		a11.name = "Meena";
		a11.age = 28;
		a11.accountType = "Savings";
		a11.balance = 65000;
		a11.branch = "City Branch";

		b11.accountHolder = a11;
		b11.getBankDetails();

		Bank b12 = new Bank();
		b12.bankName = "Federal";
		b12.ifscCode = "FDRL0008899";
		b12.location = "Kochi";
		b12.numberOfEmployees = 30;
		b12.bankType = "Private";

		AccountHolder a12 = new AccountHolder();
		a12.name = "Suresh";
		a12.age = 34;
		a12.accountType = "Savings";
		a12.balance = 70000;
		a12.branch = "South Branch";

		b12.accountHolder = a12;
		b12.getBankDetails();

		Bank b13 = new Bank();
		b13.bankName = "RBL";
		b13.ifscCode = "RATN0001112";
		b13.location = "Nagpur";
		b13.numberOfEmployees = 29;
		b13.bankType = "Private";

		AccountHolder a13 = new AccountHolder();
		a13.name = "Kavya";
		a13.age = 26;
		a13.accountType = "Current";
		a13.balance = 85000;
		a13.branch = "Central Branch";

		b13.accountHolder = a13;
		b13.getBankDetails();

		Bank b14 = new Bank();
		b14.bankName = "Punjab National";
		b14.ifscCode = "PUNB0003345";
		b14.location = "Chandigarh";
		b14.numberOfEmployees = 58;
		b14.bankType = "Public";

		AccountHolder a14 = new AccountHolder();
		a14.name = "Vikram";
		a14.age = 35;
		a14.accountType = "Savings";
		a14.balance = 95000;
		a14.branch = "Main Branch";

		b14.accountHolder = a14;
		b14.getBankDetails();

		Bank b15 = new Bank();
		b15.bankName = "South Indian Bank";
		b15.ifscCode = "SIBL0005567";
		b15.location = "Thrissur";
		b15.numberOfEmployees = 27;
		b15.bankType = "Private";

		AccountHolder a15 = new AccountHolder();
		a15.name = "Lakshmi";
		a15.age = 32;
		a15.accountType = "Savings";
		a15.balance = 72000;
		a15.branch = "Town Branch";

		b15.accountHolder = a15;
		b15.getBankDetails();

		Bank b16 = new Bank();
		b16.bankName = "UCO";
		b16.ifscCode = "UCBA0007789";
		b16.location = "Bhubaneswar";
		b16.numberOfEmployees = 42;
		b16.bankType = "Public";

		AccountHolder a16 = new AccountHolder();
		a16.name = "Manoj";
		a16.age = 29;
		a16.accountType = "Current";
		a16.balance = 88000;
		a16.branch = "Capital Branch";

		b16.accountHolder = a16;
		b16.getBankDetails();

		Bank b17 = new Bank();
		b17.bankName = "Central Bank";
		b17.ifscCode = "CBIN0009900";
		b17.location = "Indore";
		b17.numberOfEmployees = 48;
		b17.bankType = "Public";

		AccountHolder a17 = new AccountHolder();
		a17.name = "Anita";
		a17.age = 27;
		a17.accountType = "Savings";
		a17.balance = 56000;
		a17.branch = "City Branch";

		b17.accountHolder = a17;
		b17.getBankDetails();

		Bank b18 = new Bank();
		b18.bankName = "Bandhan";
		b18.ifscCode = "BDBL0001123";
		b18.location = "Patna";
		b18.numberOfEmployees = 34;
		b18.bankType = "Private";

		AccountHolder a18 = new AccountHolder();
		a18.name = "Rahul";
		a18.age = 30;
		a18.accountType = "Current";
		a18.balance = 99000;
		a18.branch = "Main Branch";

		b18.accountHolder = a18;
		b18.getBankDetails();

		Bank b19 = new Bank();
		b19.bankName = "DCB";
		b19.ifscCode = "DCBL0003346";
		b19.location = "Surat";
		b19.numberOfEmployees = 26;
		b19.bankType = "Private";

		AccountHolder a19 = new AccountHolder();
		a19.name = "Neha";
		a19.age = 25;
		a19.accountType = "Savings";
		a19.balance = 47000;
		a19.branch = "Market Branch";

		b19.accountHolder = a19;
		b19.getBankDetails();

		Bank b20 = new Bank();
		b20.bankName = "Karur Vysya";
		b20.ifscCode = "KVBL0005568";
		b20.location = "Coimbatore";
		b20.numberOfEmployees = 31;
		b20.bankType = "Private";

		AccountHolder a20 = new AccountHolder();
		a20.name = "Aravind";
		a20.age = 33;
		a20.accountType = "Current";
		a20.balance = 105000;
		a20.branch = "Industrial Branch";

		b20.accountHolder = a20;
		b20.getBankDetails();
		}
}