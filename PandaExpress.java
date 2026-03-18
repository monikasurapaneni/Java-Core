class PandaExpress {

    public static double search(String itemName){
        double price = 0.0;

        if(itemName=="Orange Chicken"){
            price = 220;
            return price;
        }
        else if(itemName=="Kung Pao Chicken"){
            price = 240;
            return price;
        }
        else if(itemName=="Black Pepper Chicken"){
            price = 230;
            return price;
        }
        else if(itemName=="Grilled Teriyaki Chicken"){
            price = 260;
            return price;
        }
        else if(itemName=="Beijing Beef"){
            price = 280;
            return price;
        }
        else if(itemName=="Mongolian Beef"){
            price = 300;
            return price;
        }
        else if(itemName=="Broccoli Beef"){
            price = 250;
            return price;
        }
        else if(itemName=="Honey Walnut Shrimp"){
            price = 320;
            return price;
        }
        else if(itemName=="SweetFire Chicken"){
            price = 260;
            return price;
        }
        else if(itemName=="Chow Mein"){
            price = 150;
            return price;
        }
        else if(itemName=="Fried Rice"){
            price = 160;
            return price;
        }
        else if(itemName=="Steamed White Rice"){
            price = 120;
            return price;
        }
        else if(itemName=="Brown Rice"){
            price = 140;
            return price;
        }
        else if(itemName=="Super Greens"){
            price = 180;
            return price;
        }
        else if(itemName=="Eggplant Tofu"){
            price = 200;
            return price;
        }
        else if(itemName=="Veggie Spring Rolls"){
            price = 120;
            return price;
        }
        else if(itemName=="Chicken Egg Roll"){
            price = 140;
            return price;
        }
        else if(itemName=="Cream Cheese Rangoon"){
            price = 150;
            return price;
        }
        else if(itemName=="Hot & Sour Soup"){
            price = 130;
            return price;
        }
        else if(itemName=="Wonton Soup"){
            price = 140;
            return price;
        }
        else if(itemName=="Chicken Dumplings"){
            price = 160;
            return price;
        }
        else if(itemName=="Veg Dumplings"){
            price = 140;
            return price;
        }
        else if(itemName=="Shrimp Dumplings"){
            price = 200;
            return price;
        }
        else if(itemName=="Chicken Lettuce Wrap"){
            price = 210;
            return price;
        }
        else if(itemName=="Crispy Chicken Bites"){
            price = 190;
            return price;
        }
        else if(itemName=="Sweet & Sour Chicken"){
            price = 220;
            return price;
        }
        else if(itemName=="Spicy Szechuan Chicken"){
            price = 240;
            return price;
        }
        else if(itemName=="Garlic Shrimp"){
            price = 280;
            return price;
        }
        else if(itemName=="Chili Garlic Noodles"){
            price = 170;
            return price;
        }
        else if(itemName=="Singapore Rice Noodles"){
            price = 180;
            return price;
        }
        else if(itemName=="Veg Fried Noodles"){
            price = 150;
            return price;
        }
        else if(itemName=="Chicken Fried Noodles"){
            price = 180;
            return price;
        }
        else if(itemName=="Shrimp Fried Rice"){
            price = 220;
            return price;
        }
        else if(itemName=="Chicken Fried Rice"){
            price = 190;
            return price;
        }
        else if(itemName=="Veg Fried Rice"){
            price = 160;
            return price;
        }
        else if(itemName=="Tofu Stir Fry"){
            price = 180;
            return price;
        }
        else if(itemName=="Veg Manchurian"){
            price = 170;
            return price;
        }
        else if(itemName=="Chicken Manchurian"){
            price = 210;
            return price;
        }
        else if(itemName=="Paneer Chili"){
            price = 200;
            return price;
        }
        else if(itemName=="Chicken Chili"){
            price = 220;
            return price;
        }
        else if(itemName=="Fish Chili"){
            price = 240;
            return price;
        }
        else if(itemName=="Veg Hakka Noodles"){
            price = 150;
            return price;
        }
        else if(itemName=="Chicken Hakka Noodles"){
            price = 180;
            return price;
        }
        else if(itemName=="Egg Hakka Noodles"){
            price = 160;
            return price;
        }
        else if(itemName=="Pineapple Fried Rice"){
            price = 200;
            return price;
        }
        else if(itemName=="Thai Basil Chicken"){
            price = 230;
            return price;
        }
        else if(itemName=="Thai Green Curry"){
            price = 250;
            return price;
        }
        else if(itemName=="Thai Red Curry"){
            price = 250;
            return price;
        }
        else if(itemName=="Lemon Chicken"){
            price = 220;
            return price;
        }
        else if(itemName=="Sesame Chicken"){
            price = 240;
            return price;
        }
        else if(itemName=="Dragon Chicken"){
            price = 260;
            return price;
        }
        else if(itemName=="Honey Chili Potato"){
            price = 150;
            return price;
        }
        else if(itemName=="Crispy Corn"){
            price = 140;
            return price;
        }
        else if(itemName=="Veg Combo Meal"){
            price = 200;
            return price;
        }
        else if(itemName=="Chicken Combo Meal"){
            price = 240;
            return price;
        }
        else if(itemName=="Family Meal Box"){
            price = 400;
            return price;
        }
        else{
            System.out.println(itemName + " Not Found");
        }

        return price;
    }

    public static double search(String itemName, int quantity){
        double price = 0.0;

        if(itemName=="Orange Chicken"){
            price = 220 * quantity;
            return price;
        }
        else if(itemName=="Kung Pao Chicken"){
            price = 240 * quantity;
            return price;
        }
        else if(itemName=="Black Pepper Chicken"){
            price = 230 * quantity;
            return price;
        }
        else if(itemName=="Grilled Teriyaki Chicken"){
            price = 260 * quantity;
            return price;
        }
        else if(itemName=="Beijing Beef"){
            price = 280 * quantity;
            return price;
        }
        else if(itemName=="Mongolian Beef"){
            price = 300 * quantity;
            return price;
        }
        else if(itemName=="Broccoli Beef"){
            price = 250 * quantity;
            return price;
        }
        else if(itemName=="Honey Walnut Shrimp"){
            price = 320 * quantity;
            return price;
        }
        else if(itemName=="SweetFire Chicken"){
            price = 260 * quantity;
            return price;
        }
        else if(itemName=="Chow Mein"){
            price = 150 * quantity;
            return price;
        }
        else if(itemName=="Fried Rice"){
            price = 160 * quantity;
            return price;
        }
        else if(itemName=="Steamed White Rice"){
            price = 120 * quantity;
            return price;
        }
        else if(itemName=="Brown Rice"){
            price = 140 * quantity;
            return price;
        }
        else if(itemName=="Super Greens"){
            price = 180 * quantity;
            return price;
        }
        else if(itemName=="Eggplant Tofu"){
            price = 200 * quantity;
            return price;
        }
        else if(itemName=="Veggie Spring Rolls"){
            price = 120 * quantity;
            return price;
        }
        else if(itemName=="Chicken Egg Roll"){
            price = 140 * quantity;
            return price;
        }
        else if(itemName=="Cream Cheese Rangoon"){
            price = 150 * quantity;
            return price;
        }
        else if(itemName=="Hot & Sour Soup"){
            price = 130 * quantity;
            return price;
        }
        else if(itemName=="Wonton Soup"){
            price = 140 * quantity;
            return price;
        }
        else if(itemName=="Chicken Dumplings"){
            price = 160 * quantity;
            return price;
        }
        else if(itemName=="Veg Dumplings"){
            price = 140 * quantity;
            return price;
        }
        else if(itemName=="Shrimp Dumplings"){
            price = 200 * quantity;
            return price;
        }
        else if(itemName=="Chicken Lettuce Wrap"){
            price = 210 * quantity;
            return price;
        }
        else if(itemName=="Crispy Chicken Bites"){
            price = 190 * quantity;
            return price;
        }
        else if(itemName=="Sweet & Sour Chicken"){
            price = 220 * quantity;
            return price;
        }
        else if(itemName=="Spicy Szechuan Chicken"){
            price = 240 * quantity;
            return price;
        }
        else if(itemName=="Garlic Shrimp"){
            price = 280 * quantity;
            return price;
        }
        else if(itemName=="Chili Garlic Noodles"){
            price = 170 * quantity;
            return price;
        }
        else if(itemName=="Singapore Rice Noodles"){
            price = 180 * quantity;
            return price;
        }
        else if(itemName=="Veg Fried Noodles"){
            price = 150 * quantity;
            return price;
        }
        else if(itemName=="Chicken Fried Noodles"){
            price = 180 * quantity;
            return price;
        }
        else if(itemName=="Shrimp Fried Rice"){
            price = 220 * quantity;
            return price;
        }
        else if(itemName=="Chicken Fried Rice"){
            price = 190 * quantity;
            return price;
        }
        else if(itemName=="Veg Fried Rice"){
            price = 160 * quantity;
            return price;
        }
        else if(itemName=="Tofu Stir Fry"){
            price = 180 * quantity;
            return price;
        }
        else if(itemName=="Veg Manchurian"){
            price = 170 * quantity;
            return price;
        }
        else if(itemName=="Chicken Manchurian"){
            price = 210 * quantity;
            return price;
        }
        else if(itemName=="Paneer Chili"){
            price = 200 * quantity;
            return price;
        }
        else if(itemName=="Chicken Chili"){
            price = 220 * quantity;
            return price;
        }
        else if(itemName=="Fish Chili"){
            price = 240 * quantity;
            return price;
        }
        else if(itemName=="Veg Hakka Noodles"){
            price = 150 * quantity;
            return price;
        }
        else if(itemName=="Chicken Hakka Noodles"){
            price = 180 * quantity;
            return price;
        }
        else if(itemName=="Egg Hakka Noodles"){
            price = 160 * quantity;
            return price;
        }
        else if(itemName=="Pineapple Fried Rice"){
            price = 200 * quantity;
            return price;
        }
        else if(itemName=="Thai Basil Chicken"){
            price = 230 * quantity;
            return price;
        }
        else if(itemName=="Thai Green Curry"){
            price = 250 * quantity;
            return price;
        }
        else if(itemName=="Thai Red Curry"){
            price = 250 * quantity;
            return price;
        }
        else if(itemName=="Lemon Chicken"){
            price = 220 * quantity;
            return price;
        }
        else if(itemName=="Sesame Chicken"){
            price = 240 * quantity;
            return price;
        }
        else if(itemName=="Dragon Chicken"){
            price = 260 * quantity;
            return price;
        }
        else if(itemName=="Honey Chili Potato"){
            price = 150 * quantity;
            return price;
        }
        else if(itemName=="Crispy Corn"){
            price = 140 * quantity;
            return price;
        }
        else if(itemName=="Veg Combo Meal"){
            price = 200 * quantity;
            return price;
        }
        else if(itemName=="Chicken Combo Meal"){
            price = 240 * quantity;
            return price;
        }
        else if(itemName=="Family Meal Box"){
            price = 400 * quantity;
            return price;
        }
        else{
            System.out.println(itemName + " Not found");
        }

        return price;
    }
}
