package boonstra.application.development.badbackend.core.application.usecase

import boonstra.application.development.badbackend.core.application.port.`in`.PostMessagePort
import org.springframework.stereotype.Component

@Component
class PostMessageUseCase : PostMessagePort {
    override fun postMessage(request: PostMessagePort.PostMessageParam) {
        TODO("Not yet implemented")
    }
}