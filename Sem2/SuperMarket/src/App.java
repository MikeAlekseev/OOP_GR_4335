import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviour;


public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Dasha");
        iActorBehaviour client3 = new SpecialClient("Prezident", 1);
        iActorBehaviour client4 = new PromoClient("Ivan", "Action1");
        iActorBehaviour client5 = new PromoClient("Artur", "Action2");
        iActorBehaviour client6 = new PromoClient("Femida", "Action3");

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);
        market.acceptToMarket(client5);
        market.acceptToMarket(client6);
        
        market.update();
    }
}