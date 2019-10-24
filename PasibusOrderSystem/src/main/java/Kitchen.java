import java.util.Timer;
import java.util.TimerTask;

public class Kitchen {

    private Manager manager;

    public Kitchen() {
    }

    public void prepareMeal(Beeper beeper) {
        MealPreparation mealPreparation = new MealPreparation(this, beeper);
        Timer timer = new Timer();
        timer.schedule(mealPreparation, 5000);
    }

    public void mealReady(Beeper beeper) {
        System.out.println("Odbiór zamówienia" + beeper.getOrderName());
    }


    public void setManager(Manager manager) {
        this.manager = manager;
    }
}

class MealPreparation extends TimerTask {

    Kitchen kitchen;
    Beeper beeper;

    public MealPreparation(Kitchen kitchen, Beeper beeper) {
        this.kitchen = kitchen;
        this.beeper = beeper;
    }

    @Override
    public void run() {

    }
}
