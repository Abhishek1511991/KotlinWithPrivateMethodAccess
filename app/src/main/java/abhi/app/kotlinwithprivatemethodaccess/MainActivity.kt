package abhi.app.kotlinwithprivatemethodaccess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val method = Data().javaClass.getDeclaredMethod("getProductList")
        method.isAccessible = true
        val returnValue = method.invoke(Data()) as MutableList<*>
        println(returnValue)
    }
}