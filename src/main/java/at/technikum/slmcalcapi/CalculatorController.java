package at.technikum.slmcalcapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorController {

    /**
     * Add two integers.
     *
     * @param a first integer
     * @param b second integer
     * @return
     */



    @RequestMapping
    public int sum (
            @RequestParam int a,
            @RequestParam int b){
        return a+b;
    }
}
