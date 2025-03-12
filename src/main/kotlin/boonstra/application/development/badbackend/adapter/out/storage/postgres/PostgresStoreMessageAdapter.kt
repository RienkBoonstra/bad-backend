package boonstra.application.development.badbackend.adapter.out.storage.postgres

import boonstra.application.development.badbackend.adapter.out.storage.MessageDBEntity
import boonstra.application.development.badbackend.core.application.port.out.StoreMessagePort
import boonstra.application.development.badbackend.core.domain.model.Message
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component

@Profile("postgres")
@Component
class PostgresStoreMessageAdapter (
    private val postgresMessageRepository: PostgresMessageRepository
) : StoreMessagePort {
    override fun store(message: Message) {
        postgresMessageRepository.save(
            MessageDBEntity(
                emailAddress = message.emailAddress,
                text = message.text,
            )
        )
    }
}