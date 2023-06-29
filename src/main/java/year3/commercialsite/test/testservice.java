package year3.commercialsite.test;
import org.springframework.stereotype.Service;

@Service
public class testservice {
    public test getHello() {
        return new test("001","test001");
    }
}
