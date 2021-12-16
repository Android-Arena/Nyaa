package com.AndroidArena.nyaa

import android.util.Log
import androidx.compose.animation.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.setValue
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.AndroidArena.nyaa.model.User
import com.AndroidArena.nyaa.ui.theme.Black2
import com.AndroidArena.nyaa.ui.theme.NyaaTheme
import com.AndroidArena.nyaa.ui.theme.primaryColor
import com.google.accompanist.navigation.animation.navigation
import com.google.accompanist.navigation.animation.composable
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.ktx.storage


@Composable
fun Frame2(
   // navController: NavController,
    user: User
){
    Surface(
        modifier = Modifier

    ) {
        Image(
            painterResource(id = R.drawable.image_frame2),
            contentDescription = "background image for frame2",
            contentScale = ContentScale.FillBounds,

            alignment= Alignment.Center,
        )
       /* IconButton(
            modifier = Modifier
                .padding(start = 14.dp, top = 40.dp),
            onClick = {navController.navigate(Screen.frame1.route)}
        ) {
            Image(painterResource(id = R.drawable.ic_ion_arrow_back_circle_outline ),
                contentDescription = "back_button",
            )
        }*/
        Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()

        ) {
            Spacer(modifier = Modifier.padding(top = 450.dp))
            Text(text="Please enter your username!",
            color=primaryColor,
            style=MaterialTheme.typography.body2
            )
            Spacer(modifier = Modifier.padding(top=90.dp))
            var text by remember { mutableStateOf(TextFieldValue(user.displayName))}
            OutlinedTextField(
                value = text,
               /* keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                ),*/
                label = { Text(text = "Username") },
                onValueChange = {
                    text = it
                }
            )
            Spacer(modifier = Modifier.padding(top = 50.dp))
            Text(text = user.email)

        }

    }

}

/*fun writeNewUser(userId:String, name:String, email:String){
    val user = User(name, email)
    var database:DatabaseReference = Firebase.database.reference
    database.child("users").child(userId).setValue(user)

}*/


private fun uploadUserToFirebaseRDB(user: User){
    val uid= FirebaseAuth.getInstance().uid?:""
    val userL= User(user.displayName, user.email)
    val ref:DatabaseReference = Firebase.database.reference

    ref.child("users").child(uid).setValue(userL)
        .addOnSuccessListener{
            Log.d("Register user", "User saved to firebase database")
        }


/*var storage:FirebaseStorage = Firebase.storage
    var database: DatabaseReference = Firebase.database.reference


    val database = Firebase.database
    val myRef = database.getReference("message")

    val storageRef = storage.reference
*/

}


@Composable
@Preview
fun Frame2Preview(){
    NyaaTheme {
        Frame2(
           // navController = rememberNavController(),
            user = User(email= "arena.andrd@gmail.com", displayName = "nyaa-63678")
            )
    }
}