package boonstra.application.development.badbackend.adapter.out

import boonstra.application.development.badbackend.core.application.port.out.RelayMessagePort
import boonstra.application.development.badbackend.core.domain.model.Message

class EmailService : RelayMessagePort {
    override fun relay(message: Message) {
        TODO("Not yet implemented")
    }
}