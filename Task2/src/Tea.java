public class Tea extends Beverages{
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
    void addExtras(){
        System.out.println("Adding honey to the tea");
    }
}
