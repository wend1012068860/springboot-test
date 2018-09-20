package com.example.quickstart.controller;

import com.example.quickstart.dao.TitleDAO;
import com.example.quickstart.entity.Avatar;
import com.example.quickstart.entity.Hot;
import com.example.quickstart.entity.Title;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TitleController {
    @Resource
    private TitleDAO titleDAO;

    @GetMapping("title")
    public String getAll(ModelMap map){
        List<Title> titleList = titleDAO.getTitle();
        List<Hot> hotList = titleDAO.getHot();
        Avatar avatar = titleDAO.getAvatar();
        map.addAttribute("titleList",titleList);
        map.addAttribute("hotList",hotList);
        map.addAttribute("avatar",avatar);
        return "title";
    }
}
