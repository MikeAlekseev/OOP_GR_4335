package Domen;
// public class Product {
//     private String name;
//     private double price;
//     private int count;

//     // конструктор классса Product
//     public Product(String name, double price, int count) {
//         this.name = name;
//         this.price = price;
//         this.count = count;
//     }

//     // геттеры/сеттеры
//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public void setPrice(double price) {
//         this.price = price;
//     }

//     public int getCount() {
//         return count;
//     }

//     public void setCount(int count) {
//         this.count = count;
//     }

//     // метод вывода инфы о товаре
//     public String toString() {
//         return "Product{" +
//                 "name='" + name + '\'' +
//                 ", price=" + price +
//                 ", count=" + count +
//                 '}';
//     }
// }

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

// создаем класс клиент для тестирования
// public class Main {
//     public static void main(String[] args) {
//         //создаем объекты класса HotDrink + добалвем в автомат
//         HotDrink coffee = new HotDrink("Coffee", 2.50, 10, 80);
//         HotDrink tea = new HotDrink("Tea", 1.50, 15, 70);
//         HotDrink hotChocolate = new HotDrink("Hot Chocolate", 3.00, 8, 85);
        
//         // выводим инфу о товараха
//         System.out.println(coffee.toString());
//         System.out.println(tea.toString());
//         System.out.println(hotChocolate.toString());
//     }
// }