package boonstra.application.development.badbackend.core.application.port.`in`

import boonstra.application.development.badbackend.core.domain.model.Message

interface PostMessagePort {

    fun postMessage(message: Message) : Unit
}