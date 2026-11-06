package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.Contract;
import com.probestack.forgestudio.design.model.ContractList;
import com.probestack.forgestudio.design.model.RegisterContractRequest;
import java.util.UUID;
import com.probestack.forgestudio.design.model.ValidateMessageRequest;
import com.probestack.forgestudio.design.model.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.ContractsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")
@Controller
@RequestMapping("${openapi.streamingDataContractEnforcer.base-path:/v1}")
public class ContractsApiController implements ContractsApi {

    private static final Logger log = LoggerFactory.getLogger(ContractsApiController.class);

    private final ContractsService contractsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public ContractsApiController(ContractsService contractsService, GeneratedRequestValidator generatedRequestValidator) {
        this.contractsService = contractsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Contract> getContract(@PathVariable() UUID contractId, @RequestParam(value = "includeViolationHistory", required = false, defaultValue = "true") Boolean includeViolationHistory) {
        log.info("Processing getContract request");
        try {
            var response = contractsService.getContract(contractId, includeViolationHistory);
            log.info("getContract completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getContract: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<ContractList> listContracts(@RequestParam(value = "producerTeam", required = false) String producerTeam, @RequestParam(value = "consumerTeam", required = false) String consumerTeam, @RequestParam(value = "clusterName", required = false) String clusterName, @RequestParam(value = "enforcementLevel", required = false) String enforcementLevel, @RequestParam(value = "schemaFormat", required = false) String schemaFormat, @RequestParam(value = "hasRecentViolations", required = false) Boolean hasRecentViolations, @RequestParam(value = "page", required = false, defaultValue = "0") Integer page, @RequestParam(value = "size", required = false, defaultValue = "20") Integer size) {
        log.info("Processing listContracts request");
        try {
            var response = contractsService.listContracts(producerTeam, consumerTeam, clusterName, enforcementLevel, schemaFormat, hasRecentViolations, page, size);
            log.info("listContracts completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listContracts: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Contract> registerContract(@RequestBody() RegisterContractRequest registerContractRequest) {
        log.info("Processing registerContract request");
        try {
            generatedRequestValidator.validate("registerContract", registerContractRequest);
            var response = contractsService.registerContract(registerContractRequest);
            log.info("registerContract completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process registerContract: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<ValidationResult> validateMessage(@PathVariable() UUID contractId, @RequestBody() ValidateMessageRequest validateMessageRequest) {
        log.info("Processing validateMessage request");
        try {
            generatedRequestValidator.validate("validateMessage", validateMessageRequest);
            var response = contractsService.validateMessage(contractId, validateMessageRequest);
            log.info("validateMessage completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process validateMessage: {}", e.getMessage(), e);
            throw e;
        }
    }
}
