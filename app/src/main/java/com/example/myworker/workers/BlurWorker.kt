package com.example.myworker.workers

import android.content.Context


import android.graphics.BitmapFactory
import android.util.Log
import android.widget.Toast
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.myworker.R

class BlurWorker(ctx: Context, params: WorkerParameters) : Worker(ctx, params) {
    override fun doWork(): Result {
        val appContext = applicationContext

        makeStatusNotification("Blurring image", appContext)

        return try {
            val picture = BitmapFactory.decodeResource(
                appContext.resources,
                R.drawable.test)

            val output = blurBitmap(picture, appContext)

            // Write bitmap to a temp file
            val outputUri = writeBitmapToFile(appContext, output)

            makeStatusNotification("Output is $outputUri", appContext)
            Log.d("MyTag","Result Success")
            Result.success()
        } catch (throwable: Throwable) {
            Log.d("MyTag","Result Failure")
            Result.failure()
        }
    }
}