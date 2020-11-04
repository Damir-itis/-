

public class CoffeeMachine {
    private int water;
    private int milk;
    ControlPanel fgh;

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water=water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk=milk;
    }

    public CoffeeMachine(int water, int milk) {
        this.water=water;
        this.milk=milk;
    }

    public void Vvod(){
        System.out.println("Hi");

    }
}
