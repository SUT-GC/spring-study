package third;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SayClass {

    private SuperInterface superInterface;

    @Autowired
    public SayClass(SuperInterface superInterface) {
        this.superInterface = superInterface;
    }

    public void say() {
        System.out.println(superInterface.sayHello());
    }
}
