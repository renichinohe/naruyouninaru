package r.irohasu.naruyouninaru.homeApi.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginPageGenerateApi {


    public final String URI = "/login";

    @RequestMapping(value = URI, method = RequestMethod.GET)
    public String invoke(Model model) {
        model.addAttribute("message", "ようこそ！");

        return "login";
    }
}
