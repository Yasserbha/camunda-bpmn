package com.lieues.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class VerifierNbJour implements JavaDelegate {
    private final Logger LOGGER = LoggerFactory.getLogger(VerifierNbJour.class);
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        //delegateExecution.setVariable("nb",Boolean.FALSE);
       // userTypeCheck
        delegateExecution.setVariable("nbdemander",5);
    }
}
