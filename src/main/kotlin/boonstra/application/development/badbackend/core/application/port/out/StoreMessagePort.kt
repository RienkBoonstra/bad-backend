package boonstra.application.development.badbackend.core.application.port.out

import boonstra.application.development.badbackend.core.domain.model.Message

interface StoreMessagePort {
    fun store(message: Message): Unit
}