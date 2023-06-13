package Interfaces;

public interface iReturnOrder {
    private String name;
    private int orderNum;

    public Client(String name, int orderNum) {
        this.name = name;
        this.orderNum = orderNum;
    }

    public String getName() {
        return name;
    }

    public int getOrderNum() {
        return orderNum;
    }

    @Override
    public boolean isReturnable(boolean canBeReturned) {
        return canBeReturned;
    }

    @Override
    public boolean returnOrder(int orderId) {
        // возврат по айди
        return true;
    }

    // Использование нтерфейса в классе клиента
    Client client = new Client("Ivanov", 123456);
    client.isReturnable(true);
    client.returnOrder(123456);
}