import java.time.LocalDate

class Subscription {
    private var title: String = ""
    set(value){
        if(value.length<=0){
            throw Exception("Пустое значение имени")
        }
        field = value
    }
    get(){
        return field
    }
    private var cost: UInt = 1u
    set(value){
        field = cost
    }
    get(){
        return field
    }
    private var firstDate: LocalDate = LocalDate.now()
    set(value){
        if(value<LocalDate.now()){
            throw Exception("Вы ввели некоректную дату")
        }
        field = value
    }
    get(){
        return field
    }
    private var lastDate: LocalDate = LocalDate.now()
    set(value){
        if(value<=firstDate){
            throw Exception("Вы ввели некоректную дату")
        }
        field = value
    }
    get(){
        return field
    }
    private var type: SubscriptionType = SubscriptionType.TEMPORARY
    set(value){
        field = value
    }
    get() {return field}
    constructor(){
        this.title = "title"
        this.cost = 1u
        this.firstDate = LocalDate.now()
        this.lastDate = LocalDate.now().plusDays(1)
        this.type = SubscriptionType.TEMPORARY
    }
    constructor(title: String, cost: UInt, firstDate: LocalDate, lastDate: LocalDate, type: SubscriptionType){
        this.title = title
        this.cost = cost
        this.firstDate = firstDate
        this.lastDate = lastDate
        this.type = type
    }

    override fun toString(): String {
        var info:String = "$title $cost $firstDate $lastDate ${type.printName()}"
        return info
    }
}