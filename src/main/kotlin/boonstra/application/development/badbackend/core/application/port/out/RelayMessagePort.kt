package boonstra.application.development.badbackend.core.application.port.out

import boonstra.application.development.badbackend.core.domain.model.Message

interface RelayMessagePort {
    fun relay(message: Message): Unit
}