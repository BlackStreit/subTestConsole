

enum class SubscriptionType(val number: Int) {
    TEMPORARY(1){
        override fun printName(): String {
            return  ("Временная")
        }

    }, PERMANENT(2){
        override fun printName(): String {
            return ("Постоянная")
        }
    };
    abstract fun printName(): String
}