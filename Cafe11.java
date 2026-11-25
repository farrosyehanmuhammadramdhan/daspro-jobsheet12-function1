public class Cafe11 {
    public static void Menu(String customerName, boolean isMember) {
        System.out.println("Welcome, " + customerName + "!");

        if (isMember) {
            System.out.println("You are a member, enjoy 10% off every purchase");
        }
        System.out.println("===== CAFE RESTAURANT MENU =====");
        System.out.println("1. Black Coffee - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Toast - Rp 10,000");
        System.out.println("6. Fried Noodles - Rp 18,000");
        System.out.println("================================");
        System.out.println("Please choose the menu you would like.");       
    }

    public static void main(String[] args) {
        Menu("Andi", true);
    }
}
