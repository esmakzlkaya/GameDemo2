package Concrete;

import Abstract.OrderService;
import Entities.Order;

public class OrderManager implements OrderService{

	public void order(Order order) {
		System.out.println(order.getId()+" numaralý sipariþiniz alýndý");
		
	}

}
