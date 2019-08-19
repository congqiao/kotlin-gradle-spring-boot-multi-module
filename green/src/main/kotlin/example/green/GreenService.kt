package example.green

import org.springframework.stereotype.Service

@Service
class GreenService {
    fun get(): String {
        return "Green"
    }
}
