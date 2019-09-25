package com.ics.one.mock;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestingRest implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public TestingRest(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {

        Attachment newAttachment = new Attachment(23L,6L);
        newAttachment = feignRestClient.createAttachment(newAttachment);
        System.out.println("Successful" + newAttachment);
        //id=23
    }
}
