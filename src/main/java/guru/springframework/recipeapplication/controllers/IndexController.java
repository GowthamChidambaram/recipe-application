package guru.springframework.recipeapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gowtham C on 23/05/21.
 */
@Controller
public class IndexController {

  @RequestMapping({"","/","/index"})
  public String getIndexPage(){
    return "index";
  }
}
