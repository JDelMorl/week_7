/**
 * Class Commercial
 * Class Residential
 * @author Jesus DelMoral
 * date 10-05-20
 */
class Commercial(var property: String,
                 var multiProperty: Boolean,
                 var comRate: Double,
                 customerName: String,
                 customerPhone: String,
                 customerAddress: String,
                 squareFootage: Double):
        Customer(customerName, customerPhone, customerAddress, squareFootage){
    init {

    }
    fun displayCom (){
        var total = 0.00
        var discount = 0.00
        if (multiProperty){
            total = (squareFootage / 1000) * comRate
            discount = total * .10
            total -= discount
        }else{
            total = (squareFootage / 1000) * comRate
        }
        println("\nCustomer Name: $customerName" +
                "\nCustomer Phone: $customerPhone" +
                "\nCustomer Address: $customerAddress" +
                "\nProperty Name: $property" +
                "\nSquare Footage: $squareFootage" +
                "\nMulti Properties?: $multiProperty" +
                "\nCustomer Rate: $$comRate" +
                "\nCustomer Weekly Charge: $$total")
    }
}
class Residential(var resRate: Double,
                  var seniorField: Boolean,
                  customerName: String,
                  customerPhone: String,
                  customerAddress: String,
                  squareFootage: Double):
        Customer(customerName, customerPhone, customerAddress, squareFootage){
    init {

    }
    fun displayRes(){
        var total = 0.00
        var discount = 0.00
        if (seniorField){
            total = (squareFootage / 1000) * resRate
            discount = total * .15
            total -= discount
        }else{
            total = (squareFootage / 1000) * resRate
        }
        println("\nCustomer Name: $customerName" +
                "\nCustomer Phone: $customerPhone" +
                "\nCustomer Address: $customerAddress" +
                "\nSquare Footage: $squareFootage" +
                "\nSenior Field?: $seniorField" +
                "\nCustomer Rate: $$resRate" +
                "\nCustomer Weekly Charge: $$total")
    }
}
