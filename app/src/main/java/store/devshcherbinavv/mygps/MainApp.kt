package store.devshcherbinavv.mygps

import android.app.Application
import store.devshcherbinavv.mygps.db.MainDb

class MainApp : Application() {
    val database by lazy {MainDb.getDatabase(this)}
}