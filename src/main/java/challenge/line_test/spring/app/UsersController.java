package challenge.line_test.spring.app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.Map;

@Controller
public class UsersController {
    private static final String TOTAL_ITEMS_BOUGHT_FIELD = "totalItemsBought";

    @Autowired
    private UsersService usersService;

    @GetMapping("/users/{username}/items/total")
    @ResponseBody
    public Map<String, Integer> totalItemsBought(@PathVariable(name = "username") String username) {
        System.out.println("REQUEST USERNAME: " + username);
        int totalItemsBought = usersService.getNumberOfItemsBought(username);

        return Collections.singletonMap(TOTAL_ITEMS_BOUGHT_FIELD, totalItemsBought);
    }
}