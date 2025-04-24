package me.nettee.post.application.port;

import me.nettee.post.application.domain.DraftPost;
import me.nettee.post.application.domain.status.DraftPostStatus;

import java.util.Optional;

public interface DraftPostCommandPort {
    Optional<DraftPost> findById(Long id);
    DraftPost create(DraftPost post);
    DraftPost update(DraftPost post);
    void updateStatus(Long id, DraftPostStatus postStatus);
}
