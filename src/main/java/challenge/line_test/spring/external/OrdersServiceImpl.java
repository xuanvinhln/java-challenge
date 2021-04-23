package challenge.line_test.spring.external;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
	@Override
	public List<Item> itemsBought(String username) {
		return new ArrayList<>();
	}
}
