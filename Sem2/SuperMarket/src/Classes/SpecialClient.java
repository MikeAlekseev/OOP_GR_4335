package Classes;

public class SpecialClient extends Actor{
    private int id;
    public SpecialClient(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }
    public void setMakeOrder(boolean makeOrder){
        super.isMakeOrder = isTakeOrder;
    }

    @Override
    public String getName() {
        return null;
    }
}