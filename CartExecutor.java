class CartExecutor {

    public static void main(String[] args) {

        Cart c1 = new Cart();
        c1.userName = "Monika";
        c1.numberOfItems = 2;
        c1.totalPrice = 2500;
        c1.paymentMethod = "UPI";
        c1.deliveryAddress = "Bangalore";

        Order o1 = new Order();
        o1.orderId = "ORD101";
        o1.productName = "Shoes";
        o1.quantity = 1;
        o1.orderStatus = "Delivered";
        o1.deliveryDate = "2 April";

        c1.order = o1;
        c1.getCartDetails();


        Cart c2 = new Cart();
        c2.userName = "Rahul";
        c2.numberOfItems = 3;
        c2.totalPrice = 4000;
        c2.paymentMethod = "Card";
        c2.deliveryAddress = "Hyderabad";

        Order o2 = new Order();
        o2.orderId = "ORD102";
        o2.productName = "Watch";
        o2.quantity = 1;
        o2.orderStatus = "Shipped";
        o2.deliveryDate = "5 April";

        c2.order = o2;
        c2.getCartDetails();


        Cart c3 = new Cart();
        c3.userName = "Anjali";
        c3.numberOfItems = 1;
        c3.totalPrice = 1500;
        c3.paymentMethod = "Cash on Delivery";
        c3.deliveryAddress = "Chennai";

        Order o3 = new Order();
        o3.orderId = "ORD103";
        o3.productName = "Bag";
        o3.quantity = 1;
        o3.orderStatus = "Processing";
        o3.deliveryDate = "7 April";

        c3.order = o3;
        c3.getCartDetails();
		Cart c4 = new Cart();
		c4.userName = "Kiran";
		c4.numberOfItems = 2;
		c4.totalPrice = 3200;
		c4.paymentMethod = "UPI";
		c4.deliveryAddress = "Delhi";

		Order o4 = new Order();
		o4.orderId = "ORD104";
		o4.productName = "Headphones";
		o4.quantity = 1;
		o4.orderStatus = "Delivered";
		o4.deliveryDate = "3 April";

		c4.order = o4;
		c4.getCartDetails();


		Cart c5 = new Cart();
		c5.userName = "Sneha";
		c5.numberOfItems = 4;
		c5.totalPrice = 5000;
		c5.paymentMethod = "Card";
		c5.deliveryAddress = "Mumbai";

		Order o5 = new Order();
		o5.orderId = "ORD105";
		o5.productName = "Dress";
		o5.quantity = 2;
		o5.orderStatus = "Shipped";
		o5.deliveryDate = "6 April";

		c5.order = o5;
		c5.getCartDetails();


		Cart c6 = new Cart();
		c6.userName = "Ravi";
		c6.numberOfItems = 1;
		c6.totalPrice = 1200;
		c6.paymentMethod = "Cash on Delivery";
		c6.deliveryAddress = "Chennai";

		Order o6 = new Order();
		o6.orderId = "ORD106";
		o6.productName = "Book";
		o6.quantity = 1;
		o6.orderStatus = "Processing";
		o6.deliveryDate = "8 April";

		c6.order = o6;
		c6.getCartDetails();


		Cart c7 = new Cart();
		c7.userName = "Divya";
		c7.numberOfItems = 3;
		c7.totalPrice = 2700;
		c7.paymentMethod = "UPI";
		c7.deliveryAddress = "Bangalore";

		Order o7 = new Order();
		o7.orderId = "ORD107";
		o7.productName = "Cosmetics";
		o7.quantity = 3;
		o7.orderStatus = "Delivered";
		o7.deliveryDate = "2 April";

		c7.order = o7;
		c7.getCartDetails();


		Cart c8 = new Cart();
		c8.userName = "Arjun";
		c8.numberOfItems = 2;
		c8.totalPrice = 3500;
		c8.paymentMethod = "Card";
		c8.deliveryAddress = "Hyderabad";

		Order o8 = new Order();
		o8.orderId = "ORD108";
		o8.productName = "Watch";
		o8.quantity = 1;
		o8.orderStatus = "Shipped";
		o8.deliveryDate = "5 April";

		c8.order = o8;
		c8.getCartDetails();


		Cart c9 = new Cart();
		c9.userName = "Meena";
		c9.numberOfItems = 5;
		c9.totalPrice = 6000;
		c9.paymentMethod = "UPI";
		c9.deliveryAddress = "Kolkata";

		Order o9 = new Order();
		o9.orderId = "ORD109";
		o9.productName = "Kitchen Set";
		o9.quantity = 2;
		o9.orderStatus = "Delivered";
		o9.deliveryDate = "4 April";

		c9.order = o9;
		c9.getCartDetails();


		Cart c10 = new Cart();
		c10.userName = "Vikram";
		c10.numberOfItems = 2;
		c10.totalPrice = 2800;
		c10.paymentMethod = "Card";
		c10.deliveryAddress = "Pune";

		Order o10 = new Order();
		o10.orderId = "ORD110";
		o10.productName = "Shoes";
		o10.quantity = 1;
		o10.orderStatus = "Processing";
		o10.deliveryDate = "9 April";

		c10.order = o10;
		c10.getCartDetails();


		Cart c11 = new Cart();
		c11.userName = "Anil";
		c11.numberOfItems = 3;
		c11.totalPrice = 4200;
		c11.paymentMethod = "UPI";
		c11.deliveryAddress = "Jaipur";

		Order o11 = new Order();
		o11.orderId = "ORD111";
		o11.productName = "Laptop Bag";
		o11.quantity = 1;
		o11.orderStatus = "Delivered";
		o11.deliveryDate = "3 April";

		c11.order = o11;
		c11.getCartDetails();


		Cart c12 = new Cart();
		c12.userName = "Pooja";
		c12.numberOfItems = 1;
		c12.totalPrice = 900;
		c12.paymentMethod = "Cash on Delivery";
		c12.deliveryAddress = "Ahmedabad";

		Order o12 = new Order();
		o12.orderId = "ORD112";
		o12.productName = "Water Bottle";
		o12.quantity = 1;
		o12.orderStatus = "Shipped";
		o12.deliveryDate = "6 April";

		c12.order = o12;
		c12.getCartDetails();


		Cart c13 = new Cart();
		c13.userName = "Karthik";
		c13.numberOfItems = 2;
		c13.totalPrice = 2600;
		c13.paymentMethod = "Card";
		c13.deliveryAddress = "Coimbatore";

		Order o13 = new Order();
		o13.orderId = "ORD113";
		o13.productName = "Bluetooth Speaker";
		o13.quantity = 1;
		o13.orderStatus = "Delivered";
		o13.deliveryDate = "2 April";

		c13.order = o13;
		c13.getCartDetails();


		Cart c14 = new Cart();
		c14.userName = "Lakshmi";
		c14.numberOfItems = 4;
		c14.totalPrice = 4800;
		c14.paymentMethod = "UPI";
		c14.deliveryAddress = "Mysore";

		Order o14 = new Order();
		o14.orderId = "ORD114";
		o14.productName = "Saree";
		o14.quantity = 2;
		o14.orderStatus = "Shipped";
		o14.deliveryDate = "5 April";

		c14.order = o14;
		c14.getCartDetails();


		Cart c15 = new Cart();
		c15.userName = "Manoj";
		c15.numberOfItems = 3;
		c15.totalPrice = 3100;
		c15.paymentMethod = "Card";
		c15.deliveryAddress = "Nagpur";

		Order o15 = new Order();
		o15.orderId = "ORD115";
		o15.productName = "Backpack";
		o15.quantity = 1;
		o15.orderStatus = "Processing";
		o15.deliveryDate = "8 April";

		c15.order = o15;
		c15.getCartDetails();


		Cart c16 = new Cart();
		c16.userName = "Nisha";
		c16.numberOfItems = 2;
		c16.totalPrice = 2000;
		c16.paymentMethod = "UPI";
		c16.deliveryAddress = "Goa";

		Order o16 = new Order();
		o16.orderId = "ORD116";
		o16.productName = "Sunglasses";
		o16.quantity = 1;
		o16.orderStatus = "Delivered";
		o16.deliveryDate = "3 April";

		c16.order = o16;
		c16.getCartDetails();


		Cart c17 = new Cart();
		c17.userName = "Sanjay";
		c17.numberOfItems = 1;
		c17.totalPrice = 1500;
		c17.paymentMethod = "Cash on Delivery";
		c17.deliveryAddress = "Lucknow";

		Order o17 = new Order();
		o17.orderId = "ORD117";
		o17.productName = "Wallet";
		o17.quantity = 1;
		o17.orderStatus = "Shipped";
		o17.deliveryDate = "6 April";

		c17.order = o17;
		c17.getCartDetails();


		Cart c18 = new Cart();
		c18.userName = "Keerthi";
		c18.numberOfItems = 3;
		c18.totalPrice = 3600;
		c18.paymentMethod = "Card";
		c18.deliveryAddress = "Trivandrum";

		Order o18 = new Order();
		o18.orderId = "ORD118";
		o18.productName = "Perfume";
		o18.quantity = 1;
		o18.orderStatus = "Delivered";
		o18.deliveryDate = "2 April";

		c18.order = o18;
		c18.getCartDetails();


		Cart c19 = new Cart();
		c19.userName = "Ajay";
		c19.numberOfItems = 2;
		c19.totalPrice = 2900;
		c19.paymentMethod = "UPI";
		c19.deliveryAddress = "Indore";

		Order o19 = new Order();
		o19.orderId = "ORD119";
		o19.productName = "T-shirt";
		o19.quantity = 2;
		o19.orderStatus = "Processing";
		o19.deliveryDate = "9 April";

		c19.order = o19;
		c19.getCartDetails();


		Cart c20 = new Cart();
		c20.userName = "Ritika";
		c20.numberOfItems = 4;
		c20.totalPrice = 5200;
		c20.paymentMethod = "Card";
		c20.deliveryAddress = "Bhopal";

		Order o20 = new Order();
		o20.orderId = "ORD120";
		o20.productName = "Makeup Kit";
		o20.quantity = 1;
		o20.orderStatus = "Delivered";
		o20.deliveryDate = "3 April";

		c20.order = o20;
		c20.getCartDetails();
    }
}