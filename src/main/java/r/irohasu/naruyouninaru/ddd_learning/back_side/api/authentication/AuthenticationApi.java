package r.irohasu.naruyouninaru.ddd_learning.back_side.api.authentication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import r.irohasu.naruyouninaru.ddd_learning.back_side.service.AuthenticationService;

@Controller
public class AuthenticationApi {
    @Autowired
    AuthenticationService authenticationService;

    public final String URI = "/authentication";

    private static final Logger logger = LoggerFactory.getLogger(AuthenticationApi.class);

    @RequestMapping(value = URI, method = RequestMethod.POST)
    public String invoke(AuthenticationRequest request, Model model) {

        logger.info("メールアドレスとパスワードで認証をしました。");

        model.addAttribute("message",authenticationService.check(request.create()).getValue());
        return "login";
    }
}
