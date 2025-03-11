package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserService;

import java.util.List;

@Controller
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/users";
    }

    @GetMapping(value = "/users")
    public String usersTable(ModelMap model) {
        List<User> users = userService.allUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @PostMapping(value = "/users/add")
    public String addUser(@RequestParam String name, @RequestParam int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userService.add(user);
        return "redirect:/users";
    }

    @GetMapping(value = "/users/edit/{id}")
    public String editUserForm(@PathVariable long id, ModelMap model) {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "edit-user";
    }

    @PostMapping(value = "/users/edit")
    public String editUser(@RequestParam long id, @RequestParam String name, @RequestParam int age) {
        User user = userService.getById(id);
        user.setName(name);
        user.setAge(age);
        userService.edit(user);
        return "redirect:/users";
    }

    @GetMapping(value = "/users/delete/{id}")
    public String deleteUser(@PathVariable long id) {
        User user = userService.getById(id);
        userService.delete(user);
        return "redirect:/users";
    }
}