package com.luoli.controller;

import com.luoli.pojo.User;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController////@Controller+@ResponseBody=@RestController
@RequestMapping("users")
public class UserControllerByRest3 {
    @PostMapping
    public String save() {
        System.out.println("user save ...");
        return "{'module' :'user save' }";

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("user delete ..." + id);
        return "{'module' :'user delete' }";

    }

    @PutMapping
    public String update(@RequestBody User user) {
        System.out.println("user update ..." + user);
        return "{'module' :'user update' }";

    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("user getById ..." + id);
        return "{'module' :'user getById' }";

    }

    @GetMapping
    public String getAll() {
        System.out.println("user getAll ...");
        return "{'module' :'user getAll' }";

    }
}

