package information;

/**
 * Created by adhirajchakraborty on 2/9/2017.
 */

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet() {
        return "Hello World";
    }
}