package me.nettee.post.application.port;

import me.nettee.post.application.domain.Post;
import me.nettee.post.application.domain.status.PostStatus;

import java.util.Optional;

public interface PostCommandPort {
    Optional<Post> findById(Long id);
    Post create(Post post);
    Post update(Post post);
    void updateStatus(Long id, PostStatus postStatus);
}
