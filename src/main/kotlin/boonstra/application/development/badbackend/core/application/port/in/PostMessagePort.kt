package boonstra.application.development.badbackend.core.application.port.`in`

interface PostMessagePort {

    data class PostMessageParam(
        val email: String,
        val text: String,
    )

    fun postMessage(request: PostMessageParam) : Unit
}