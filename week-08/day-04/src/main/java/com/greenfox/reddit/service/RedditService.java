package com.greenfox.reddit.service;

import com.greenfox.reddit.model.RedditPost;
import com.greenfox.reddit.repository.RepositoryReddit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RedditService {
    private RepositoryReddit repositoryReddit;

    @Autowired
   public RedditService (RepositoryReddit repositoryReddit) {
       this.repositoryReddit = repositoryReddit;
   }

    public void addToDataBase(RedditPost redditPost) {
        repositoryReddit.save(redditPost);

    }

    public List<RedditPost> getRedditPostList() {
        List<RedditPost> redditPostList = new ArrayList<>();
        repositoryReddit.findAll()
                .forEach(redditPost -> redditPostList.add(redditPost));
        return redditPostList;
    }
}
