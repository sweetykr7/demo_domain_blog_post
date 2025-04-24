package me.nettee.post.application.domain;

import me.nettee.post.application.domain.status.DraftPostStatus;

import java.time.Instant;

public class DraftPost {
    private Long id;
    private String title;
    private String content;
    private DraftPostStatus status;
    private Instant create_at;
    private Instant update_at;
    private Long blog_id;
    private Long post_id;
}