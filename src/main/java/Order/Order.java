package Order;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static java.util.stream.Collectors.toList;


class Order {
    Long id;
    Long ClientId;
    List<Product> products;
}


class Product{
    Long id;
    String name;
    long minAgeClient;
}


class Client {
    Long id;
    Long age;
    List<Order> orders;
}

class OrderServiceImpl{

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final ClientRepository clientRepositiry;

    OrderServiceImpl(OrderRepository orderRepository, ProductRepository productRepository, ClientRepository clientRepositiry) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.clientRepositiry = clientRepositiry;
    }

    //Создает заказ, в заказ включаются только те продукты,
//у которых возраст клиента больше или равен  minAgeClient
    Order buyProduct(List<Long> productIds, Long clientId){

    /*    Client client = clientRepositiry.findById(clientid);
        List<Product> sortedProducts = productIds.stream()
                .filter(p -> p.getMinAgeClient <= client.getAge()).
        toList();

        Order order = new Order();
        order.set(client);
        order.set(sortedProducts);
*/
        return null;
  }
}


@Repository
interface ProductRepository {
}

@Repository
interface ClientRepository {
}

@Repository
interface OrderRepository {
}

