package boonstra.application.development.badbackend.adapter.out.storage.message

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : CrudRepository<MessageDBEntity, Long> {
}