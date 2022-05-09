package step3.domain

import step3.model.RacingGameInput
import step3.model.RacingStepStatus

class RacingGame(
    private val cars: List<Car>,
    private val numberOfAttempts: Int
) {
    fun start() = List(numberOfAttempts) {
        raceAll()
        getCurrentRacingStepStatus()
    }

    private fun getCurrentRacingStepStatus() = RacingStepStatus(
        proceedLevels = cars.map { car ->
            car.proceedLevel
        }
    )

    private fun raceAll() {
        cars.forEach { car ->
            car.proceed()
        }
    }

    companion object {
        fun of(racingGameInput: RacingGameInput, carFactory: CarFactory): RacingGame {
            return RacingGame(
                cars = List(racingGameInput.numberOfCars) { carFactory.create() },
                numberOfAttempts = racingGameInput.numberOfAttempts
            )
        }
    }
}
