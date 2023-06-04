package Classes;

public class PromoClient extends Actor {
    
    // название акции
    private String nameAction;
    // макс колво участников акции
    private static int lastManStanding = 2;

    /**
     * 
     * @param name - имя покупателя
     * @param nameAction - имя акции
     */
    public PromoClient(String name, String nameAction){
        super(name);
        lastManStanding--;
        if (lastManStanding <= 0) {
            lastManStanding = 0;
            System.out.printf("Отказ клиенту %s: исчерпан лимит акционных покупателей\n", name);
        }
    }


    public int getAction() {
        return lastManStanding;
    }

    public String getActionName() {
        return nameAction;
    }

    @Override
    public String getName() {
        return super.name;
    }


    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }
}