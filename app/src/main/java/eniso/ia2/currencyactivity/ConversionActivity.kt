package eniso.ia2.currencyactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import eniso.ia2.currencyactivity.databinding.ActivityConversionBinding

class ConversionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversion)
        val bind = ActivityConversionBinding.inflate(layoutInflater)
        setContentView(bind.root)
        val extra=intent.getStringExtra("number")
        val c1=extra.toString().toDouble()*3.3
        val c2=extra.toString().toDouble()/3.3
        val sens =intent.getStringExtra("sens")
        val c0=sens.toString().toInt()
        if(c0.toString()=="1"){
            bind.t.setText("L'equivalent de $extra dt en euro est: $c2")

        }
        if(c0.toString()=="2"){
            bind.t.setText("L'equivalent de $extra euro en dinar est: $c1")
        }







    }
}