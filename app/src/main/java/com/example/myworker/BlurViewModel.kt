package com.example.myworker

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import com.example.myworker.workers.BlurWorker

class BlurViewModel(application: Application): AndroidViewModel(application) {

    private val workManager = WorkManager.getInstance(application)

    internal fun applyBlur(blurLevel: Int){
        //workManager.enqueue(OneTimeWorkRequest.Builder(BlurWorker::class.java).build())
        workManager.enqueue(OneTimeWorkRequest.from(BlurWorker::class.java))
        //Toast.makeText(getApplication(), "BlurViewModel class called", Toast.LENGTH_SHORT).show()
    }

}