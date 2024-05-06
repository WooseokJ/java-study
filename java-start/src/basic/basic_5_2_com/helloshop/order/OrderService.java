package basic.basic_5_2_com.helloshop.order;

import basic.basic_5_2_com.helloshop.product.Product;
import basic.basic_5_2_com.helloshop.user.User;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product); // 회원이 상품을 주문하는구나.
    }
}
