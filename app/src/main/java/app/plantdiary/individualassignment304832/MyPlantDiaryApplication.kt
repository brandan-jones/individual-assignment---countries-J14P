package app.plantdiary.individualassignment304832

import android.app.Application
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class MyPlantDiaryApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Start Koin
        GlobalContext.startKoin {
            androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            androidContext(this@MyPlantDiaryApplication)
            modules(appModule)
        }
    }

}