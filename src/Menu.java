import static takeout.utils.PrintUtils.*;
import static takeout.utils.PrintUtils.CommonPrintMethod.*;
import static takeout.utils.PrintUtils.CommonPrintMethod.print;
import static takeout.utils.PrintUtils.CommonPrintMethod.printLine;
import static takeout.utils.PrintUtils.CommonPrintMethod.println;
import static takeout.utils.PrintUtils.PrintSpaces.printSpacesAfterName;
import static takeout.utils.PrintUtils.PrintSpaces.spacesAfterName;
import static takeout.utils.PrintUtils.PrintTitles.*;
import static takeout.utils.PrintUtils.PrintTitles.printDrinksTitle;
import static takeout.utils.PrintUtils.PrintTitles.printMainDishesTitle;
import static takeout.utils.PrintUtils.PrintTitles.printMenuTitle;
import static takeout.utils.PrintUtils.PrintTitles.printPrice;
import static takeout.utils.PrintUtils.PrintTitles.printSidesTitle;


public class Menu {

    final MainDish beef = new MainDish("Beef Wellington", 13.00);
    final MainDish fish = new MainDish("Miso Salmon", 12.00);
    final MainDish chicken = new MainDish("Chiken Teriaki", 7.00);
    final MainDish pork = new MainDish("Honey Garlic Pork Chops", 10.00);

    Side rice = new Side("Brown Rice", 2.99);
    Side asparagus = new Side("Oven-Roasted Asparagus", 4.50);
    Side beans = new Side("Green Beans Amandine", 5.00);
    Side potato = new Side("Creamy Mashed Potatos", 4.00);

    takeout.Drink water = new takeout.Drink("Perrier carbonated mineral water", 3.50);
    takeout.Drink wineWhite = new takeout.Drink("Oaked Chardonay", 20.50);
    takeout.Drink wineRed = new takeout.Drink("Chateau Corton Grancey Grand Cru", 40.00);
    takeout.Drink juiceApple = new takeout.Drink("Fresh squeezed Apple juice", 10.00);


    MainDish[] mainDishes = new MainDish[]{beef, fish, chicken, pork};
    Side[] sides = new Side[]{rice, asparagus, beans, potato};
    takeout.Drink[] drinks = new takeout.Drink[]{water, wineWhite, wineRed, juiceApple};

    public MainDish getBeef() {
        return beef;
    }



    public String[] getMainDishesNames() {
        String[] mainDishesNames = new String[mainDishes.length];
        for(int i = 0; i < mainDishes.length; i++) {
            mainDishesNames[i] = mainDishes[i].getMainDishName();
        }
        return mainDishesNames;
    }

    public double[] getMainDishesPrices() {
        double[] mainDishesPrices = new double[mainDishes.length];
        for(int i = 0; i < mainDishes.length; i++) {
            mainDishesPrices[i] = mainDishes[i].getMainDishPrice();
        }
        return mainDishesPrices;
    }

    public String[] getSidesNames() {
        String[] sidesNames = new String[sides.length];
        for(int i = 0; i < sidesNames.length; i++) {
            sidesNames[i] = sides[i].getSideName();
        }
        return sidesNames;
    }

    public double[] getSidesPrices() {
        double[] sidesPrices = new double[sides.length];
        for(int i = 0; i < sides.length; i++) {
            sidesPrices[i] = sides[i].getSidePrice();
        }
        return sidesPrices;
    }

    public String[] getDrinksNames() {
        String[] drinksnames = new String[drinks.length];
        for(int i = 0; i < drinks.length; i++) {
            drinksnames[i] = drinks[i].getDrinkName();

        }
        return drinksnames;
    }

    public double[] getDrinksPrices() {
        double[] drinksPrices = new double[drinks.length];
        for(int i =0; i < drinks.length; i ++) {
            drinksPrices[i] = drinks[i].getDrinkPrice();
        }
        return drinksPrices;
    }

    String[] mainDishesNames = getMainDishesNames();
    double[] mainDishesPrices = getMainDishesPrices();

    private void printMainDishes() {
        printMainDishesTitle();
        for(int i = 0; i < mainDishesNames.length; i++) {
            print(mainDishesNames[i]);
            printSpacesAfterName(spacesAfterName(mainDishesNames, getSidesNames(), getDrinksNames(),
                    mainDishesNames[i]));
            printPrice(mainDishesPrices[i]);
            println();
        }
        println();
    }

    private void printSides() {
        printSidesTitle();
        for(int i = 0; i < getSidesNames().length; i++) {
            print(getSidesNames()[i]);
            printSpacesAfterName(spacesAfterName(mainDishesNames, getSidesNames(), getDrinksNames(),
                    getSidesNames()[i]));
            printPrice(getSidesPrices()[i]);
            println();
        }
        println();
    }

    private void printDrinks() {
        printDrinksTitle();
        for(int i = 0; i < getDrinksNames().length; i++) {
            print(getDrinksNames()[i]);
            printSpacesAfterName(spacesAfterName(mainDishesNames, getSidesNames(), getDrinksNames(),
                    getDrinksNames()[i]));
            printPrice(getDrinksPrices()[i]);
            println();
        }
        println();
    }


        public void printMenu() {
        printMenuTitle();
        printMainDishes();
        printSides();
        printDrinks();
        println();
        printLine();
    }



}
