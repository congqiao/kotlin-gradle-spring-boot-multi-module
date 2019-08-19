package example.greenwebreactive

import example.green.GreenService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class GreenController(val greenService: GreenService) {
    @GetMapping("/")
    private fun get(): Mono<String> {
        return Mono.just(greenService.get())
    }
}
