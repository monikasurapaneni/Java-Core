class Swiggy {

    public static double search(String itemName){
        double price = 0.0;

        if(itemName=="Veg Supreme Pizza"){
            price = 180;
            return price;
        }
        else if(itemName=="Chicken Dominator Pizza"){
            price = 40;
            return price;
        }
        else if(itemName=="Butter Roti"){
            price = 30;
            return price;
        }
        else if(itemName=="Dal Fry Special"){
            price = 160;
            return price;
        }
        else if(itemName=="Chicken Curry"){
            price = 260;
            return price;
        }
        else if(itemName=="Fish Masala"){
            price = 280;
            return price;
        }
        else if(itemName=="Jeera Pulao"){
            price = 140;
            return price;
        }
        else if(itemName=="Chicken Noodles"){
            price = 180;
            return price;
        }
        else if(itemName=="Veg Chowmein"){
            price = 150;
            return price;
        }
        else if(itemName=="Thai Noodles"){
            price = 170;
            return price;
        }
        else if(itemName=="Spring Roll Veg"){
            price = 120;
            return price;
        }
        else if(itemName=="Gobi 65"){
            price = 190;
            return price;
        }
        else if(itemName=="Chicken Lollipop"){
            price = 210;
            return price;
        }
        else if(itemName=="Lunch Combo"){
            price = 150;
            return price;
        }
        else if(itemName=="Family Meal Combo"){
            price = 300;
            return price;
        }
        else if(itemName=="Mint Lemon Drink"){
            price = 50;
            return price;
        }
        else if(itemName=="Chocolate Milkshake"){
            price = 120;
            return price;
        }
        else if(itemName=="Strawberry Smoothie"){
            price = 110;
            return price;
        }
        else if(itemName=="Vanilla Milkshake"){
            price = 100;
            return price;
        }
        else if(itemName=="Oreo Blast Shake"){
            price = 130;
            return price;
        }
        else if(itemName=="Brownie Cake"){
            price = 90;
            return price;
        }
        else if(itemName=="Ice Cream Delight"){
            price = 140;
            return price;
        }
        else if(itemName=="Cheese Loaded Pizza"){
            price = 220;
            return price;
        }
        else if(itemName=="Spicy Paneer Pizza"){
            price = 260;
            return price;
        }
        else if(itemName=="Chicken Delight Pizza"){
            price = 300;
            return price;
        }
        else if(itemName=="Garlic Toast"){
            price = 120;
            return price;
        }
        else if(itemName=="Cheese Toast"){
            price = 150;
            return price;
        }
        else if(itemName=="Salted Fries"){
            price = 100;
            return price;
        }
        else if(itemName=="Masala Fries"){
            price = 130;
            return price;
        }
        else if(itemName=="Veg Roll"){
            price = 80;
            return price;
        }
        else if(itemName=="Grilled Wrap"){
            price = 110;
            return price;
        }
        else if(itemName=="Club Veg Sandwich"){
            price = 140;
            return price;
        }
        else if(itemName=="Aloo Burger"){
            price = 90;
            return price;
        }
        else if(itemName=="Chicken Crunch Burger"){
            price = 120;
            return price;
        }
        else if(itemName=="Double Cheese Burger"){
            price = 160;
            return price;
        }
        else if(itemName=="Paneer Wrap"){
            price = 130;
            return price;
        }
        else if(itemName=="Chicken Shawarma Roll"){
            price = 150;
            return price;
        }
        else if(itemName=="Egg Roll Special"){
            price = 100;
            return price;
        }
        else if(itemName=="Veg Dumplings"){
            price = 90;
            return price;
        }
        else if(itemName=="Chicken Steam Momos"){
            price = 120;
            return price;
        }
        else if(itemName=="Fried Dumplings"){
            price = 130;
            return price;
        }
        else if(itemName=="Paneer Tikka Special"){
            price = 200;
            return price;
        }
        else if(itemName=="Chicken Tandoori"){
            price = 250;
            return price;
        }
        else if(itemName=="Grilled Chicken Breast"){
            price = 300;
            return price;
        }
        else if(itemName=="Veg Mini Thali"){
            price = 180;
            return price;
        }
        else if(itemName=="Non Veg Deluxe Thali"){
            price = 250;
            return price;
        }
        else if(itemName=="Plain Rice"){
            price = 140;
            return price;
        }
        else if(itemName=="Stuffed Kulcha"){
            price = 120;
            return price;
        }
        else if(itemName=="Aloo Stuffed Paratha"){
            price = 60;
            return price;
        }
        else if(itemName=="Paneer Stuffed Paratha"){
            price = 80;
            return price;
        }
        else if(itemName=="Masala Dosa Special"){
            price = 90;
            return price;
        }
        else if(itemName=="Plain Uttapam"){
            price = 70;
            return price;
        }
        else if(itemName=="Mini Idli Plate"){
            price = 60;
            return price;
        }
        else if(itemName=="Medu Vada Plate"){
            price = 70;
            return price;
        }
        else if(itemName=="Kesari Halwa"){
            price = 50;
            return price;
        }
        else if(itemName=="Poha Special"){
            price = 50;
            return price;
        }
        else if(itemName=="Herbal Green Tea"){
            price = 20;
            return price;
        }
        else if(itemName=="Latte Coffee"){
            price = 30;
            return price;
        }
        else{
            System.out.println(itemName + " Not Found");
        }

        return price;
    }
	public static double search(String itemName, int quantity){
	double price=0.0;

	if(itemName == "Momos"){
	price = 220 * quantity;
	return price;
	}else if(itemName == "Pizza"){
	price = 260 * quantity;
	return price;
	}else if(itemName == "Desi Style Pizza"){
	price = 180 * quantity;
	return price;
	}else if(itemName == "Spicy Chicken Pizza"){
	price = 280 * quantity;
	return price;
	}else if(itemName == "Tandoori Pizza"){
	price = 320 * quantity;
	return price;
	}else if(itemName == "Butter Naan Special"){
	price = 40 * quantity;
	return price;
	}else if(itemName == "Plain Roti"){
	price = 60 * quantity;
	return price;
	}else if(itemName == "Stuffed Kulcha"){
	price = 30 * quantity;
	return price;
	}else if(itemName == "Dal Fry Classic"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Dal Special Tadka"){
	price = 200 * quantity;
	return price;
	}else if(itemName == "Paneer Butter Masala"){
	price = 210 * quantity;
	return price;
	}else if(itemName == "Veg Kofta Curry"){
	price = 230 * quantity;
	return price;
	}else if(itemName == "Gobi Manchurian"){
	price = 190 * quantity;
	return price;
	}else if(itemName == "Chicken Crispy"){
	price = 220 * quantity;
	return price;
	}else if(itemName == "Veg Fried Rice Special"){
	price = 140 * quantity;
	return price;
	}else if(itemName == "Chicken Rice Bowl"){
	price = 180 * quantity;
	return price;
	}else if(itemName == "Egg Rice Bowl"){
	price = 160 * quantity;
	return price;
	}else if(itemName == "Veg Noodles Special"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Thai Style Noodles"){
	price = 170 * quantity;
	return price;
	}else if(itemName == "Garlic Noodles"){
	price = 200 * quantity;
	return price;
	}else if(itemName == "Sweet Corn Soup"){
	price = 180 * quantity;
	return price;
	}else if(itemName == "Hot And Sour Soup"){
	price = 220 * quantity;
	return price;
	}else if(itemName == "Paneer Grill"){
	price = 210 * quantity;
	return price;
	}else if(itemName == "Chicken Wings"){
	price = 240 * quantity;
	return price;
	}else if(itemName == "Tandoori Grill Chicken"){
	price = 300 * quantity;
	return price;
	}else if(itemName == "Fish Fry"){
	price = 280 * quantity;
	return price;
	}else if(itemName == "Veg Cheese Burger"){
	price = 100 * quantity;
	return price;
	}else if(itemName == "Crispy Chicken Burger"){
	price = 140 * quantity;
	return price;
	}else if(itemName == "Double Patty Cheese Burger"){
	price = 180 * quantity;
	return price;
	}else if(itemName == "Salt Fries"){
	price = 120 * quantity;
	return price;
	}else if(itemName == "Spicy Fries"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Cheese Nuggets"){
	price = 160 * quantity;
	return price;
	}else if(itemName == "Paneer Pizza Slice"){
	price = 220 * quantity;
	return price;
	}else if(itemName == "Chicken Pizza Slice Special"){
	price = 280 * quantity;
	return price;
	}else if(itemName == "Cheese Burst Slice"){
	price = 320 * quantity;
	return price;
	}else if(itemName == "Garlic Breadsticks"){
	price = 110 * quantity;
	return price;
	}else if(itemName == "Stuffed Breadsticks"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Veg Shawarma"){
	price = 90 * quantity;
	return price;
	}else if(itemName == "Chicken Shawarma Roll"){
	price = 120 * quantity;
	return price;
	}else if(itemName == "Club Veg Sandwich"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Paneer Roll"){
	price = 140 * quantity;
	return price;
	}else if(itemName == "Chicken Kathi Roll"){
	price = 170 * quantity;
	return price;
	}else if(itemName == "Egg Wrap"){
	price = 120 * quantity;
	return price;
	}else if(itemName == "Veg Momos Steam"){
	price = 100 * quantity;
	return price;
	}else if(itemName == "Chicken Momos Fry"){
	price = 140 * quantity;
	return price;
	}else if(itemName == "Crispy Veg Momos"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Chocolate Brownie"){
	price = 110 * quantity;
	return price;
	}else if(itemName == "Ice Cream Delight"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Vanilla Scoop"){
	price = 90 * quantity;
	return price;
	}else if(itemName == "Chocolate Scoop"){
	price = 100 * quantity;
	return price;
	}else if(itemName == "Strawberry Scoop"){
	price = 95 * quantity;
	return price;
	}else if(itemName == "Banana Shake"){
	price = 130 * quantity;
	return price;
	}else if(itemName == "Cold Coffee Glass"){
	price = 120 * quantity;
	return price;
	}else if(itemName == "Sweet Lassi Glass"){
	price = 80 * quantity;
	return price;
	}else if(itemName == "Tea Cup"){
	price = 30 * quantity;
	return price;
	}else if(itemName == "Black Coffee"){
	price = 40 * quantity;
	return price;
	}else if(itemName == "Soft Drink Can"){
	price = 50 * quantity;
	return price;
	}else if(itemName == "Mineral Water Bottle"){
	price = 20 * quantity;
	return price;
	}else{
		System.out.println(itemName + " Not found");
	}

	return price;
}
}