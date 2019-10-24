public enum Menu {

    CLASSIC_BURGER(10000, 25),
    PASI_FRYTKI(5000, 8),
    NACHOSY(6000, 10),
    NAPÓJ(1000, 6);


    private int preparationDurationMillis;
    private int price;


    Menu(int preparationDurationMillis, int price) {
        this.preparationDurationMillis = preparationDurationMillis;
        this.price = price;
    }

    public int getPreparationDurationMillis() {
        return preparationDurationMillis;
    }

    public int getPrice() {
        return price;
    }


}


