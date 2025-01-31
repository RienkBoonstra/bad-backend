package boonstra.application.development.badbackend.adapter.out.storage.message

import boonstra.application.development.badbackend.core.application.port.out.StoreMessagePort
import boonstra.application.development.badbackend.core.domain.model.Message
import org.springframework.stereotype.Component

@Component
class StoreMessageAdapter (
    private val messageRepository: MessageRepository
) : StoreMessagePort {
    override fun store(message: Message) {
        messageRepository.save(
            MessageDBEntity(
                emailAddress = message.emailAddress,
                text = message.text,
            )
        )
    }
}