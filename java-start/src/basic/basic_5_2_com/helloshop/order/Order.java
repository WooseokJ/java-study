package basic.basic_5_2_com.helloshop.order;

import basic.basic_5_2_com.helloshop.product.Product;
import basic.basic_5_2_com.helloshop.user.User;

public class Order {
    User user; // com.helloshop.user의 User를 사용.
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }

}
