package boonstra.application.development.badbackend.adapter.`in`

import boonstra.application.development.badbackend.core.application.port.`in`.PostMessagePort
import boonstra.application.development.badbackend.core.application.usecase.PostMessageUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("messages")
class PostMessageController(
    private val postMessageUseCase: PostMessageUseCase,
) {

    data class PostMessageRequest(
        val email: String,
        val text: String,
    )

    @PostMapping
    fun postMessage(@RequestBody request: PostMessageRequest) : ResponseEntity<String> {
        postMessageUseCase.postMessage(
            PostMessagePort.PostMessageParam(
                email = request.email,
                text = request.text
            )
        )
        return ResponseEntity.ok("Oh, god! Still alive!")
    }
}