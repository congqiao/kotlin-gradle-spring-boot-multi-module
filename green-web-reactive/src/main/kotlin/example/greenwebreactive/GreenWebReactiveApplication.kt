package example.greenwebreactive

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["example"])
class GreenWebReactiveApplication

fun main(args: Array<String>) {
    runApplication<GreenWebReactiveApplication>(*args)
}
