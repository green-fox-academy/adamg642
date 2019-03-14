package com.greenfox.reddit.repository;

import com.greenfox.reddit.model.RedditPost;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryReddit extends CrudRepository<RedditPost,Long> {
}
