package com.greenfox.reddit.repository;

import com.greenfox.reddit.model.RedditPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositoryJPAReddit extends JpaRepository<RedditPost,Long> {
    List<RedditPost> findTop5ByOrderByLikeNumDesc();
    //TODO: create method

    @Query(value = "SELECT * FROM reddit_post ORDER BY like_num  DESC LIMIT 2  OFFSET 2",
            nativeQuery = true)
    List<RedditPost> myQuery( );
}
