package me.nettee.post.application.port;

import me.nettee.post.application.domain.Post;

import me.nettee.post.application.domain.status.PostStatus;
import org.springframework.data.domain.Pageable;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface PostQueryPort {
    Optional<Post> findById(Long id);
    List<Post> findAllAfter(Instant lastCreatedAt, Long lastId, int size);
    List<Post> findByStatusesAfter(Set<PostStatus> statuses, Instant lastCreatedAt, Long lastId, int size);

}
