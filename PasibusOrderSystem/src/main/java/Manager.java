public class Manager {

    CashDesk cashDesk;
    Kitchen kitchen;
    Collection collection;

    public Manager(CashDesk cashDesk, Kitchen kitchen, Collection collection) {
        this.cashDesk = cashDesk;
        this.kitchen = kitchen;
        this.collection = collection;
    }

    void newOrder(String orderName) {
        Beeper beeper = new Beeper(orderName);
        prepareMeal(beeper);
    }

    private void prepareMeal(Beeper beeper) {
        kitchen.prepareMeal(beeper);
    }

    private void mealReady(Beeper beeper) {

    }

    public void callCustomer(Beeper beeper) {

    }

    public void customerCollectedOrder(Beeper beeper) {

    }
}




