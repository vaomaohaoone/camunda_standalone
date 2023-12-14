package org.sample.home.controller

import org.sample.home.service.WorkflowService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class WorkflowController(
    private val workflowService: WorkflowService
) {

    @PostMapping("/start")
    fun startProcess(@RequestParam("businessKey") businessKey: String) =
        workflowService.startService(businessKey)

}