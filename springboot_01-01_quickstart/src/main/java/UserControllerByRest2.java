import com.luoli.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController////@Controller+@ResponseBody=@RestController
@RequestMapping("users")
public class UserControllerByRest2 {
    @RequestMapping(method = RequestMethod.POST)
    public String save() {
        System.out.println("user save ...");
        return "{'module' :'user save' }";

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id) {
        System.out.println("user delete ..." + id);
        return "{'module' :'user delete' }";

    }

    @RequestMapping(method = RequestMethod.PUT)
    public String update(@RequestBody User user) {
        System.out.println("user update ..." + user);
        return "{'module' :'user update' }";

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable Integer id) {
        System.out.println("user getById ..." + id);
        return "{'module' :'user getById' }";

    }

    @RequestMapping(method = RequestMethod.GET)
    public String getAll() {
        System.out.println("user getAll ...");
        return "{'module' :'user getAll' }";

    }
}

