package challenge.line_test.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import challenge.line_test.spring.external.OrdersService;

@Service
public class UsersService {
	@Autowired
	@Qualifier("ordersService")
	private OrdersService ordersService;

	public int getNumberOfItemsBought(String username) {
		return ordersService.itemsBought(username).size();
	}
}