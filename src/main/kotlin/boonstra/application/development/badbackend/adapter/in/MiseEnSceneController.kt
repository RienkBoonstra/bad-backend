package boonstra.application.development.badbackend.adapter.`in`

import boonstra.application.development.badbackend.adapter.siberia.MiseEnSceneService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/probe")
class MiseEnSceneController(
    private val miseEnSceneService: MiseEnSceneService
) {

    @GetMapping("/dead_or_alive")
    fun deadOrAlive() = miseEnSceneService.deadOrAlive()

    @GetMapping("/version")
    fun version() = miseEnSceneService.version()

}