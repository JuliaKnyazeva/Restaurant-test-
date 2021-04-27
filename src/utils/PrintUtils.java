package utils;

public class PrintUtils {

    private final static String LINE = "__________________________________________________________________";
    private final static String MAIN_DISHES_TITLE = "Our Best Main Dishes:";
    public static Object printLine;


    public static class CommonPrintMethod {
        public final static void print(String text) {
            System.out.print(text);
        }

        public final static void println() {
            System.out.println();
        }

        public static void printLine() {
            println();
            System.out.println(LINE);
        }

        public static void printEnter() {
            System.out.println();
        }

    }
    public static class PrintTitles {

        public static void printMenuTitle() {
            CommonPrintMethod.println();
            CommonPrintMethod.println();
            CommonPrintMethod.print("__________________________Take Out Menu_________________________________");
            CommonPrintMethod.println();
            CommonPrintMethod.println();
        }

        public static void printMainDishesTitle() {
            CommonPrintMethod.print(MAIN_DISHES_TITLE);
            CommonPrintMethod.println();
            CommonPrintMethod.println();
        }

        public static void printSidesTitle() {
            CommonPrintMethod.print("Healthy Sides:");
            CommonPrintMethod.println();
            CommonPrintMethod.println();
        }

        public static void printDrinksTitle() {
            CommonPrintMethod.print("Drinks:");
            CommonPrintMethod.println();
            CommonPrintMethod.println();
        }

        public static void printPrice(double price) {
            if(price < 10) {
                CommonPrintMethod.print("$ " + price);
            } else {
                CommonPrintMethod.print("$" + price);
            }
        }

        public static void printOrderTitle() {
            CommonPrintMethod.println();
            CommonPrintMethod.println();
            CommonPrintMethod.print("__________________________Order_________________________________");
            CommonPrintMethod.println();
            CommonPrintMethod.println();
        }
    }

    public static class PrintSpaces {

        static int maxLength = 0;
        private static int maxLengthName(String[] names) {
            for (int i = 0; i < names.length; i ++) {
                if (names[i].length() > maxLength) {
                    maxLength = names[i].length();
                }
            }
            return maxLength;
        }
        public static int spacesAfterName(String[] names, String[] names1, String[] names2, String name) {
            maxLength = maxLengthName(names);
            int maxLength1 = maxLengthName(names1);
            int maxLength2 = maxLengthName(names2);
            if (maxLength < maxLength1) {
                maxLength = maxLength1;
            } else if (maxLength < maxLength2) {
                maxLength = maxLength2;
            }
            int count = maxLength - name.length();
            return count;
        }
        public static void printSpacesAfterName(int spacesCount) {
            for (int i = 0; i <= spacesCount; i ++) {
                CommonPrintMethod.print(" ");
            }
        }

    }










}
