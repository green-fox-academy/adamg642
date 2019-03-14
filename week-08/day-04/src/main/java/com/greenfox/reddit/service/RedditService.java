package com.greenfox.reddit.service;

import com.greenfox.reddit.model.RedditPost;
import com.greenfox.reddit.repository.RepositoryJPAReddit;
import com.greenfox.reddit.repository.RepositoryReddit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RedditService {
    private RepositoryReddit repositoryReddit;
    private RepositoryJPAReddit repositoryJPAReddit;

    @Autowired
   public RedditService (RepositoryReddit repositoryReddit , RepositoryJPAReddit repositoryJPAReddit) {
       this.repositoryReddit = repositoryReddit;
       this.repositoryJPAReddit = repositoryJPAReddit;
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

    public void upVote (RedditPost redditPost) {
        redditPost.setLikeNum(redditPost.getLikeNum()+1);
        repositoryReddit.save(redditPost);
    }

    public void downVote (RedditPost redditPost) {

        redditPost.setLikeNum(redditPost.getLikeNum()-1);
        repositoryReddit.save(redditPost);
    }

    public RedditPost getRedditPostByIdFromDataBase (Long id) {
        RedditPost redditPost = new RedditPost();
        redditPost.setTitle("Not Find");
        for (int i = 0; i < getRedditPostList().size() ; i++) {
            if (getRedditPostList().get(i).getId().equals(id)) {
                return getRedditPostList().get(i);
            }
        }
        return redditPost;
    }

    public List<RedditPost> getFirstTen () {
       // List<RedditPost> firstTenList
      // return repositoryJPAReddit.findTop5ByOrderByLikeNumDesc();
        return repositoryJPAReddit.myQuery();
    }



}
