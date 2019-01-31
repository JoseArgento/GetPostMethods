package ArgentoJoseControllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController 
{
    @GetMapping("/greetings/{hello}")
    @ResponseBody
    public String hello(@RequestParam(value="name")String name,@RequestParam(value="company")String company)
    {
        return "Hello "+name+"!"+"\n"+"Welcome to "+company+".";
    }
    
    @PostMapping("/post")
    @ResponseBody
    public String post(@RequestBody String body)
    {
        return body;
    }
}
