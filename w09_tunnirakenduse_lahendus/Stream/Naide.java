import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum OrderType {
    ONLINE,
    TELEFON
}

class Order {

    private String customerName;
    private OrderType orderType;
    private float amount;

    Order(OrderType _orderType, float _amount, String _customerName) {
        this.orderType = _orderType;
        this.amount = _amount;
        this.customerName = _customerName;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public float getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    static void printOrders(List <Order> orderList) {
        orderList.forEach(e -> {
        System.out.println("Kliendi nimi: " + e.getCustomerName() + ", Tellimuse tüüp: " + e .getOrderType() + ", Kogus: " + e.getAmount());
        });
    }
}

public class Naide {

    public static void main(String[] args) {
        Order[] orderArray = {
            new Order(OrderType.TELEFON, 20, "Jaanika"),
            new Order(OrderType.ONLINE, 250, "Ilona"),
            new Order(OrderType.TELEFON, 5, "Peeter"),
            new Order(OrderType.ONLINE, 15, "Sander"),
            new Order(OrderType.ONLINE, 10, "Gabriel")
        };

        List <Order> orderList = Arrays.asList(orderArray);
        System.out.println("Tellimused ");
        Order.printOrders(orderList);
        List <Order> offlineList = orderList.stream()
            .filter(item -> item.getOrderType().equals(OrderType.TELEFON))
            .collect(Collectors.toList());

        System.out.println("");
        System.out.println("Offline tellimus");
        Order.printOrders(offlineList);
        List < Order > orderAmount = orderList.stream()
            .filter(item -> item.getAmount() < 12)
            .collect(Collectors.toList());

        System.out.println("");
        System.out.println("Vähem kui 12 tellimust");
        Order.printOrders(orderAmount);
        System.out.println("");
    }
}