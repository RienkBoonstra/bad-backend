package boonstra.application.development.badbackend.core.application.usecase

import boonstra.application.development.badbackend.core.application.port.`in`.PostMessagePort
import boonstra.application.development.badbackend.core.application.port.out.StoreMessagePort
import boonstra.application.development.badbackend.core.domain.model.Message
import org.springframework.stereotype.Component

@Component
class PostMessageUseCase(
    private val storeMessagePort: StoreMessagePort
) : PostMessagePort {
    override fun postMessage(message: Message) {
        storeMessagePort.store(message)
    }
}