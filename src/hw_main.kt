/**
 * Function Main
 * @author Jesus DelMoral
 * date 10-05-20
 */
fun main(){
    var userAns = 0
    do {
        print("\n1.Commercial Customer\n" +
                "2.Residential Customer\n" +
                "3.Done\n" +
                "Enter the Number of you selection: ")
        userAns = readLine()!!.toInt()
        if (userAns == 1){
            var cName = ""
            var cPhone = ""
            var cAddress = ""
            var sFootage = 0.00
            var pty = ""
            print("Enter Customer Name: ")
            cName = readLine().toString()
            print("Enter Customer Phone: ")
            cPhone = readLine().toString()
            print("Enter Customer Address: ")
            cAddress = readLine().toString()
            print("Enter Customer Property Name: ")
            pty = readLine().toString()
            print("Enter Customer Square Footage: ")
            sFootage = readLine()!!.toDouble()
            var commercial1 = Commercial(property = pty, multiProperty = true, comRate = 5.00,
                    customerName = cName, customerPhone = cPhone,
                    customerAddress = cAddress, squareFootage = sFootage)
            commercial1.displayCom()
        }else if (userAns == 2){
            var cName = ""
            var cPhone = ""
            var cAddress = ""
            var sFootage = 0.00
            print("Enter Customer Name: ")
            cName = readLine().toString()
            print(cName)
            print("Enter Customer Phone: ")
            cPhone = readLine().toString()
            print("Enter Customer Address: ")
            cAddress = readLine().toString()
            print("Enter Customer Square Footage: ")
            sFootage = readLine()!!.toDouble()
            var residential1 = Residential(resRate = 6.00, seniorField = true,
                    customerName = cName, customerPhone = cPhone,
                    customerAddress = cAddress, squareFootage = sFootage)
            residential1.displayRes()
        }
    }while (userAns != 3)
}