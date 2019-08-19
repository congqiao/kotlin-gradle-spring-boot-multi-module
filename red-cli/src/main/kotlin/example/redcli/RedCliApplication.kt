package example.redcli

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["example"])
class RedCliApplication

fun main(args: Array<String>) {
    runApplication<RedCliApplication>(*args)
}
