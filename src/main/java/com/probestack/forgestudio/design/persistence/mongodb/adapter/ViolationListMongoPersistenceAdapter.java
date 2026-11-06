package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.ViolationListDomainRepository;
import com.probestack.forgestudio.design.model.ViolationList;
import com.probestack.forgestudio.design.persistence.mongodb.document.ViolationListDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.ViolationListMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ViolationListMongoPersistenceAdapter implements ViolationListDomainRepository {
    private final ViolationListMongoRepository repository;

    public ViolationListMongoPersistenceAdapter(ViolationListMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ViolationList save(ViolationList violationList) {
        ViolationListDocument document = toDocument(violationList);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<ViolationList> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<ViolationList> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private ViolationListDocument toDocument(ViolationList violationList) {
        ViolationListDocument document = new ViolationListDocument();
        BeanUtils.copyProperties(violationList, document);
        return document;
    }

    private ViolationList toDomain(ViolationListDocument document) {
        ViolationList domain = new ViolationList();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
