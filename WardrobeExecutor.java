class WardrobeExecutor {

    public static void main(String[] args) {

        System.out.println("Main Started");

        System.out.println("Material: " + Wardrobe.getMaterial());
        System.out.println("Doors: " + Wardrobe.getDoorCount());
        System.out.println("Color: " + Wardrobe.getColor());
        System.out.println("Has Mirror: " + Wardrobe.hasMirror());
        System.out.println("Price: " + Wardrobe.getPrice());

        System.out.println("Main Ended");
    }
}