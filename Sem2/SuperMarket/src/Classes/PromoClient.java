package Classes;

// класс акционного клиента

public class PromoClient {
    private String promoName;
    private static int promoClientNum;

    public PromoClient(String promoName) {
        this.promoName = promoName;
        this.promoClientNum = promoClientNum + 1;
    }

    public String getPromoName() {
        return promoName;
    }

    public static int getPromoClientNum() {
        return promoClientNum;
    }
}

// использование класса
PromoClient client1 = new PromoClient("Первая акция");
PromoClient client2 = new PromoClient("Вторая акция");

System.out.println(client1.getPromoName());
System.out.println(PromoClient.getPromoClientNum());