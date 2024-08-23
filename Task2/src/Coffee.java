public class Coffee extends Beverages{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }


    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    void addExtras() {
        System.out.println("Adding vanilla syrup");
    }
}
