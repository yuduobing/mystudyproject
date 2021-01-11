package yun520.mapperplus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControl {


    @RequestMapping("/a")
    public  String test(){
        return  "As";
    }

}
