package com.AndroidArena.nyaa.presentation

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.AndroidViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.AndroidArena.nyaa.Frame2
import com.AndroidArena.nyaa.model.AuthViewModel
import com.AndroidArena.nyaa.utils.AuthResultContract
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.AuthResult
import kotlinx.coroutines.launch
import org.w3c.dom.Text
import java.awt.font.TextAttribute

@ExperimentalMaterialApi
@Composable
fun AuthView(errorText:String?,
onClick:()-> Unit ){
    Scaffold {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
            GoogleSignInButtonUi(
                text = "Sign In with Google",
                loadingText = "Signing In",
                onClicked = {onClick()})
                errorText?.let {
                    Spacer(modifier = Modifier.height(30.dp))
                    Text(text = it)
                }
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun AuthScreen(authViewModel: AuthViewModel){

    val coroutineScope= rememberCoroutineScope()
    var text by remember { mutableStateOf<String?> (null)}
    val user by remember (authViewModel){authViewModel.user}.collectAsState()
    val signInRequestCode = 1
    
    val authResultLauncher = 
        rememberLauncherForActivityResult(contract = AuthResultContract()){
            task ->
            try {
                val account = task?.getResult(ApiException::class.java)
                if(account == null){
                    text="Google Sign In failed"
                }else{
                    coroutineScope.launch{
                        authViewModel.signIn(
                            email = account.email,
                            displayName = account.displayName
                        )
                    }
                }
            }catch (e:ApiException){
                text="Google Sign In failed"
            }
        }
    AuthView(errorText = text, onClick = {
        text=null
        authResultLauncher.launch(signInRequestCode)
    })
    user?.let{
        Frame2(
            /*navController= rememberNavController(),*/
            user = it)
    }
}
