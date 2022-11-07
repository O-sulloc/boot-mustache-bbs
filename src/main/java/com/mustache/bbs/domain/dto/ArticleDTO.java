package com.mustache.bbs.domain.dto;

import com.mustache.bbs.domain.entity.Article;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ArticleDTO {
    private Long id;
    private String title;
    private String contents;

    public ArticleDTO(Long id, String title, String contents) {
        this.id = id;
        this.title = title;
        this.contents = contents;
    }

    public Article toEntity(){
        return new Article(title, contents);
    }
}
