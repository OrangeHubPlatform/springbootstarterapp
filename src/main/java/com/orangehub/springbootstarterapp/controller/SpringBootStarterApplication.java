import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootStarterApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello, world!";
    }
}