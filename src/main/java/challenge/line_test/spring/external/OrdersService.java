package challenge.line_test.spring.external;

import java.util.List;

public interface OrdersService {
	List<Item> itemsBought(String username);
}
