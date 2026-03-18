class EatSure {

    public static double search(String itemName){
        double price = 0.0;

        if(itemName=="Paneer Butter Masala"){
            price = 220;
            return price;
        }
        else if(itemName=="Chicken Biryani"){
            price = 250;
            return price;
        }
        else if(itemName=="Veg Biryani"){
            price = 180;
            return price;
        }
        else if(itemName=="Butter Naan"){
            price = 40;
            return price;
        }
        else if(itemName=="Tandoori Roti"){
            price = 30;
            return price;
        }
        else if(itemName=="Dal Tadka"){
            price = 160;
            return price;
        }
        else if(itemName=="Kadai Chicken"){
            price = 260;
            return price;
        }
        else if(itemName=="Fish Curry"){
            price = 280;
            return price;
        }
        else if(itemName=="Veg Fried Rice"){
            price = 140;
            return price;
        }
        else if(itemName=="Chicken Fried Rice"){
            price = 180;
            return price;
        }
        else if(itemName=="Hakka Noodles"){
            price = 150;
            return price;
        }
        else if(itemName=="Schezwan Noodles"){
            price = 170;
            return price;
        }
        else if(itemName=="Spring Rolls"){
            price = 120;
            return price;
        }
        else if(itemName=="Chilli Paneer"){
            price = 190;
            return price;
        }
        else if(itemName=="Chilli Chicken"){
            price = 210;
            return price;
        }
        else if(itemName=="Burger Meal"){
            price = 150;
            return price;
        }
        else if(itemName=="Pizza Combo"){
            price = 300;
            return price;
        }
        else if(itemName=="Cold Drink"){
            price = 50;
            return price;
        }
        else if(itemName=="Chocolate Shake"){
            price = 120;
            return price;
        } else if(itemName=="Strawberry Shake"){
            price = 110;
			return price;
        } else if(itemName=="Vanilla Shake"){
            price = 100; 
			return price;
        } else if(itemName=="Oreo Shake"){
            price = 130;
			return price;
        } else if(itemName=="Brownie"){
            price = 90;
			return price;
        } else if(itemName=="Ice Cream Sundae"){
            price = 140; 
			return price;
        } else if(itemName=="Cheese Pizza"){
            price = 220; 
			return price;
        } else if(itemName=="Veg Loaded Pizza"){
            price = 260;
			return price;
        } else if(itemName=="Chicken Loaded Pizza"){
            price = 300; 
			return price;
        } else if(itemName=="Garlic Bread"){
            price = 120;
			return price;
        } else if(itemName=="Cheese Garlic Bread"){
            price = 150; 
			return price;
        } else if(itemName=="French Fries"){
            price = 100;
			return price;
        } else if(itemName=="Peri Peri Fries"){
            price = 130;
			return price;
        } else if(itemName=="Veg Sandwich"){
            price = 80;
			return price;
        } else if(itemName=="Grilled Sandwich"){
            price = 110; 
			return price;
        } else if(itemName=="Club Sandwich"){
            price = 140;
			return price;
        } else if(itemName=="Veg Burger"){
            price = 90; 
			return price;
        } else if(itemName=="Chicken Burger"){
            price = 120; 
			return price;
        } else if(itemName=="Double Patty Burger"){
            price = 160;
			return price;
        } else if(itemName=="Paneer Roll"){
            price = 130;
			return price;
        } else if(itemName=="Chicken Roll"){
            price = 150; 
			return price;
        } else if(itemName=="Egg Roll"){
            price = 100;
			return price;
        } else if(itemName=="Veg Momos"){
            price = 90; 
			return price;
        } else if(itemName=="Chicken Momos"){
            price = 120;
			return price;
        } else if(itemName=="Fried Momos"){
            price = 130; 
			return price;
        } else if(itemName=="Paneer Tikka"){
            price = 200; 
			return price;
        } else if(itemName=="Chicken Tikka"){
            price = 250;
			return price;
        } else if(itemName=="Tandoori Chicken"){
            price = 300; 
			return price;
        } else if(itemName=="Veg Thali"){
            price = 180;
			return price;
        } else if(itemName=="Non Veg Thali"){
            price = 250; 
			return price;
        } else if(itemName=="Rajma Chawal"){
            price = 140; 
			return price;
        } else if(itemName=="Chole Bhature"){
            price = 120; 
			return price;
        } else if(itemName=="Aloo Paratha"){
            price = 60; 
			return price;
        } else if(itemName=="Paneer Paratha"){
            price = 80; 
			return price;
        } else if(itemName=="Masala Dosa"){
            price = 90;
			return price;
        } else if(itemName=="Plain Dosa"){
            price = 70;
			return price;
        } else if(itemName=="Idli Sambar"){
            price = 60; 
			return price;
        } else if(itemName=="Vada Sambar"){
            price = 70; 
			return price;
        } else if(itemName=="Upma"){
            price = 50; 
			return price;
        } else if(itemName=="Poha"){
            price = 50; 
			return price;
        } else if(itemName=="Tea"){
            price = 20; 
			return price;
        } else if(itemName=="Coffee"){
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

	if(itemName == "Paneer Butter Masala"){
	price = 220 * quantity;
	return price;
	}else if(itemName == "Chicken Tikka Masala"){
	price = 260 * quantity;
	return price;
	}else if(itemName == "Veg Biryani"){
	price = 180 * quantity;
	return price;
	}else if(itemName == "Chicken Dum Biryani"){
	price = 280 * quantity;
	return price;
	}else if(itemName == "Mutton Biryani"){
	price = 320 * quantity;
	return price;
	}else if(itemName == "Butter Naan"){
	price = 40 * quantity;
	return price;
	}else if(itemName == "Garlic Naan"){
	price = 60 * quantity;
	return price;
	}else if(itemName == "Tandoori Roti"){
	price = 30 * quantity;
	return price;
	}else if(itemName == "Dal Fry"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Dal Makhani"){
	price = 200 * quantity;
	return price;
	}else if(itemName == "Kadai Paneer"){
	price = 210 * quantity;
	return price;
	}else if(itemName == "Shahi Paneer"){
	price = 230 * quantity;
	return price;
	}else if(itemName == "Chilli Paneer"){
	price = 190 * quantity;
	return price;
	}else if(itemName == "Chilli Chicken"){
	price = 220 * quantity;
	return price;
	}else if(itemName == "Veg Fried Rice"){
	price = 140 * quantity;
	return price;
	}else if(itemName == "Chicken Fried Rice"){
	price = 180 * quantity;
	return price;
	}else if(itemName == "Egg Fried Rice"){
	price = 160 * quantity;
	return price;
	}else if(itemName == "Hakka Noodles"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Schezwan Noodles"){
	price = 170 * quantity;
	return price;
	}else if(itemName == "American Chopsuey"){
	price = 200 * quantity;
	return price;
	}else if(itemName == "Veg Manchurian"){
	price = 180 * quantity;
	return price;
	}else if(itemName == "Chicken Manchurian"){
	price = 220 * quantity;
	return price;
	}else if(itemName == "Paneer Tikka"){
	price = 210 * quantity;
	return price;
	}else if(itemName == "Chicken Wings"){
	price = 240 * quantity;
	return price;
	}else if(itemName == "Tandoori Chicken"){
	price = 300 * quantity;
	return price;
	}else if(itemName == "Fish Tikka"){
	price = 280 * quantity;
	return price;
	}else if(itemName == "Veg Burger"){
	price = 100 * quantity;
	return price;
	}else if(itemName == "Chicken Burger"){
	price = 140 * quantity;
	return price;
	}else if(itemName == "Double Patty Burger"){
	price = 180 * quantity;
	return price;
	}else if(itemName == "French Fries"){
	price = 120 * quantity;
	return price;
	}else if(itemName == "Peri Peri Fries"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Cheese Balls"){
	price = 160 * quantity;
	return price;
	}else if(itemName == "Veg Pizza"){
	price = 220 * quantity;
	return price;
	}else if(itemName == "Chicken Pizza"){
	price = 280 * quantity;
	return price;
	}else if(itemName == "Cheese Burst Pizza"){
	price = 320 * quantity;
	return price;
	}else if(itemName == "Garlic Bread"){
	price = 110 * quantity;
	return price;
	}else if(itemName == "Cheese Garlic Bread"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Veg Sandwich"){
	price = 90 * quantity;
	return price;
	}else if(itemName == "Grilled Sandwich"){
	price = 120 * quantity;
	return price;
	}else if(itemName == "Club Sandwich"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Paneer Roll"){
	price = 140 * quantity;
	return price;
	}else if(itemName == "Chicken Roll"){
	price = 170 * quantity;
	return price;
	}else if(itemName == "Egg Roll"){
	price = 120 * quantity;
	return price;
	}else if(itemName == "Veg Momos"){
	price = 100 * quantity;
	return price;
	}else if(itemName == "Chicken Momos"){
	price = 140 * quantity;
	return price;
	}else if(itemName == "Fried Momos"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Chocolate Brownie"){
	price = 110 * quantity;
	return price;
	}else if(itemName == "Ice Cream Sundae"){
	price = 150 * quantity;
	return price;
	}else if(itemName == "Vanilla Ice Cream"){
	price = 90 * quantity;
	return price;
	}else if(itemName == "Chocolate Ice Cream"){
	price = 100 * quantity;
	return price;
	}else if(itemName == "Strawberry Ice Cream"){
	price = 95 * quantity;
	return price;
	}else if(itemName == "Milkshake"){
	price = 130 * quantity;
	return price;
	}else if(itemName == "Cold Coffee"){
	price = 120 * quantity;
	return price;
	}else if(itemName == "Lassi"){
	price = 80 * quantity;
	return price;
	}else if(itemName == "Masala Chai"){
	price = 30 * quantity;
	return price;
	}else if(itemName == "Filter Coffee"){
	price = 40 * quantity;
	return price;
	}else if(itemName == "Soft Drink"){
	price = 50 * quantity;
	return price;
	}else if(itemName == "Mineral Water"){
	price = 20 * quantity;
	return price;
	}else{
		System.out.println(itemName + " Not found");
	}

	return price;
	}
}
	  
	  