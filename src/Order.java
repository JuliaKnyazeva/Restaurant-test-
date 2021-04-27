import takeout.utils.*;

public class Order {
    private String clientName;
    private int orderNumber;


    private static int staticCount = 1;
    private  int dynamicCount = 0;
    private static int operations = 0;


    public Order(String clientName) {
        this.clientName = clientName;
        this.orderNumber = ++ staticCount;
        dynamicCount ++;
        operations ++;
    }

    public void cancelOrder() {
        dynamicCount --;
       //operations ++;
    }

    public void setStatusActive() {
        if(dynamicCount == 0) {
            dynamicCount++;
        } else if(dynamicCount == 2) {
            dynamicCount --;
        }
        //operations;
    }

    public void setStatusDone() {
        if(dynamicCount == 1) {
            dynamicCount ++;
        }
        //operations ++;
    }



    public void printOder() {
        //operations ++;
        PrintUtils.CommonPrintMethod.printLine();
        PrintUtils.CommonPrintMethod.print("Order# " + orderNumber);
        PrintUtils.CommonPrintMethod.print("          Client name: " + clientName);
        PrintUtils.CommonPrintMethod.print("          Order status " + dynamicCount);
        PrintUtils.CommonPrintMethod.print("         Sum of Operations: " + operations);
        PrintUtils.CommonPrintMethod.printEnter();
        PrintUtils.CommonPrintMethod.printLine();

    }







//    Order(String clientName) {
//        this.clientName = clientName;
//    }
//
//    static int orderID = 1;
//
//
//    public String getClientName() {
//        return clientName;
//    }
//
//    public int getOrderNumber() {
//        return orderNumber;
//    }
//
//    public MainDish getMainDishChoice() {
//        return mainDishChoice;
//    }
//
//    public Side getSideChoice() {
//        return sideChoice;
//    }
//
//    public Drink getDrinkChoice() {
//        return drinkChoice;
//    }
//
//    public double getTips() {
//        return tips;
//    }
//
//    public double getTotalPrice() {
//        return totalPrice;
//    }
//
//    public void setClientName(String clientName) {
//        this.clientName = clientName;
//    }
//
//    public void setOrderNumber(int orderNumber) {
//        this.orderNumber = orderNumber;
//    }
//
//    public void setMainDishChoice(MainDish mainDishChoice) {
//        this.mainDishChoice = mainDishChoice;
//    }
//
//    public void setSideChoice(Side sideChoice) {
//        this.sideChoice = sideChoice;
//    }
//
//    public void setDrinkChoice(Drink drinkChoice) {
//        this.drinkChoice = drinkChoice;
//    }
//
//    public void setTips(double tips) {
//        this.tips = tips;
//    }
//
//    public void setTotalPrice(double totalPrice) {
//        this.totalPrice = totalPrice;
//    }
}
