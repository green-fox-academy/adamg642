package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.RedditPost;
import com.greenfox.reddit.repository.RepositoryReddit;
import com.greenfox.reddit.service.RedditService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ControllerReddit {

    private RedditService redditService;

    @Autowired
    public ControllerReddit (RedditService redditService) {
        this.redditService = redditService;
    }


    @RequestMapping("/")
    public String getMainPage (Model model) {

        model.addAttribute("redditPostList",redditService.getFirstTen());
        //  model.addAttribute("redditPostList",redditService.getRedditPostList());

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
        System.out.println(redditPost.getPublicationTime());
        redditService.addToDataBase(redditPost);
        return "redirect:createpost";
    }

    @RequestMapping(value = "/plus", method = RequestMethod.GET)
    public String getPlusBut (@RequestParam(name = "id") Long id,Model model) {
        System.out.println(id);

        RedditPost redditPost = redditService.getRedditPostByIdFromDataBase(id);
        redditService.upVote(redditPost);

        model.addAttribute("redditPostList",redditService.getFirstTen());
      //  model.addAttribute("redditPostList",redditService.getRedditPostList());
        return "mainredditpage";
    }

    @RequestMapping(value = "/minus", method = RequestMethod.GET)
    public String getMinusBut (@RequestParam(name = "id") Long id , Model model) {
        System.out.println(id);

        RedditPost redditPost = redditService.getRedditPostByIdFromDataBase(id);
        redditService.downVote(redditPost);
        model.addAttribute("redditPostList",redditService.getFirstTen());
        //  model.addAttribute("redditPostList",redditService.getRedditPostList());
        return "mainredditpage";
    }
}
