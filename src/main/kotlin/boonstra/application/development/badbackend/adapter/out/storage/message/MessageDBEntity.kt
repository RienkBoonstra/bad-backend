package boonstra.application.development.badbackend.adapter.out.storage.message

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "message")
class MessageDBEntity(
    var emailAddress: String,
    var text: String,
    @Id @GeneratedValue var id: UUID? = null
)