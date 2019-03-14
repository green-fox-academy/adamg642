package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.RedditPost;
import com.greenfox.reddit.repository.RepositoryReddit;
import com.greenfox.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerReddit {

    private RedditService redditService;

    @Autowired
    public ControllerReddit (RedditService redditService) {
        this.redditService = redditService;
    }


    @RequestMapping("/")
    public String getMainPage (Model model) {
        RedditPost redditPost = new RedditPost();
        redditPost.setUrl("Tester");
        redditService.addToDataBase(redditPost);
        model.addAttribute("redditPostList",redditService.getRedditPostList());

        return "mainredditpage";
    }
}
