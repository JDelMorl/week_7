open class Person (firstName: String,
              lastName: String){
    var firstName: String = ""
        get() = field
        set(value) {
            field = value
        }
    var lastName: String = ""
        get() = field
        set(value) {
            field = value
        }
    var fullName: String = ""

    init {
        this.firstName = firstName
        this.lastName = lastName
        fullName = setFullName()
    }

    fun setFullName(): String{
        return  "$firstName $lastName"
    }
}