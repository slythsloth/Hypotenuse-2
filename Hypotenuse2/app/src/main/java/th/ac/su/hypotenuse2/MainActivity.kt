package th.ac.su.hypotenuse2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lega = findViewById<EditText>(R.id.lega)
        val legb = findViewById<EditText>(R.id.legb)
        val btnSolve = findViewById<Button>(R.id.btn)
        val valueC = findViewById<TextView>(R.id.valueC)

        btnSolve.setOnClickListener() {
            var a = lega.text.toString().toDouble()
            var b = legb.text.toString().toDouble()

            var c:Double =  ((a*a) + (b*b))
            var sqc = Math.sqrt(c)

            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("a",lega.text.toString())
            intent.putExtra("b",legb.text.toString())
            intent.putExtra("c",sqc.toString())
            startActivity(intent)
        }
    }
}

//var triangle1:Triangle = Triangle()
//triangle1.a = lega.text.toString().toDouble()
//triangle1.b = legb.text.toString().toDouble()
//triangle1.c = valueC.text.toString().toDouble()
//             var triangle:Bundle = Bundle()
//            triangle.putDouble("a",a)
//            triangle.putDouble("b",b)
//            triangle.putDouble("c",c)
//
//            var intent = Intent(this@MainActivity, SecondActivity::class.java)
//            intent.putExtra("bundle",triangle)
//            startActivity(intent)