package com.techun.aiproyectcoffeepests.view

import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.techun.aiproyectcoffeepests.view.onboarding.OnBoardingActivity
import com.techun.aiproyectcoffeepests.data.PreferencesProvider
import com.techun.aiproyectcoffeepests.extensions.goToActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler()
            .postDelayed({
                val onBanding = PreferencesProvider.getSecondsRemaining(this)
                if (onBanding)
                    goToActivity<LiveObjectDetectionActivity>()
                else
                    goToActivity<OnBoardingActivity>()
            }, 3000)
    }
}