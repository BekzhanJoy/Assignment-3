public class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent mainMenu = new Menu("Main Menu", "Top level menu");

        MenuComponent breakfastMenu = new Menu("Breakfast", "Morning meals");
        MenuComponent lunchMenu = new Menu("Lunch", "Afternoon meals");

        mainMenu.add(breakfastMenu);
        mainMenu.add(lunchMenu);

        breakfastMenu.add(new MenuItem("Pancakes", "Fluffy pancakes", 5.99));
        breakfastMenu.add(new MenuItem("Coffee", "Freshly brewed", 2.99));

        lunchMenu.add(new MenuItem("Burger", "Beef burger with fries", 9.99));
        lunchMenu.add(new MenuItem("Salad", "Caesar salad", 6.99));

        mainMenu.print();
    }
}
