public class Restaurant {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.printMenu();


        String[] names = menu.getMainDishesNames();

        MainDish newBeef = menu.getBeef();



        Order order1 = new Order("AAA");
        Order order2 = new Order("BBB");
        Order order3 = new Order("CCC");
        Order order4 = new Order("DDD");




        order1.setStatusDone();
        order1.printOder();

        order1.setStatusActive();
        order1.printOder();



        order2.printOder();


        order3.cancelOrder();
        order3.printOder();

        order4.printOder();

        order3.setStatusActive();
        order3.printOder();


    }

}
