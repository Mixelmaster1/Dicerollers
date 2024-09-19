package com.example.diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.diceroller.ui.theme.DicerollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DicerollerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun DiceRollerApp() {

}

@Composable
fun DiceWithButtonAndImage(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.OnCreate(savedInstanceState)
        setContent {
            DiceRollerTheme {
                DiceRollerApp()

            }
        }
    }
    DicerollerTheme {
        Greeting("Android")
    }
}

@Preview
@Composable
fun DiceRollerApp() {
    DiceWithButtonAndImage(modifier: Modifier = Modifier) {
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
        )
}
    fun DiceWithButtonImage(modifier: Modifier = Modifier) {
        Column (
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally) {}
            Button(onClick = {/*TODO*}) {
            Text(stringResource(R.string.roll))

        }
    }

    val string name="roll">Roll</string>
    Column(
     modifier = modifier,horizontalAlignment.CenterHorizontally
){
    Button(onClick = {/*TODO/}) {
       Text(stringResource(R.string.roll))
    }
}

Image(
   painter = painterResource(R.drawable.dice_1),
   contentDescription = "1"
)
Spacer(modifier = Modifier.height(16.dp))
Button(onClick = { result = (1..6).random() }) {
    Text(stringResource(R.string.roll))

       }
    }
}

val imageResource = when (result) {
    1 -> R.drawable.dice_1
    2 -> R.drawable.dice_2
    3 -> R.drawable.dice_3
    4 -> R.drawable.dice_4
    5 -> R.drawable.dice_5
    else -> R.drawable.dice_6
}
Image(
   painter = painterResource(imageResource),
   contentDescription = result.toString()
)