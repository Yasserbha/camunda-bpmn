package com.lieues.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class NbJourInvalide implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        delegateExecution.setVariable("redemander",Boolean.FALSE);
    }
}
