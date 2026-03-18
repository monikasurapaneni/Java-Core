class Zomato {

    public static double search(String itemName){
        double price = 0.0;

        if(itemName=="Margherita Pizza"){
            price = 220;
            return price;
        }
        else if(itemName=="Pepperoni Pizza"){
            price = 250;
            return price;
        }
        else if(itemName=="Farmhouse Pizza"){
            price = 180;
            return price;
        }
        else if(itemName=="Garlic Naan"){
            price = 40;
            return price;
        }
        else if(itemName=="Rumali Roti"){
            price = 30;
            return price;
        }
        else if(itemName=="Dal Makhani"){
            price = 160;
            return price;
        }
        else if(itemName=="Butter Chicken"){
            price = 260;
            return price;
        }
        else if(itemName=="Prawn Curry"){
            price = 280;
            return price;
        }
        else if(itemName=="Veg Pulao"){
            price = 140;
            return price;
        }
        else if(itemName=="Egg Fried Rice"){
            price = 180;
            return price;
        }
        else if(itemName=="Chow Mein"){
            price = 150;
            return price;
        }
        else if(itemName=="Singapore Noodles"){
            price = 170;
            return price;
        }
        else if(itemName=="Veg Spring Roll"){
            price = 120;
            return price;
        }
        else if(itemName=="Paneer 65"){
            price = 190;
            return price;
        }
        else if(itemName=="Chicken 65"){
            price = 210;
            return price;
        }
        else if(itemName=="Meal Combo"){
            price = 150;
            return price;
        }
        else if(itemName=="Family Pizza Combo"){
            price = 300;
            return price;
        }
        else if(itemName=="Lemon Soda"){
            price = 50;
            return price;
        }
        else if(itemName=="Mango Shake"){
            price = 120;
            return price;
        } else if(itemName=="Banana Shake"){
            price = 110;
			return price;
        } else if(itemName=="Butterscotch Shake"){
            price = 100; 
			return price;
        } else if(itemName=="Kitkat Shake"){
            price = 130;
			return price;
        } else if(itemName=="Choco Lava Cake"){
            price = 90;
			return price;
        } else if(itemName=="Fruit Sundae"){
            price = 140; 
			return price;
        } else if(itemName=="Cheese Burst Pizza"){
            price = 220; 
			return price;
        } else if(itemName=="Mexican Pizza"){
            price = 260;
			return price;
        } else if(itemName=="BBQ Chicken Pizza"){
            price = 300; 
			return price;
        } else if(itemName=="Herb Garlic Bread"){
            price = 120;
			return price;
        } else if(itemName=="Stuffed Garlic Bread"){
            price = 150; 
			return price;
        } else if(itemName=="Curly Fries"){
            price = 100;
			return price;
        } else if(itemName=="Loaded Fries"){
            price = 130;
			return price;
        } else if(itemName=="Veg Wrap"){
            price = 80;
			return price;
        } else if(itemName=="Grilled Panini"){
            price = 110; 
			return price;
        } else if(itemName=="Triple Decker Sandwich"){
            price = 140;
			return price;
        } else if(itemName=="Aloo Tikki Burger"){
            price = 90; 
			return price;
        } else if(itemName=="Zinger Burger"){
            price = 120; 
			return price;
        } else if(itemName=="Cheese Burst Burger"){
            price = 160;
			return price;
        } else if(itemName=="Paneer Kathi Roll"){
            price = 130;
			return price;
        } else if(itemName=="Chicken Shawarma"){
            price = 150; 
			return price;
        } else if(itemName=="Egg Frankie"){
            price = 100;
			return price;
        } else if(itemName=="Steamed Momos"){
            price = 90; 
			return price;
        } else if(itemName=="Chicken Dumplings"){
            price = 120;
			return price;
        } else if(itemName=="Crispy Momos"){
            price = 130; 
			return price;
        } else if(itemName=="Malai Paneer Tikka"){
            price = 200; 
			return price;
        } else if(itemName=="Afghani Chicken"){
            price = 250;
			return price;
        } else if(itemName=="Grilled Chicken"){
            price = 300; 
			return price;
        } else if(itemName=="Mini Thali"){
            price = 180;
			return price;
        } else if(itemName=="Deluxe Thali"){
            price = 250; 
			return price;
        } else if(itemName=="Jeera Rice"){
            price = 140; 
			return price;
        } else if(itemName=="Amritsari Kulcha"){
            price = 120; 
			return price;
        } else if(itemName=="Stuffed Paratha"){
            price = 60; 
			return price;
        } else if(itemName=="Gobi Paratha"){
            price = 80; 
			return price;
        } else if(itemName=="Rava Dosa"){
            price = 90;
			return price;
        } else if(itemName=="Set Dosa"){
            price = 70;
			return price;
        } else if(itemName=="Mini Idli"){
            price = 60; 
			return price;
        } else if(itemName=="Medu Vada"){
            price = 70; 
			return price;
        } else if(itemName=="Kesari Bath"){
            price = 50; 
			return price;
        } else if(itemName=="Avalakki"){
            price = 50; 
			return price;
        } else if(itemName=="Green Tea"){
            price = 20; 
			return price;
        } else if(itemName=="Cappuccino"){
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

	if(itemName == "SourDough Pizza"){
	price = 220 * quantity;
	return price;
	}else if(itemName == "Panner Pizza"){
	price = 260 * quantity;
	return price;
	}else if(itemName == "Indi Indian  Pizza"){
	price = 180 * quantity;
	return price;
	}else if(itemName == "BBQ Chicken Pizza"){
	price = 280 * quantity;
	return price;
	}else if(itemName == "Mexican Pizza"){
	price = 320 * quantity;
	return price;
	}else if(itemName == "Garlic Naan"){
	price = 40 * quantity;
	return price;
	}else if(itemName == "Rumali Roti"){
	price = 60 * quantity;
	return price;
	}else if(itemName == "Laccha Paratha"){
	price = 30 * quantity;
	return price;
	}else if(itemName == "Dal Makhani"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Dal Tadka"){
	price = 200 * quantity;
	return price;
	}else if(itemName == "Paneer Lababdar"){
	price = 210 * quantity;
	return price;
	}else if(itemName == "Malai Kofta"){
	price = 230 * quantity;
	return price;
	}else if(itemName == "Paneer 65"){
	price = 190 * quantity;
	return price;
	}else if(itemName == "Chicken 65"){
	price = 220 * quantity;
	return price;
	}else if(itemName == "Veg Pulao"){
	price = 140 * quantity;
	return price;
	}else if(itemName == "Chicken Pulao"){
	price = 180 * quantity;
	return price;
	}else if(itemName == "Egg Pulao"){
	price = 160 * quantity;
	return price;
	}else if(itemName == "Chow Mein"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Singapore Noodles"){
	price = 170 * quantity;
	return price;
	}else if(itemName == "Chilli Garlic Noodles"){
	price = 200 * quantity;
	return price;
	}else if(itemName == "Veg Manchow Soup"){
	price = 180 * quantity;
	return price;
	}else if(itemName == "Chicken Manchow Soup"){
	price = 220 * quantity;
	return price;
	}else if(itemName == "Paneer Tikka"){
	price = 210 * quantity;
	return price;
	}else if(itemName == "Chicken Drumsticks"){
	price = 240 * quantity;
	return price;
	}else if(itemName == "Grilled Chicken"){
	price = 300 * quantity;
	return price;
	}else if(itemName == "Fish Fingers"){
	price = 280 * quantity;
	return price;
	}else if(itemName == "Aloo Tikki Burger"){
	price = 100 * quantity;
	return price;
	}else if(itemName == "Zinger Burger"){
	price = 140 * quantity;
	return price;
	}else if(itemName == "Cheese Burger"){
	price = 180 * quantity;
	return price;
	}else if(itemName == "Curly Fries"){
	price = 120 * quantity;
	return price;
	}else if(itemName == "Loaded Fries"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Mozzarella Sticks"){
	price = 160 * quantity;
	return price;
	}else if(itemName == "Veg Pizza Slice"){
	price = 220 * quantity;
	return price;
	}else if(itemName == "Chicken Pizza Slice"){
	price = 280 * quantity;
	return price;
	}else if(itemName == "Stuffed Crust Pizza"){
	price = 320 * quantity;
	return price;
	}else if(itemName == "Herb Garlic Bread"){
	price = 110 * quantity;
	return price;
	}else if(itemName == "Cheese Stuffed Bread"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Veg Wrap"){
	price = 90 * quantity;
	return price;
	}else if(itemName == "Chicken Wrap"){
	price = 120 * quantity;
	return price;
	}else if(itemName == "Club Sandwich"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Paneer Kathi Roll"){
	price = 140 * quantity;
	return price;
	}else if(itemName == "Chicken Shawarma"){
	price = 170 * quantity;
	return price;
	}else if(itemName == "Egg Frankie"){
	price = 120 * quantity;
	return price;
	}else if(itemName == "Steamed Dumplings"){
	price = 100 * quantity;
	return price;
	}else if(itemName == "Chicken Dumplings"){
	price = 140 * quantity;
	return price;
	}else if(itemName == "Crispy Dumplings"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Choco Lava Cake"){
	price = 110 * quantity;
	return price;
	}else if(itemName == "Fruit Sundae"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Butterscotch Ice Cream"){
	price = 90 * quantity;
	return price;
	}else if(itemName == "Black Forest Ice Cream"){
	price = 100 * quantity;
	return price;
	}else if(itemName == "Mango Ice Cream"){
	price = 95 * quantity;
	return price;
	}else if(itemName == "Oreo Milkshake"){
	price = 130 * quantity;
	return price;
	}else if(itemName == "Cold Brew Coffee"){
	price = 120 * quantity;
	return price;
	}else if(itemName == "Sweet Lassi"){
	price = 80 * quantity;
	return price;
	}else if(itemName == "Masala Tea"){
	price = 30 * quantity;
	return price;
	}else if(itemName == "Espresso"){
	price = 40 * quantity;
	return price;
	}else if(itemName == "Cola"){
	price = 50 * quantity;
	return price;
	}else if(itemName == "Packaged Water"){
	price = 20 * quantity;
	return price;
	}else{
		System.out.println(itemName + " Not found");
	}

	return price;
}

}