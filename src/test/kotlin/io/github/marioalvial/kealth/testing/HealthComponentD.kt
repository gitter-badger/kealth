package io.github.marioalvial.kealth.testing

import io.github.marioalvial.kealth.HealthComponent
import io.github.marioalvial.kealth.HealthStatus

class HealthComponentD : HealthComponent() {

    override val name = "component D"

    override fun doHealthCheck(): HealthStatus {
        println("Starting isHealth of component $name")

        Thread.sleep(400)

        println("Finish isHealth of component $name - 400ms")

        return HealthStatus.HEALTHY
    }

    override fun handleFailure(throwable: Throwable) {
        println("Starting handleFailure of component $name")

        Thread.sleep(400)

        println("Finish handle failure of component $name - 400ms")
    }
}