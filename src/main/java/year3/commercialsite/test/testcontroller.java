package year3.commercialsite.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/test")
public class testcontroller {

    private final testservice testservice;

    @Autowired
    public testcontroller(year3.commercialsite.test.testservice testservice) {
        this.testservice = testservice;
    }

    @GetMapping
    public test getHello(){
        return testservice.getHello();
    }
}
