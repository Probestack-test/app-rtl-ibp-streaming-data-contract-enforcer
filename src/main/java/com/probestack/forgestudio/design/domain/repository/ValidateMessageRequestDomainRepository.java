package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.ValidateMessageRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for ValidateMessageRequest domain operations.
 */
public interface ValidateMessageRequestDomainRepository {
    ValidateMessageRequest save(ValidateMessageRequest validateMessageRequest);

    Optional<ValidateMessageRequest> findById(String id);

    List<ValidateMessageRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
