package example.red

import org.springframework.stereotype.Service

@Service
class RedService {
    fun get(): String {
        return "Red"
    }
}
