public class CashDesk {

    private Manager manager;

    private void newOrder(String orderName) {
        manager.newOrder(orderName);

    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }


}
