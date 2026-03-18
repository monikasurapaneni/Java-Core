class DoorDash {

    public static double search(String itemName){
        double price = 0.0;

        if(itemName=="BBQ Burger"){
            price = 140;
            return price;
        }
        else if(itemName=="Smoky Chicken Burger"){
            price = 180;
            return price;
        }
        else if(itemName=="Veg Supreme Pizza"){
            price = 220;
            return price;
        }
        else if(itemName=="Chicken Supreme Pizza"){
            price = 260;
            return price;
        }
        else if(itemName=="Cheese Lovers Pizza"){
            price = 240;
            return price;
        }
        else if(itemName=="Stuffed Garlic Bread"){
            price = 150;
            return price;
        }
        else if(itemName=="Cheese Corn Sandwich"){
            price = 120;
            return price;
        }
        else if(itemName=="Grilled Veg Sandwich"){
            price = 110;
            return price;
        }
        else if(itemName=="Chicken Club Sandwich"){
            price = 160;
            return price;
        }
        else if(itemName=="Paneer Roll"){
            price = 130;
            return price;
        }
        else if(itemName=="Chicken Roll"){
            price = 170;
            return price;
        }
        else if(itemName=="Egg Wrap"){
            price = 100;
            return price;
        }
        else if(itemName=="Veg Momos Steamed"){
            price = 90;
            return price;
        }
        else if(itemName=="Chicken Momos Steamed"){
            price = 130;
            return price;
        }
        else if(itemName=="Fried Chicken Momos"){
            price = 150;
            return price;
        }
        else if(itemName=="Paneer Chilli Dry"){
            price = 190;
            return price;
        }
        else if(itemName=="Chicken Chilli Dry"){
            price = 230;
            return price;
        }
        else if(itemName=="Veg Fried Rice Deluxe"){
            price = 150;
            return price;
        }
        else if(itemName=="Chicken Fried Rice Deluxe"){
            price = 190;
            return price;
        }
        else if(itemName=="Egg Fried Rice Special"){
            price = 170;
            return price;
        }
        else if(itemName=="Veg Hakka Noodles"){
            price = 140;
            return price;
        }
        else if(itemName=="Chicken Hakka Noodles"){
            price = 180;
            return price;
        }
        else if(itemName=="Schezwan Noodles Special"){
            price = 200;
            return price;
        }
        else if(itemName=="Sweet Corn Soup"){
            price = 120;
            return price;
        }
        else if(itemName=="Hot And Sour Soup"){
            price = 130;
            return price;
        }
        else if(itemName=="Paneer Butter Masala"){
            price = 200;
            return price;
        }
        else if(itemName=="Butter Chicken"){
            price = 240;
            return price;
        }
        else if(itemName=="Chicken Curry"){
            price = 220;
            return price;
        }
        else if(itemName=="Veg Biryani Special"){
            price = 160;
            return price;
        }
        else if(itemName=="Chicken Biryani Special"){
            price = 210;
            return price;
        }
        else if(itemName=="Mutton Biryani Special"){
            price = 280;
            return price;
        }
        else if(itemName=="Jeera Rice"){
            price = 120;
            return price;
        }
        else if(itemName=="Peas Pulao"){
            price = 140;
            return price;
        }
        else if(itemName=="Butter Naan"){
            price = 50;
            return price;
        }
        else if(itemName=="Garlic Naan"){
            price = 70;
            return price;
        }
        else if(itemName=="Tandoori Roti"){
            price = 40;
            return price;
        }
        else if(itemName=="Masala Dosa"){
            price = 100;
            return price;
        }
        else if(itemName=="Plain Dosa"){
            price = 80;
            return price;
        }
        else if(itemName=="Idli Plate"){
            price = 70;
            return price;
        }
        else if(itemName=="Medu Vada Plate"){
            price = 80;
            return price;
        }
        else if(itemName=="Upma Special"){
            price = 60;
            return price;
        }
        else if(itemName=="Poha Special"){
            price = 60;
            return price;
        }
        else if(itemName=="Cold Coffee Glass"){
            price = 120;
            return price;
        }
        else if(itemName=="Chocolate Milkshake"){
            price = 140;
            return price;
        }
        else if(itemName=="Strawberry Milkshake"){
            price = 130;
            return price;
        }
        else if(itemName=="Vanilla Milkshake"){
            price = 120;
            return price;
        }
        else if(itemName=="Ice Cream Cup"){
            price = 100;
            return price;
        }
        else if(itemName=="Chocolate Brownie"){
            price = 110;
            return price;
        }
        else if(itemName=="Cake Slice"){
            price = 120;
            return price;
        }
        else if(itemName=="Soft Drink Bottle"){
            price = 60;
            return price;
        }
        else if(itemName=="Mineral Water Bottle"){
            price = 30;
            return price;
        }
        else if(itemName=="Tea Cup"){
            price = 25;
            return price;
        }
        else if(itemName=="Coffee Cup"){
            price = 35;
            return price;
        }
        else{
            System.out.println(itemName + " Not Found");
        }

        return price;
    }
	public static double search(String itemName, int quantity){
    double price = 0.0;

    if(itemName == "Loaded Cheese Burger"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Crispy Chicken Burger"){
        price = 190 * quantity;
        return price;
    }else if(itemName == "Veggie Delight Pizza"){
        price = 230 * quantity;
        return price;
    }else if(itemName == "BBQ Chicken Pizza"){
        price = 270 * quantity;
        return price;
    }else if(itemName == "Paneer Tikka Pizza"){
        price = 250 * quantity;
        return price;
    }else if(itemName == "Cheesy Garlic Breadsticks"){
        price = 170 * quantity;
        return price;
    }else if(itemName == "Corn Cheese Sandwich"){
        price = 130 * quantity;
        return price;
    }else if(itemName == "Paneer Grilled Sandwich"){
        price = 140 * quantity;
        return price;
    }else if(itemName == "Chicken Mayo Sandwich"){
        price = 180 * quantity;
        return price;
    }else if(itemName == "Paneer Kathi Roll"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Chicken Kathi Roll"){
        price = 190 * quantity;
        return price;
    }else if(itemName == "Egg Chicken Roll"){
        price = 120 * quantity;
        return price;
    }else if(itemName == "Veg Dumplings"){
        price = 100 * quantity;
        return price;
    }else if(itemName == "Chicken Dumplings Fried"){
        price = 140 * quantity;
        return price;
    }else if(itemName == "Spicy Momos Fry"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Paneer Manchurian"){
        price = 200 * quantity;
        return price;
    }else if(itemName == "Chicken Manchurian Dry"){
        price = 240 * quantity;
        return price;
    }else if(itemName == "Veg Fried Rice Combo"){
        price = 170 * quantity;
        return price;
    }else if(itemName == "Chicken Fried Rice Combo"){
        price = 210 * quantity;
        return price;
    }else if(itemName == "Egg Fried Rice Combo"){
        price = 190 * quantity;
        return price;
    }else if(itemName == "Veg Noodles Combo"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Chicken Noodles Combo"){
        price = 200 * quantity;
        return price;
    }else if(itemName == "Schezwan Noodles Combo"){
        price = 220 * quantity;
        return price;
    }else if(itemName == "Creamy Corn Soup"){
        price = 140 * quantity;
        return price;
    }else if(itemName == "Chicken Clear Soup"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Paneer Masala Curry"){
        price = 210 * quantity;
        return price;
    }else if(itemName == "Butter Chicken Curry"){
        price = 250 * quantity;
        return price;
    }else if(itemName == "Chicken Handi"){
        price = 230 * quantity;
        return price;
    }else if(itemName == "Veg Dum Biryani"){
        price = 180 * quantity;
        return price;
    }else if(itemName == "Chicken Dum Biryani"){
        price = 220 * quantity;
        return price;
    }else if(itemName == "Mutton Dum Biryani"){
        price = 300 * quantity;
        return price;
    }else if(itemName == "Jeera Rice Combo"){
        price = 140 * quantity;
        return price;
    }else if(itemName == "Veg Pulao Combo"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Butter Roti Special"){
        price = 50 * quantity;
        return price;
    }else if(itemName == "Garlic Butter Naan"){
        price = 80 * quantity;
        return price;
    }else if(itemName == "Tandoori Roti Special"){
        price = 45 * quantity;
        return price;
    }else if(itemName == "Paper Masala Dosa"){
        price = 120 * quantity;
        return price;
    }else if(itemName == "Plain Uttapam"){
        price = 90 * quantity;
        return price;
    }else if(itemName == "Mini Idli Combo"){
        price = 80 * quantity;
        return price;
    }else if(itemName == "Vada Sambar Combo"){
        price = 100 * quantity;
        return price;
    }else if(itemName == "Kesari Bath Combo"){
        price = 70 * quantity;
        return price;
    }else if(itemName == "Curd Rice Bowl"){
        price = 90 * quantity;
        return price;
    }else if(itemName == "Cold Coffee Frappe"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Chocolate Shake Deluxe"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Oreo Milkshake Deluxe"){
        price = 170 * quantity;
        return price;
    }else if(itemName == "Mango Shake Special"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Kulfi Stick"){
        price = 110 * quantity;
        return price;
    }else if(itemName == "Brownie Sundae Deluxe"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Black Forest Pastry"){
        price = 140 * quantity;
        return price;
    }else if(itemName == "Red Velvet Pastry"){
        price = 170 * quantity;
        return price;
    }else if(itemName == "Cola Can"){
        price = 70 * quantity;
        return price;
    }else if(itemName == "Sprite Bottle"){
        price = 80 * quantity;
        return price;
    }else if(itemName == "Fresh Lime Juice"){
        price = 90 * quantity;
        return price;
    }else if(itemName == "Packaged Water Bottle"){
        price = 20 * quantity;
        return price;
    }else if(itemName == "Herbal Tea Cup"){
        price = 50 * quantity;
        return price;
    }else if(itemName == "Espresso Coffee"){
        price = 60 * quantity;
        return price;
    }else{
        System.out.println(itemName + " Not found");
    }

    return price;
}
}