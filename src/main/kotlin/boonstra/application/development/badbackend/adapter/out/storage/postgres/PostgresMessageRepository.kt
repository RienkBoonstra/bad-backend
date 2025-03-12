package boonstra.application.development.badbackend.adapter.out.storage.postgres

import boonstra.application.development.badbackend.adapter.out.storage.MessageDBEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PostgresMessageRepository : CrudRepository<MessageDBEntity, Long> {
}