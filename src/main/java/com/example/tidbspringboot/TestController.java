package com.example.tidbspringboot;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestRepository testRepository;

    @GetMapping("/test")
    public void test() {
        for (int i = 0; i < 1_000_000; i++) {
            Test t = new Test();
            t.setName("tu hu con " + i);
            t.setAge(i);
            testRepository.save(t);
        }
    }
}
