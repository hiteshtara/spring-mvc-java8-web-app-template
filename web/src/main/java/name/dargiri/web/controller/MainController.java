package name.dargiri.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dionis on 05/05/14.
 */
@Controller
@RequestMapping("")
public class MainController {
    @RequestMapping("")
    public String home() {
        return "redirect:/people";
    }
}
