package com.ofppt.myasynctask

import android.content.Context
import android.os.AsyncTask
import android.widget.Toast
import java.lang.ref.WeakReference

class AsyncWeakReference(private var context: WeakReference<Context>) : AsyncTask<Int, Any, Int>()
{

    override fun onPreExecute() {
        super.onPreExecute()
    }

    override fun doInBackground(vararg params: Int?): Int? {
        var value =  params[0]

        value = value?.times((2))

        return value
    }

    override fun onPostExecute(result: Int?) {
        super.onPostExecute(result)

        //context.get()
        //On utilise la méthode get() pour récupérer l’objet stocké, et c’est null s’il a déjà été libéré.

       Toast.makeText(context.get(), "value WeakReference $result", Toast.LENGTH_LONG).show()

    }
}


