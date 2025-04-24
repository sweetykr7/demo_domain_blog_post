package me.nettee.post.application.port;

import me.nettee.post.application.domain.DraftPost;
import me.nettee.post.application.domain.status.PostStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.Set;

public interface DraftPostQueryPort {
    Optional<DraftPost> findById(Long id);
    Page<DraftPost> findAll(Pageable pageable);

}
