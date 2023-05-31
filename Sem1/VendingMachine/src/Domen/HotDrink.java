package Domen;

// создаем наследник HotDrink
public class HotDrink extends Product {
    // дополнительное поле класса
    private int temperature;

    // конструктор класса HotDrink
    public HotDrink(int productId, String productName, String productCategory, double price, int temperature) throws Exception {
        super(productId, productName, productCategory, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    // переопределяем метод toString() для класса HotDrink
    public String toString() {
        return "Product{" +
            "name='" + super.getProductName() + '\'' +
            "category='" + super.getProductCategory() + '\'' +
            ", cost=" + super.getPrice() +
            ", temperature=" + temperature +
            '}';
    }
}
