package boonstra.application.development.badbackend.adapter.out.storage.dummy

import boonstra.application.development.badbackend.core.application.port.out.StoreMessagePort
import boonstra.application.development.badbackend.core.domain.model.Message
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component

@Profile("dummy")
@Component
class DummyDBStoreMessageAdapter : StoreMessagePort {

    private val logger = LoggerFactory.getLogger(DummyDBStoreMessageAdapter::class.java)

    override fun store(message: Message) {
        logger.info("Gefalschte Speicherung von eine Nachricht: {}", message)
    }
}