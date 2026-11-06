package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.ValidateMessageRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for ValidateMessageRequest documents.
 */
public interface ValidateMessageRequestMongoRepository extends MongoRepository<ValidateMessageRequestDocument, String> {
}
