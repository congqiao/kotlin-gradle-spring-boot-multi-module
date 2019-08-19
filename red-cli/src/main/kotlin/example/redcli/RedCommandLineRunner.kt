package example.redcli

import example.red.RedService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class RedCommandLineRunner(val redService: RedService) : CommandLineRunner {
    override fun run(vararg args: String?) {
        println(redService.get())
    }
}
