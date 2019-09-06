package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@Controller
class TestController {

    @GetMapping("/test")
    public StreamingResponseBody test() {
        return stream -> {
            // Must write more than 16K to reproduce this problem
            for (int i = 0; i < 17*1024; i++) {
                stream.write('X');
            }
        };
    }
}
