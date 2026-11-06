package com.probestack.forgestudio.design.api;

import java.time.OffsetDateTime;
import java.util.UUID;
import com.probestack.forgestudio.design.model.ViolationList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.ViolationsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")
@Controller
@RequestMapping("${openapi.streamingDataContractEnforcer.base-path:/v1}")
public class ViolationsApiController implements ViolationsApi {

    private static final Logger log = LoggerFactory.getLogger(ViolationsApiController.class);

    private final ViolationsService violationsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public ViolationsApiController(ViolationsService violationsService, GeneratedRequestValidator generatedRequestValidator) {
        this.violationsService = violationsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<ViolationList> listViolations(@RequestParam(value = "contractId", required = false) UUID contractId, @RequestParam(value = "producerService", required = false) String producerService, @RequestParam(value = "severity", required = false) String severity, @RequestParam(value = "violationType", required = false) String violationType, @RequestParam(value = "status", required = false) String status, @RequestParam(value = "fromDate", required = false) OffsetDateTime fromDate, @RequestParam(value = "toDate", required = false) OffsetDateTime toDate, @RequestParam(value = "page", required = false, defaultValue = "0") Integer page, @RequestParam(value = "size", required = false, defaultValue = "20") Integer size) {
        log.info("Processing listViolations request");
        try {
            var response = violationsService.listViolations(contractId, producerService, severity, violationType, status, fromDate, toDate, page, size);
            log.info("listViolations completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listViolations: {}", e.getMessage(), e);
            throw e;
        }
    }
}
