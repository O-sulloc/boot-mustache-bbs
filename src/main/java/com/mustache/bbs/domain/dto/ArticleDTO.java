package com.mustache.bbs.domain.dto;

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
}
