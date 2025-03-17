package boonstra.application.development.badbackend.adapter.siberia

import org.springframework.stereotype.Service

@Service
class MiseEnSceneService(
    private val appProperties: AppProperties
) {

    fun version() = appProperties.version

    fun deadOrAlive() = "Oh, god still alive!"
}