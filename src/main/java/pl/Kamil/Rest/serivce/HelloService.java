package pl.Kamil.Rest.serivce;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String helloFromService(){
        return "Witam, ale to jest z Service w przypadku samego localhost:8080";
    }
}

// jest to service poczatkowy moze on byc bardziej rozbudowany
