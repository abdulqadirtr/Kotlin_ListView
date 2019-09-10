package app.easylink.kotlin_listview

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MainActivity : AppCompatActivity() {

   // private lateinit var listView ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.list1)
        val redColor=Color.parseColor("#FF0000")
       listView.setBackgroundColor(redColor)
       listView.adapter= MyCustomAdapter(this)
    }
    private class MyCustomAdapter(context: Context): BaseAdapter(){
        private val mContext: Context
        init{
           mContext=context
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val textView = TextView(mContext)
            textView.text="here is my row for my list view"
            return textView
        }

        override fun getItem(position: Int): Any {
        return "Test Again"
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {

            return 5
        }

    }
}
