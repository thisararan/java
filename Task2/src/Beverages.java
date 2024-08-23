public abstract class Beverages {
    private boolean wantsExtras = false;

    public void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras){
            addExtras();
        }
    }

    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }
    abstract void brew();
    abstract void addCondiments();
    abstract void addExtras();

    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
