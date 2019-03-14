package com.greenfox.reddit.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class RedditPost {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @Temporal(TemporalType.TIME)
    Date publicationTime;
    private String url;
    private String title;
    private int likeNum;

    public RedditPost () {
        this.publicationTime = new Date();
    }

    public Date getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(Date publicationTime) {
        this.publicationTime = publicationTime;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public Long getId() {
        return id;
    }

}
