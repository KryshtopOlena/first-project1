package homeworks.homework14.Task2;

public class CoffeeMachine {

    private final String name;

    public void prepare(){
        System.out.println("Замовлення готується...");
    }

    public CoffeeMachine(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Отримайте замовлення ";
    }
}
