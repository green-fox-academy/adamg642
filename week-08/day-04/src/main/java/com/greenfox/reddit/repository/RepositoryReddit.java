package com.greenfox.reddit.repository;

import com.greenfox.reddit.model.RedditPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryReddit extends  CrudRepository<RedditPost,Long> {

}
