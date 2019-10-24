import javax.swing.*;

public class Application {

    public static void main(String[] args) {

        CashDesk cashDesk = new CashDesk();
        Collection collection = new Collection();
        Kitchen kitchen = new Kitchen();

        Manager manager = new Manager(cashDesk, kitchen, collection);

        kitchen.setManager(manager);
        collection.setManager(manager);
        cashDesk.setManager(manager);

        System.out.println("Nasze MENU");
        for (Menu menuPosition : Menu.values()) {
            System.out.println(menuPosition);
        }

        while (true) {
            System.out.println();
            String inputMessage = JOptionPane.showInputDialog("Co podać?");
            System.out.println("Twoje zamówienie to: " + inputMessage);

            try {
                Menu ordersAtTheCashDesk = Menu.valueOf(inputMessage);
                System.out.print("Razem: " + ordersAtTheCashDesk.getPrice() + " zł ");
                System.out.println("Oczekiwany czas wynosi: " + ordersAtTheCashDesk.getPreparationDurationMillis() + " min.");
            } catch (IllegalArgumentException e) {
                System.out.println("Takiego dania, nie ma w naszym MENU, proszę zamówić coś innego");
            }

        }
    }
}