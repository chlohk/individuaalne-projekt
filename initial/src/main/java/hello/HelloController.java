package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/api")
    public Map<String, String> h() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "Christer");
        return map;
    }
}
