package com.lieues.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RefusDemande implements JavaDelegate {

    private final Logger LOGGER = LoggerFactory.getLogger(RefusDemande.class);
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {





    }
}
