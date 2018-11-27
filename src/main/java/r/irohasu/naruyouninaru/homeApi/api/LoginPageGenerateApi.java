package r.irohasu.naruyouninaru.authenticationApi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import r.irohasu.naruyouninaru.authenticationApi.service.AuthenticationService;

@Controller
public class AuthenticationApi {
    @Autowired
    AuthenticationService authenticationService;

    public final String URI = "/authentication";

    @RequestMapping(value = URI, method = RequestMethod.GET)
    public String invoke(AuthenticationRequest request, Model model) {
//        model.addAttribute("message", "Hello Thymeleaf!!");
//        return authenticationService.check(request.create()).getValue();

        model.addAttribute("message",authenticationService.check(request.create()).getValue());

        return "login";
    }
}
