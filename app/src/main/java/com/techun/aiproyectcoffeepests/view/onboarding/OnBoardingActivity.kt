package com.techun.aiproyectcoffeepests.view.onboarding

import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.techun.aiproyectcoffeepests.R
import com.techun.aiproyectcoffeepests.data.PreferencesProvider
import com.techun.aiproyectcoffeepests.databinding.ActivityOnBoardingBinding
import com.techun.aiproyectcoffeepests.extensions.goToActivity
import com.techun.aiproyectcoffeepests.view.LiveObjectDetectionActivity

class OnBoardingActivity : AppCompatActivity(), ViewPagerAdapter.OnItemSelected {
    private lateinit var boardList: List<Board>
    private lateinit var binding: ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R)
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        else
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )

        boardList = listOf(
            Board(
                background = R.color.white,
                image = R.raw.first,
                title = getString(R.string.onboarding_protect),
                description = getString(R.string.onboarding_tip_one)
            ),
            Board(
                background = R.color.white,
                image = R.raw.robot,
                title = getString(R.string.onboarding_analyze),
                description = getString(R.string.onboarding_tip_two)
            )
        )

        val adapter = ViewPagerAdapter(boardList, this)
        binding.viewPager.adapter = adapter
        binding.viewPager.layoutDirection = ViewPager2.LAYOUT_DIRECTION_LTR
    }

    override fun onClickListener(position: Int) {
        if (position == (boardList.size - 1)) {
            PreferencesProvider.setSecondsRemaining(this, true)
            goToActivity<LiveObjectDetectionActivity>()
        } else {
            binding.viewPager.setCurrentItem((position + 1), true)
        }
    }
}