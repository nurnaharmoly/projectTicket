package com.moly.controller;

import com.moly.entity.Role;
import com.moly.entity.User;
import com.moly.repo.RoleRepo;
import com.moly.repo.UserRepo;
import com.moly.service.RoleService;
import com.moly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleservice;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "6") int perPage) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title", "Hire Us to Build Your  Future ");

        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String login() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {
            /* The user is logged in :) */
            return "redirect:/";
        }
        return "login";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "/access-denied";
    }

    @RequestMapping(value = "/signup.do", method = RequestMethod.GET)
    public String signup() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {
            /* The user is logged in :) */
            return "redirect:/";
        }
        return "signup";
    }

    @RequestMapping(value = "/forget-password", method = RequestMethod.GET)
    public String forgetPassword() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {
            /* The user is logged in :) */
            return "redirect:/";
        }
        return "forget-password";
    }

    @Autowired
    UserRepo userRepo;



 @RequestMapping(value = "/insert.jsf", method = RequestMethod.GET)
    public void insertdata() {
        Role role = new Role();
        role.setRolename("ADMIN");
        roleservice.save(role);
        User user = new User();
        Set<Role> roles = new HashSet<>();
        Role role2 = roleservice.isAlreadyExist("ADMIN");
        roles.add(role2);
        user.setRoles(roles);
        user.setUserName("admin");
        user.setFirstName("Moly");
        user.setLastName("Akter");
        user.setPassword(passwordEncoder.encode("12345678"));
        user.setEmail("moly.cse@gmail.com");
        user.setMobile("0168000000");
        user.setJoiningDate(new Date());
        user.setActivated(true);
        userService.save(user);

    }

}
