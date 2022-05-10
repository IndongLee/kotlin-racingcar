package racinggame.util

object InputNumberRangeValidator {
    private const val INVALID_USER_INPUT_MESSAGE = "반드시 0 이상의 값이 입력되어야 합니다."

    fun validate(input: Int): Int {
        return input.also { inputNumber ->
            require(inputNumber >= 0) {
                INVALID_USER_INPUT_MESSAGE
            }
        }
    }
}
