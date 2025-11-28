package kr.soft.git;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class MemberController {

    @RestController
    public static class MemberControllerResource {

    }

    @GetMapping("/Aa")
    public String aa() {
        return "aa";
    }
}
