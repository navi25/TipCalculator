package io.navendra.tipcalculator.view

import android.app.Activity
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.navendra.tipcalculator.R
import android.content.Intent
import android.util.Log
import com.firebase.ui.auth.AuthUI
import java.util.Arrays
import com.google.firebase.auth.FirebaseAuth
import com.firebase.ui.auth.IdpResponse
import kotlinx.android.synthetic.main.activity_auth.*
import com.amazonaws.mobile.auth.ui.SignInActivity
import com.google.android.gms.tasks.Task
import android.support.annotation.NonNull
import com.google.android.gms.tasks.OnCompleteListener




class AuthActivity : AppCompatActivity() {
    companion object {
        private val TAG : String = AuthActivity::class.java.simpleName
    }


    private val GOOGLE_TOS_URL = "https://www.google.com/policies/terms/"
    private val FIREBASE_TOS_URL = "https://firebase.google.com/terms/"
    private val GOOGLE_PRIVACY_POLICY_URL = "https://www.google.com/policies/privacy/"
    private val FIREBASE_PRIVACY_POLICY_URL = "https://firebase.google.com/terms/analytics/#7_privacy"

    private val RC_SIGN_IN = 100



    fun createIntent(context: Context): Intent {
        return Intent(context, AuthActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        signOut.setOnClickListener {
            AuthUI.getInstance()
                    .signOut(this)
                    .addOnCompleteListener {
                        // user is now signed out
                        startActivity(Intent(this@AuthActivity, SplashActivity::class.java))
                        finish()
                    }

        }
    }




}
