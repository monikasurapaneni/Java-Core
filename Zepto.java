class Zepto{
public static double search(String itemName){
double price=0.0;
if( itemName == "Lays"){
price =20;
return price;
}
else if( itemName =="Sandwich Icecream"){
price =50;
return price;
}
else if( itemName == "Moisturiser"){
price = 100;
return price;
}
else if( itemName =="Icecream Cake"){
price =150;
return price;
}
else if( itemName =="Ramen"){
price = 110;
return price;
}else if( itemName ==" Body Wash"){
price =200;
return price;
}else if( itemName =="Hide and Seek"){
price = 30;
return price;
}else if( itemName =="Burger"){
price = 30;
return price;
}else if( itemName =="Amul Badam Shake"){
price = 30;
return price;
}else if( itemName =="Buttor Scotch Ice Cream"){
price = 30;
return price;
}else if(itemName == "Maggi"){
    price = 20;
    return price;
}
else if(itemName == "Dairy Milk"){
    price = 40;
    return price;
}
else if(itemName == "KitKat"){
    price = 25;
    return price;
}
else if(itemName == "Oreo"){
    price = 35;
    return price;
}
else if(itemName == "Good Day Biscuits"){
    price = 30;
    return price;
}else if(itemName == "Parle G"){
    price = 10;
    return price;
}
else if(itemName == "Tata Tea"){
    price = 120;
    return price;
}
else if(itemName == "Bru Coffee"){
    price = 150;
    return price;
}
else if(itemName == "Bournvita"){
    price = 200;
    return price;
}
else if(itemName == "Horlicks"){
    price = 220;
    return price;
}
else if(itemName == "Sprite"){
    price = 40;
    return price;
}
else if(itemName == "Coca Cola"){
    price = 40;
    return price;
}
else if(itemName == "Pepsi"){
    price = 40;
    return price;
}
else if(itemName == "Fanta"){
    price = 40;
    return price;
}
else if(itemName == "Thumbs Up"){
    price = 40;
    return price;
}
else if(itemName == "Milk"){
    price = 60;
    return price;
}
else if(itemName == "Curd"){
    price = 50;
    return price;
}
else if(itemName == "Paneer"){
    price = 120;
    return price;
}
else if(itemName == "Butter"){
    price = 55;
    return price;
}
else if(itemName == "Cheese"){
    price = 90;
    return price;
}
else if(itemName == "Eggs"){
    price = 70;
    return price;
}
else if(itemName == "Bread"){
    price = 30;
    return price;
}
else if(itemName == "Brown Bread"){
    price = 35;
    return price;
}
else if(itemName == "Pizza"){
    price = 200;
    return price;
}
else if(itemName == "Pasta"){
    price = 150;
    return price;
}
else if(itemName == "French Fries"){
    price = 80;
    return price;
}
else if(itemName == "Samosa"){
    price = 20;
    return price;
}
else if(itemName == "Vada Pav"){
    price = 25;
    return price;
}
else if(itemName == "Pani Puri"){
    price = 30;
    return price;
}
else if(itemName == "Dosa"){
    price = 50;
    return price;
}
else if(itemName == "Idli"){
    price = 40;
    return price;
}
else if(itemName == "Upma"){
    price = 35;
    return price;
}
else if(itemName == "Poha"){
    price = 30;
    return price;
}
else if(itemName == "Fried Rice"){
    price = 120;
    return price;
}
else if(itemName == "Noodles"){
    price = 100;
    return price;
}
else if(itemName == "Chicken Curry"){
    price = 180;
    return price;
}
else if(itemName == "Mutton Curry"){
    price = 250;
    return price;
}
else if(itemName == "Fish Fry"){
    price = 200;
    return price;
}
else if(itemName == "Biryani"){
    price = 220;
    return price;
}
else if(itemName == "Veg Meals"){
    price = 120;
    return price;
}
else if(itemName == "Non Veg Meals"){
    price = 180;
    return price;
}
else if(itemName == "Ice Tea"){
    price = 60;
    return price;
}
else if(itemName == "Cold Coffee"){
    price = 90;
    return price;
}
else if(itemName == "Milkshake"){
    price = 100;
    return price;
}
else if(itemName == "Strawberry Ice Cream"){
    price = 80;
    return price;
}
else if(itemName == "Vanilla Ice Cream"){
    price = 70;
    return price;
}
else if(itemName == "Chocolate Ice Cream"){
    price = 90;
    return price;
}else{
	System.out.println(itemName +" Not found");
}
return price;
}
public static double search(String itemName, int quantity){
double price=0.0;

if( itemName == "Apple"){
price =20*quantity;
return price;
}else if(itemName == "Banana"){
 price = 10 * quantity;
 return price;
}else if(itemName == "Orange"){
    price = 60 * quantity;
    return price;
}
else if(itemName == "Grapes"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Watermelon"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Pineapple"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Mango"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Papaya"){
    price = 70 * quantity;
    return price;
}
else if(itemName == "Guava"){
    price = 50 * quantity;
    return price;
}
else if(itemName == "Kiwi"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Dragon Fruit"){
    price = 200 * quantity;
    return price;
}
else if(itemName == "Pomegranate"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Carrot"){
    price = 40 * quantity;
    return price;
}
else if(itemName == "Potato"){
    price = 30 * quantity;
    return price;
}
else if(itemName == "Tomato"){
    price = 35 * quantity;
    return price;
}
else if(itemName == "Onion"){
    price = 45 * quantity;
    return price;
}
else if(itemName == "Cabbage"){
    price = 30 * quantity;
    return price;
}
else if(itemName == "Cauliflower"){
    price = 50 * quantity;
    return price;
}
else if(itemName == "Spinach"){
    price = 25 * quantity;
    return price;
}
else if(itemName == "Broccoli"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Capsicum"){
    price = 60 * quantity;
    return price;
}
else if(itemName == "Cucumber"){
    price = 30 * quantity;
    return price;
}
else if(itemName == "Beetroot"){
    price = 40 * quantity;
    return price;
}
else if(itemName == "Radish"){
    price = 30 * quantity;
    return price;
}
else if(itemName == "Green Peas"){
    price = 80 * quantity;
    return price;
}
else if(itemName == "Sweet Corn"){
    price = 60 * quantity;
    return price;
}
else if(itemName == "Chips"){
    price = 20 * quantity;
    return price;
}
else if(itemName == "Nachos"){
    price = 70 * quantity;
    return price;
}
else if(itemName == "Popcorn"){
    price = 50 * quantity;
    return price;
}
else if(itemName == "Cup Noodles"){
    price = 40 * quantity;
    return price;
}
else if(itemName == "Energy Drink"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Protein Bar"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Granola"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Cornflakes"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Oats"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Rice"){
    price = 60 * quantity;
    return price;
}
else if(itemName == "Wheat Flour"){
    price = 50 * quantity;
    return price;
}
else if(itemName == "Sugar"){
    price = 45 * quantity;
    return price;
}
else if(itemName == "Salt"){
    price = 20 * quantity;
    return price;
}
else if(itemName == "Cooking Oil"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Ghee"){
    price = 250 * quantity;
    return price;
}
else if(itemName == "Honey"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Jam"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Peanut Butter"){
    price = 200 * quantity;
    return price;
}
else if(itemName == "Pickle"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Chutney"){
    price = 80 * quantity;
    return price;
}
else if(itemName == "Soup Packet"){
    price = 30 * quantity;
    return price;
}
else if(itemName == "Ready Mix"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Cake"){
    price = 250 * quantity;
    return price;
}
else if(itemName == "Pastry"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Donut"){
    price = 70 * quantity;
    return price;
}
else if(itemName == "Waffle"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Pancake"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Sandwich"){
    price = 80 * quantity;
    return price;
}
else if(itemName == "Hot Dog"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Taco"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Burrito"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Spring Roll"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Manchurian"){
    price = 120 * quantity;
    return price;
}else{
	System.out.println(itemName + "Not found");
    }
return price;
}
}
