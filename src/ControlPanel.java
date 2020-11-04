public class ControlPanel {
    public static void main(String[] args) {
        CoffeeMachine TMT = new CoffeeMachine();
        CoffeeMachine MOM = new CoffeeMachine();
        TMT.Vvod();
        TMT.setWater(1000);
        TMT.setMilk(200);
    }
}
