package org.sample.home.service

import org.camunda.bpm.engine.RuntimeService
import org.sample.home.camunda.PROCESS_ID
import org.springframework.stereotype.Service

@Service
class WorkflowService(
    private val runtimeService: RuntimeService
) {

    fun startService(businessKey: String) {
        runtimeService.startProcessInstanceByKey(
            PROCESS_ID, businessKey
        )
    }

}