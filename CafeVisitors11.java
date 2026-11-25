public class CafeVisitors11 {
    static void listVisitors(String... visitorNames) {
        System.out.println("Visitor Name List");
        for (int i = 0; i < visitorNames.length; i++) {
            System.out.println("- " + visitorNames[i]);
        }
    }

    public static void main(String[] args) {
        listVisitors("Ali", "Budi", "Citra");
        listVisitors("Andi");
        listVisitors("Doni", "Eti", "Fahmi", "Galih");
    }
}
