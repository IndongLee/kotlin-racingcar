package step3.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarFactoryTest {
    @Test
    fun `CarFactory에서는 어떤 유형의 Car를 만들지 지정해 생산할 수 있다`() {
        val step1Car = Car { 1 }
        val carFactory = CarFactory { step1Car }

        assertThat(carFactory.create()).isEqualTo(step1Car)
    }
}