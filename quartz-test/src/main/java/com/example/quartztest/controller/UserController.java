package com.example.quartztest.controller;


import com.example.quartztest.dao.SportRepository;
import com.example.quartztest.dao.UserRepository;
import com.example.quartztest.entity.Sport;
import com.example.quartztest.entity.User;
import com.example.quartztest.task.Jobs;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserRepository userRepository;
    @Resource
    private SportRepository sportRepository;

    private User user = new User();
    private Sport sport = new Sport();
    private Jobs jobs = new Jobs();


    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpSession session) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user = userRepository.findByAccountAndPassword(username, password);
        sport = sportRepository.findSportByAccount(username);
        String str = "";
        if (user != null) {
            session.setAttribute("userLogin", user);
            session.setAttribute("steps", sport);
            session.setAttribute("ranking", jobs.rank());
            str = "home";
        } else {
            str = "index";
        }
        return str;
    }

}
