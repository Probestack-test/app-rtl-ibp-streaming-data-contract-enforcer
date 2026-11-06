package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.ValidateMessageRequestDomainRepository;
import com.probestack.forgestudio.design.model.ValidateMessageRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.ValidateMessageRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.ValidateMessageRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ValidateMessageRequestMongoPersistenceAdapter implements ValidateMessageRequestDomainRepository {
    private final ValidateMessageRequestMongoRepository repository;

    public ValidateMessageRequestMongoPersistenceAdapter(
            ValidateMessageRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ValidateMessageRequest save(ValidateMessageRequest validateMessageRequest) {
        ValidateMessageRequestDocument document = toDocument(validateMessageRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<ValidateMessageRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<ValidateMessageRequest> findAll() {
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

    private ValidateMessageRequestDocument toDocument(
            ValidateMessageRequest validateMessageRequest) {
        ValidateMessageRequestDocument document = new ValidateMessageRequestDocument();
        BeanUtils.copyProperties(validateMessageRequest, document);
        return document;
    }

    private ValidateMessageRequest toDomain(ValidateMessageRequestDocument document) {
        ValidateMessageRequest domain = new ValidateMessageRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
