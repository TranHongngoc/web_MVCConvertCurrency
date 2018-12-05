package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertCurrency {

//    @RequestMapping("/index")
//    public String index(){
//        return "index";
//    }

    @RequestMapping("/convert")
    public String convertCurrencyXyzkkkkkkkkkk(@RequestParam String usd, @RequestParam String rate, Model model){
        Double usCurrency = Double.parseDouble(usd);
        Double rateCurrency = Double.parseDouble(rate);

        Double vnd = usCurrency* rateCurrency;

        model.addAttribute("vnd", vnd);
//
        return "index";
    }


}
