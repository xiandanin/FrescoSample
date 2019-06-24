package `in`.xiandan.fresco.sample

import android.app.Application
import android.content.Context
import android.content.res.Resources
import com.facebook.drawee.backends.pipeline.Fresco

class CustomApplication : Application() {
    companion object {
        private lateinit var mInstance: Application

        fun getContext(): Context {
            return mInstance.applicationContext
        }

        fun getResources(): Resources {
            return mInstance.resources
        }
    }

    override fun onCreate() {
        super.onCreate()
        mInstance = this
        //FLog.setMinimumLoggingLevel(FLog.VERBOSE)
        Fresco.initialize(this)
    }

}
