package kr.soft.git;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
public class MemberController {

    @RestController
    public static class MemberControllerResource {

        @GetMapping("/rmadydlf")
        public void rmadydlf() {
            log.info("rmadydlfdlsepdyd");
        }
    }
}
