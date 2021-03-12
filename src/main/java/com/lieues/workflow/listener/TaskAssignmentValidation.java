package com.lieues.workflow.listener;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TaskAssignmentValidation implements TaskListener  {
    private final Logger LOGGER = LoggerFactory.getLogger(TaskAssignmentValidation.class);
    @Override
    public void notify(DelegateTask delegateTask) {
        // getAssigne est le id user qui va executer le task
        //LOGGER.info("tessssssssst :getAssignee = "+delegateTask.getAssignee()+"  delegate task id = "+delegateTask.getId());

    }
}
