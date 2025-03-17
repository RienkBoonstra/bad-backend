package boonstra.application.development.badbackend.adapter.siberia

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("app")
data class AppProperties(
    val version: String
)
