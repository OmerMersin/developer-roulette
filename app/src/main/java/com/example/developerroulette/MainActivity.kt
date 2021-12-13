package com.example.developerroulette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import com.example.developerroulette.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var hackerHealth = 10
        binding.code1.text = "Welcome to"
        binding.code2.text = "Developer Roulette"
        binding.code3.text = "Hacker will try to"
        binding.code4.text = "hijack the system."
        binding.code5.text = "You will defend."
        binding.code6.text = "Expose him."
            binding.debugButton.setOnClickListener { isShot()
                if (isShot() == false)
                {
                    if (hackerHealth != 0) {
                        binding.hackerHealthView.text = "${hackerHealth--}"
                        binding.healthBar.progress = hackerHealth
                    }
                }
                if (isShot() == true)
                {
                    if (hackerHealth != 0) {
                        binding.hackerHealthView.text = "${hackerHealth++}"
                        binding.healthBar.progress = hackerHealth
                    }
                }
                if (hackerHealth == 0){
                    binding.hackerHealthView.text = "0"
                    binding.virusText.text = "You Beat Him!"
                }
                if (hackerHealth == 15){
                    binding.hackerHealthView.text = "15"
                    binding.virusText.text = "Your computer is no longer usable!"
                }
            }
        }

        fun isShot():Boolean
        {
            var hit = true
            var codeScore = Random.nextInt(0, 6)
            var hackScore = Random.nextInt(0, 6)
            if (codeScore == 1 && hackScore == 1) {
                binding.code1.text = "include bla bla"
                binding.code2.text = "PuHaHaHa"
                binding.code3.text = "return bla bla"
                binding.hackScore.text = "Success"
                binding.code4.text = "Got it"
                binding.code5.text = "I can see"
                binding.code6.text = "I caught"
                binding.codeScore.text = "Success"
                binding.virusText.text = "Debugged"
                hit = false
            } else {
                if (hackScore != 1 && hackScore != 2) {
                    binding.code1.text = "google/HowToHack"
                    binding.code2.text = "Where is my black hat"
                    binding.code3.text = "Come on"
                    binding.hackScore.text = "Failed"
                    binding.code4.text = "Got it"
                    binding.code5.text = "I can see"
                    binding.code6.text = "I caught"
                    binding.codeScore.text = "Success"
                    binding.virusText.text = "Debugged"
                    hit = false
                } else {
                    binding.code1.text = "include bla bla"
                    binding.code2.text = "PuHaHaHa"
                    binding.code3.text = "return bla bla"
                    binding.hackScore.text = "Success"
                    binding.code4.text = "Oh a Trojan"
                    binding.code5.text = "This is so hard"
                    binding.code6.text = "Nooo!"
                    binding.codeScore.text = "Failed"
                    binding.virusText.text = "Debug Failed"
                }
            }
            return hit
        }
    }
