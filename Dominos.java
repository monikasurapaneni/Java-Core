class Dominos {

    public static double search(String itemName){
        double price = 0.0;

        if(itemName=="Margherita Pizza"){
            price = 200;
            return price;
        }
        else if(itemName=="Farmhouse Pizza"){
            price = 250;
            return price;
        }
        else if(itemName=="Peppy Paneer Pizza"){
            price = 260;
            return price;
        }
        else if(itemName=="Veg Extravaganza"){
            price = 300;
            return price;
        }
        else if(itemName=="Deluxe Veggie Pizza"){
            price = 280;
            return price;
        }
        else if(itemName=="Cheese Burst Pizza"){
            price = 320;
            return price;
        }
        else if(itemName=="Pepper Barbecue Chicken"){
            price = 340;
            return price;
        }
        else if(itemName=="Chicken Dominator"){
            price = 380;
            return price;
        }
        else if(itemName=="Chicken Sausage Pizza"){
            price = 300;
            return price;
        }
        else if(itemName=="Indi Chicken Tikka"){
            price = 360;
            return price;
        }
        else if(itemName=="Garlic Breadsticks"){
            price = 120;
            return price;
        }
        else if(itemName=="Stuffed Garlic Bread"){
            price = 150;
            return price;
        }
        else if(itemName=="Cheese Garlic Bread"){
            price = 170;
            return price;
        }
        else if(itemName=="Paneer Zingy Parcel"){
            price = 90;
            return price;
        }
        else if(itemName=="Chicken Parcel"){
            price = 110;
            return price;
        }
        else if(itemName=="Veg Parcel"){
            price = 80;
            return price;
        }
        else if(itemName=="Taco Mexicana Veg"){
            price = 140;
            return price;
        }
        else if(itemName=="Taco Mexicana Non Veg"){
            price = 160;
            return price;
        }
        else if(itemName=="Veg Pasta Italiano"){
            price = 150;
            return price;
        }
        else if(itemName=="Chicken Pasta Italiano"){
            price = 180;
            return price;
        }
        else if(itemName=="Veg Loaded Pizza"){
            price = 260;
            return price;
        }
        else if(itemName=="Chicken Loaded Pizza"){
            price = 320;
            return price;
        }
        else if(itemName=="Double Cheese Margherita"){
            price = 280;
            return price;
        }
        else if(itemName=="Fresh Veggie Pizza"){
            price = 240;
            return price;
        }
        else if(itemName=="Paneer Makhani Pizza"){
            price = 290;
            return price;
        }
        else if(itemName=="Chicken Golden Delight"){
            price = 330;
            return price;
        }
        else if(itemName=="Chicken Fiesta Pizza"){
            price = 310;
            return price;
        }
        else if(itemName=="Veggie Paradise"){
            price = 270;
            return price;
        }
        else if(itemName=="Mexican Green Wave"){
            price = 280;
            return price;
        }
        else if(itemName=="Indi Tandoori Paneer"){
            price = 300;
            return price;
        }
        else if(itemName=="Chicken Pepperoni Pizza"){
            price = 350;
            return price;
        }
        else if(itemName=="Chicken BBQ Pizza"){
            price = 340;
            return price;
        }
        else if(itemName=="Veg Supreme Pizza"){
            price = 290;
            return price;
        }
        else if(itemName=="Paneer Supreme Pizza"){
            price = 310;
            return price;
        }
        else if(itemName=="Classic Veg Pizza"){
            price = 220;
            return price;
        }
        else if(itemName=="Classic Chicken Pizza"){
            price = 260;
            return price;
        }
        else if(itemName=="Cheese Dip"){
            price = 40;
            return price;
        }
        else if(itemName=="Tandoori Dip"){
            price = 50;
            return price;
        }
        else if(itemName=="Pizza Mania Combo"){
            price = 180;
            return price;
        }
        else if(itemName=="Family Meal Combo"){
            price = 600;
            return price;
        }
        else if(itemName=="Choco Lava Cake"){
            price = 110;
            return price;
        }
        else if(itemName=="Butterscotch Mousse Cake"){
            price = 120;
            return price;
        }
        else if(itemName=="Chocolate Brownie"){
            price = 100;
            return price;
        }
        else if(itemName=="Vanilla Ice Cream"){
            price = 90;
            return price;
        }
        else if(itemName=="Chocolate Ice Cream"){
            price = 100;
            return price;
        }
        else if(itemName=="Strawberry Ice Cream"){
            price = 95;
            return price;
        }
        else if(itemName=="Pepsi Bottle"){
            price = 60;
            return price;
        }
        else if(itemName=="Mirinda Bottle"){
            price = 60;
            return price;
        }
        else if(itemName=="7Up Bottle"){
            price = 60;
            return price;
        }
        else if(itemName=="Water Bottle"){
            price = 20;
            return price;
        }
        else if(itemName=="Cold Coffee"){
            price = 120;
            return price;
        }
        else if(itemName=="Chocolate Shake"){
            price = 130;
            return price;
        }
        else if(itemName=="Strawberry Shake"){
            price = 120;
            return price;
        }
        else if(itemName=="Vanilla Shake"){
            price = 110;
            return price;
        }
        else{
            System.out.println(itemName + " Not Found");
        }

        return price;
    }
	public static double search(String itemName, int quantity){
    double price = 0.0;

    if(itemName == "Cheese Burst Margherita"){
        price = 260 * quantity;
        return price;
    }else if(itemName == "Veggie Loaded Pizza"){
        price = 300 * quantity;
        return price;
    }else if(itemName == "Paneer Tikka Pizza"){
        price = 320 * quantity;
        return price;
    }else if(itemName == "Farmhouse Deluxe"){
        price = 340 * quantity;
        return price;
    }else if(itemName == "Mexican Fiesta Pizza"){
        price = 330 * quantity;
        return price;
    }else if(itemName == "Chicken BBQ Deluxe"){
        price = 360 * quantity;
        return price;
    }else if(itemName == "Chicken Pepperoni Feast"){
        price = 380 * quantity;
        return price;
    }else if(itemName == "Chicken Sausage Delight"){
        price = 350 * quantity;
        return price;
    }else if(itemName == "Double Cheese Veg Pizza"){
        price = 310 * quantity;
        return price;
    }else if(itemName == "Veggie Paradise Feast"){
        price = 290 * quantity;
        return price;
    }else if(itemName == "Paneer Supreme Delight"){
        price = 330 * quantity;
        return price;
    }else if(itemName == "Classic Veg Combo Pizza"){
        price = 250 * quantity;
        return price;
    }else if(itemName == "Classic Chicken Combo Pizza"){
        price = 280 * quantity;
        return price;
    }else if(itemName == "Stuffed Garlic Bread Deluxe"){
        price = 180 * quantity;
        return price;
    }else if(itemName == "Cheese Garlic Bread Combo"){
        price = 200 * quantity;
        return price;
    }else if(itemName == "Paneer Stuffed Bread"){
        price = 170 * quantity;
        return price;
    }else if(itemName == "Chicken Stuffed Bread"){
        price = 210 * quantity;
        return price;
    }else if(itemName == "Veg Taco Pocket"){
        price = 140 * quantity;
        return price;
    }else if(itemName == "Chicken Taco Pocket"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Veg Pasta Combo"){
        price = 180 * quantity;
        return price;
    }else if(itemName == "Chicken Pasta Combo"){
        price = 210 * quantity;
        return price;
    }else if(itemName == "White Sauce Pasta Veg"){
        price = 190 * quantity;
        return price;
    }else if(itemName == "White Sauce Pasta Chicken"){
        price = 230 * quantity;
        return price;
    }else if(itemName == "Red Sauce Pasta Veg"){
        price = 180 * quantity;
        return price;
    }else if(itemName == "Red Sauce Pasta Chicken"){
        price = 220 * quantity;
        return price;
    }else if(itemName == "Paneer Zingy Combo"){
        price = 130 * quantity;
        return price;
    }else if(itemName == "Chicken Zingy Combo"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Veg Parcel Combo"){
        price = 120 * quantity;
        return price;
    }else if(itemName == "Chicken Parcel Combo"){
        price = 140 * quantity;
        return price;
    }else if(itemName == "Garlic Breadsticks Combo"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Cheese Dip Combo"){
        price = 60 * quantity;
        return price;
    }else if(itemName == "Tandoori Dip Combo"){
        price = 70 * quantity;
        return price;
    }else if(itemName == "Choco Lava Cake Combo"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Chocolate Brownie Combo"){
        price = 140 * quantity;
        return price;
    }else if(itemName == "Butterscotch Cake Combo"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Vanilla Ice Cream Scoop"){
        price = 100 * quantity;
        return price;
    }else if(itemName == "Chocolate Ice Cream Scoop"){
        price = 110 * quantity;
        return price;
    }else if(itemName == "Strawberry Ice Cream Scoop"){
        price = 105 * quantity;
        return price;
    }else if(itemName == "Pepsi Combo Bottle"){
        price = 80 * quantity;
        return price;
    }else if(itemName == "7Up Combo Bottle"){
        price = 80 * quantity;
        return price;
    }else if(itemName == "Mirinda Combo Bottle"){
        price = 80 * quantity;
        return price;
    }else if(itemName == "Cold Coffee Combo"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Chocolate Shake Combo"){
        price = 160 * quantity;
        return price;
    }else if(itemName == "Strawberry Shake Combo"){
        price = 150 * quantity;
        return price;
    }else if(itemName == "Vanilla Shake Combo"){
        price = 140 * quantity;
        return price;
    }else if(itemName == "Water Bottle Pack"){
        price = 30 * quantity;
        return price;
    }else if(itemName == "Family Pizza Feast"){
        price = 700 * quantity;
        return price;
    }else if(itemName == "Mega Pizza Combo"){
        price = 650 * quantity;
        return price;
    }else if(itemName == "Weekend Party Combo"){
        price = 800 * quantity;
        return price;
    }else if(itemName == "Couple Meal Combo"){
        price = 500 * quantity;
        return price;
    }else if(itemName == "Veg Treat Combo"){
        price = 450 * quantity;
        return price;
    }else if(itemName == "Non Veg Treat Combo"){
        price = 600 * quantity;
        return price;
    }else{
        System.out.println(itemName + " Not found");
    }

    return price;
}
}