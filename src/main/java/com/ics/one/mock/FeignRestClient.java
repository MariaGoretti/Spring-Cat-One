package com.ics.one.mock;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="client", url="http://10.51.10.111:2000", configuration = FeignConfiguration.class)
public interface FeignRestClient {
    ///

    @RequestMapping(method = RequestMethod.POST, value = "companies/{companyId}/attachments")
    Attachment createAttachment(@RequestParam Attachment attachment, @PathVariable Long companyId);

    @RequestMapping(method = RequestMethod.POST, value = "companies/{companyId}/attachments")
    Company requestAttachment(@PathVariable String companyId, @RequestParam(name = "studentId") Long studentId);

    Attachment requestAttachment(@PathVariable int companyId, @RequestParam(name = "studentId") Integer studentId);

}
