package th.ac.su.hypotenuse2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var valueA = findViewById<TextView>(R.id.valueA)
        var valueB = findViewById<TextView>(R.id.valueB)
        val valueC = findViewById<TextView>(R.id.valueC)

        val a = intent.getStringExtra("a")
        valueA.setText(a)
        val b = intent.getStringExtra("b")
        valueB.setText(b)
        val c = intent.getStringExtra("c")
        valueC.setText(c)


        val okBtn = findViewById<Button>(R.id.okBtn);
        okBtn.setOnClickListener {
            var intent = Intent()
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}


//        val triangleBundle:Bundle? = intent.getBundleExtra("triangle1")
//        val value1 = triangleBundle!!.getDouble("a")
//        val value2 = triangleBundle!!.getDouble("b")
//        val value3 = triangleBundle!!.getDouble("c")

