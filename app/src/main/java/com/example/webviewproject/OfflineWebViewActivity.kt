package com.example.webviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebViewClient
import com.example.webviewproject.databinding.ActivityMainBinding
import com.example.webviewproject.databinding.ActivityOfflineWebViewBinding

class OfflineWebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOfflineWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityOfflineWebViewBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.webView.loadUrl("File:///android_asset/index.html")
        binding.webView.settings.javaScriptEnabled = true
        binding.webView.webViewClient = WebViewClient()
    }

    }
