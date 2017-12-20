package test.practise.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.practise.org.service.TestService;
import test.practise.org.vo.OrganizationVO;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/api/v0/vo/{id}")
    public String organizationVO(@PathVariable String id) {
        testService.organizationIsCarrier(id);
        return null;
    }
}
