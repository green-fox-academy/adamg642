package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.RedditPost;
import com.greenfox.reddit.repository.RepositoryReddit;
import com.greenfox.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
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

        model.addAttribute("redditPostList",redditService.getRedditPostList());

        return "mainredditpage";
    }

    @RequestMapping("/createpost")
    public String getCreatePost() {
        return "createpost";
    }


    @PostMapping("/createpost")
    public String postCreatePost(@RequestParam(name = "title") String title,
                                 @RequestParam(name = "url") String url) {
        RedditPost redditPost = new RedditPost();
        redditPost.setUrl(url);
        redditPost.setTitle(title);

        redditService.addToDataBase(redditPost);
        return "redirect:createpost";
    }
}
