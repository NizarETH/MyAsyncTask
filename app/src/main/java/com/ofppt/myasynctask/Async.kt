package com.ofppt.myasynctask

import android.content.Context
import android.os.AsyncTask
import android.widget.Toast

class Async(private var context: Context) : AsyncTask<Int, Any, Int>()
{

    override fun onPreExecute() {
        super.onPreExecute()
    }

    override fun doInBackground(vararg params: Int?): Int? {
        var value =  params[0]
        if (value != null) {
            value *= (2)
        }
        return value
    }

    override fun onPostExecute(result: Int?) {
        super.onPostExecute(result)

       Toast.makeText(context, "value $result", Toast.LENGTH_LONG).show()

    }
}


