class UberEats {

    public static double search(String itemName){
        double price = 0.0;

        if(itemName=="Classic Burger"){
            price = 120;
            return price;
        }
        else if(itemName=="Cheese Burger"){
            price = 150;
            return price;
        }
        else if(itemName=="Chicken Burger"){
            price = 180;
            return price;
        }
        else if(itemName=="Veggie Pizza"){
            price = 200;
            return price;
        }
        else if(itemName=="Chicken Pizza"){
            price = 250;
            return price;
        }
        else if(itemName=="Pepperoni Pizza"){
            price = 300;
            return price;
        }
        else if(itemName=="French Fries"){
            price = 90;
            return price;
        }
        else if(itemName=="Peri Peri Fries"){
            price = 110;
            return price;
        }
        else if(itemName=="Garlic Bread"){
            price = 120;
            return price;
        }
        else if(itemName=="Cheese Garlic Bread"){
            price = 140;
            return price;
        }
        else if(itemName=="Veg Sandwich"){
            price = 80;
            return price;
        }
        else if(itemName=="Grilled Sandwich"){
            price = 100;
            return price;
        }
        else if(itemName=="Club Sandwich"){
            price = 130;
            return price;
        }
        else if(itemName=="Paneer Wrap"){
            price = 110;
            return price;
        }
        else if(itemName=="Chicken Wrap"){
            price = 140;
            return price;
        }
        else if(itemName=="Egg Roll"){
            price = 90;
            return price;
        }
        else if(itemName=="Veg Momos"){
            price = 80;
            return price;
        }
        else if(itemName=="Chicken Momos"){
            price = 110;
            return price;
        }
        else if(itemName=="Fried Momos"){
            price = 120;
            return price;
        }
        else if(itemName=="Paneer Tikka"){
            price = 180;
            return price;
        }
        else if(itemName=="Chicken Tikka"){
            price = 220;
            return price;
        }
        else if(itemName=="Tandoori Chicken"){
            price = 260;
            return price;
        }
        else if(itemName=="Veg Biryani"){
            price = 150;
            return price;
        }
        else if(itemName=="Chicken Biryani"){
            price = 200;
            return price;
        }
        else if(itemName=="Mutton Biryani"){
            price = 260;
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
        else if(itemName=="Chilli Paneer"){
            price = 160;
            return price;
        }
        else if(itemName=="Chilli Chicken"){
            price = 200;
            return price;
        }
        else if(itemName=="Dal Makhani"){
            price = 140;
            return price;
        }
        else if(itemName=="Paneer Butter Masala"){
            price = 180;
            return price;
        }
        else if(itemName=="Butter Chicken"){
            price = 220;
            return price;
        }
        else if(itemName=="Naan"){
            price = 40;
            return price;
        }
        else if(itemName=="Butter Naan"){
            price = 50;
            return price;
        }
        else if(itemName=="Tandoori Roti"){
            price = 30;
            return price;
        }
        else if(itemName=="Masala Dosa"){
            price = 90;
            return price;
        }
        else if(itemName=="Plain Dosa"){
            price = 70;
            return price;
        }
        else if(itemName=="Idli"){
            price = 60;
            return price;
        }
        else if(itemName=="Vada"){
            price = 70;
            return price;
        }
        else if(itemName=="Upma"){
            price = 50;
            return price;
        }
        else if(itemName=="Poha"){
            price = 50;
            return price;
        }
        else if(itemName=="Cold Coffee"){
            price = 100;
            return price;
        }
        else if(itemName=="Milkshake"){
            price = 110;
            return price;
        }
        else if(itemName=="Chocolate Shake"){
            price = 120;
            return price;
        }
        else if(itemName=="Strawberry Shake"){
            price = 110;
            return price;
        }
        else if(itemName=="Vanilla Shake"){
            price = 100;
            return price;
        }
        else if(itemName=="Ice Cream"){
            price = 90;
            return price;
        }
        else if(itemName=="Brownie"){
            price = 80;
            return price;
        }
        else if(itemName=="Cake Slice"){
            price = 100;
            return price;
        }
        else if(itemName=="Soft Drink"){
            price = 50;
            return price;
        }
        else if(itemName=="Mineral Water"){
            price = 20;
            return price;
        }
        else if(itemName=="Tea"){
            price = 20;
            return price;
        }
        else if(itemName=="Coffee"){
            price = 30;
            return price;
        }
        else{
            System.out.println(itemName + " Not Found");
        }

        return price;
    }
	public static double search(String itemName, int quantity){
    double price = 0.0;

    if(itemName == "Loaded Veg Burger"){
        price = 130 * quantity;
        return price;
    }else if(itemName == "Double Chicken Burger"){
        price = 190 * quantity;
        return price;
    }else if(itemName == "Cheese Overload Pizza"){
        price = 280 * quantity;
        return price;
    }else if(itemName == "Farm Fresh Pizza"){
        price = 240 * quantity;
        return price;
    }else if(itemName == "Spicy Paneer Pizza"){
        price = 220 * quantity;
        return price;
    }else if(itemName == "Stuffed Garlic Bread"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Cheese Corn Sandwich"){
        price = 120 * quantity;
        return price;
    }else if(itemName == "Chicken Club Sandwich"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Paneer Shawarma"){
        price = 140 * quantity;
        return price;
    }else if(itemName == "Chicken Shawarma Roll"){
        price = 170 * quantity;
        return price;
    }else if(itemName == "Veg Spring Rolls"){
        price = 110 * quantity;
        return price;
    }else if(itemName == "Chicken Spring Rolls"){
        price = 140 * quantity;
        return price;
    }else if(itemName == "Paneer Chilli Dry"){
        price = 180 * quantity;
        return price;
    }else if(itemName == "Chicken Chilli Dry"){
        price = 220 * quantity;
        return price;
    }else if(itemName == "Veg Schezwan Rice"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Chicken Schezwan Rice"){
        price = 190 * quantity;
        return price;
    }else if(itemName == "Egg Noodles Special"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Veg Triple Noodles"){
        price = 170 * quantity;
        return price;
    }else if(itemName == "Chicken Triple Noodles"){
        price = 210 * quantity;
        return price;
    }else if(itemName == "Hot Garlic Soup"){
        price = 120 * quantity;
        return price;
    }else if(itemName == "Sweet Corn Chicken Soup"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Paneer Lababdar Special"){
        price = 200 * quantity;
        return price;
    }else if(itemName == "Chicken Butter Masala"){
        price = 240 * quantity;
        return price;
    }else if(itemName == "Mutton Rogan Josh"){
        price = 300 * quantity;
        return price;
    }else if(itemName == "Jeera Rice Special"){
        price = 130 * quantity;
        return price;
    }else if(itemName == "Peas Pulao"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Veg Thali Deluxe"){
        price = 200 * quantity;
        return price;
    }else if(itemName == "Non Veg Thali Special"){
        price = 280 * quantity;
        return price;
    }else if(itemName == "Butter Roti"){
        price = 40 * quantity;
        return price;
    }else if(itemName == "Garlic Butter Naan"){
        price = 70 * quantity;
        return price;
    }else if(itemName == "Onion Kulcha"){
        price = 60 * quantity;
        return price;
    }else if(itemName == "Paper Dosa"){
        price = 100 * quantity;
        return price;
    }else if(itemName == "Mysore Masala Dosa"){
        price = 120 * quantity;
        return price;
    }else if(itemName == "Rava Idli"){
        price = 80 * quantity;
        return price;
    }else if(itemName == "Sambar Vada"){
        price = 90 * quantity;
        return price;
    }else if(itemName == "Lemon Rice"){
        price = 70 * quantity;
        return price;
    }else if(itemName == "Curd Rice"){
        price = 80 * quantity;
        return price;
    }else if(itemName == "Cold Coffee Frappe"){
        price = 140 * quantity;
        return price;
    }else if(itemName == "Chocolate Milkshake"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Oreo Shake"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Mango Milkshake"){
        price = 140 * quantity;
        return price;
    }else if(itemName == "Kulfi Ice Cream"){
        price = 100 * quantity;
        return price;
    }else if(itemName == "Chocolate Brownie Sundae"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Black Forest Cake"){
        price = 130 * quantity;
        return price;
    }else if(itemName == "Red Velvet Cake"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Pepsi Can"){
        price = 60 * quantity;
        return price;
    }else if(itemName == "Coca Cola Bottle"){
        price = 70 * quantity;
        return price;
    }else if(itemName == "Fresh Lime Soda"){
        price = 80 * quantity;
        return price;
    }else if(itemName == "Packaged Drinking Water"){
        price = 20 * quantity;
        return price;
    }else if(itemName == "Green Tea Cup"){
        price = 40 * quantity;
        return price;
    }else if(itemName == "Black Coffee"){
        price = 50 * quantity;
        return price;
    }else if(itemName == "Cappuccino Coffee"){
        price = 90 * quantity;
        return price;
    }else{
        System.out.println(itemName + " Not found");
    }

    return price;
}
}