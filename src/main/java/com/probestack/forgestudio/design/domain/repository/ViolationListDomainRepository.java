package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.ViolationList;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for ViolationList domain operations.
 */
public interface ViolationListDomainRepository {
    ViolationList save(ViolationList violationList);

    Optional<ViolationList> findById(String id);

    List<ViolationList> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
