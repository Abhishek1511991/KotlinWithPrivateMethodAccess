package abhi.app.kotlinwithprivatemethodaccess

open class Data{

    private fun getProductList(): MutableList<Product>
    {
        val product1=Product("Test",1)
        val product2=Product("Test",2)
        val product3=Product("Test",3)
        val product4=Product("Test",4)
        val product5=Product("Test",5)
        val product6=Product("Test",6)
        val product7=Product("Test",7)
        val product8=Product("Test",8)
        val product9=Product("Test",9)

        return mutableListOf<Product>(product1,product2,product3,product4,product5,product6,product7,product8,product9)
    }
}