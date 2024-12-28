package br.com.duda.alcoolOuGasolina

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.tooling.preview.Preview
import br.com.duda.alcoolOuGasolina.ui.theme.AlcoolOuGasolinaTheme
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Essa função enableEdgeToEdge() diz que a tela d aplicativo pode ocupar a tela toda(cobre a notificação)
        setContent {
            AlcoolOuGasolinaTheme {
                App();
            }
        }
    }
}

@Composable
fun App() {
    var valor_gasolina = remember {
        mutableStateOf("")
    }
    // O by serve para trabalharmos direto com o valor que colocamos, não precisando referenciar o .value da variável quando formos usa-la
    var valor_alcool by remember {
        mutableStateOf("")
    }

    var alcool_ou_gasolina = ""
    if (valor_alcool.isNotBlank() && valor_gasolina.value.isNotBlank()){
        var  expressao_gasolina = valor_alcool.toDouble() / valor_gasolina.value.toDouble() > 0.7
        alcool_ou_gasolina = if (expressao_gasolina) {
            "Gasolina"
        } else {
            "Álcool"
        }

    }

    // Box é como o display flex (tudo inline, na mesma linha) e as coisas ficam uma em cima da outra
//    Box(){
//        Text(text = "Álccol ou Gasolina");
//        Text(text = "Gasolina");
//    }
    //Column é como o display block (cada um no seu quadrado)
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color(0xFFAD4FFF)),
        // Arrangement.Center -> Alinha nossos componentes no centro da tela, levando em conta a altura
        verticalArrangement = Arrangement.Center,
        // Alignment.CenterHorizontally
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Álccol ou Gasolina?",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
            );
            // Caso não quiséssemos  que os elementos tivessem o mesmo espaçamento entre si poderiams dar espaçamentos personalizados usando o Spacer
            // Spacer(modifier = Modifier.size(16.dp))



            Text(
                text = alcool_ou_gasolina,
                style = TextStyle(
                    color = Color.Red,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold,
                    shadow = Shadow(
                        color = Color.Black,
                        offset = Offset(2f, 2f),
                        blurRadius = 4f
                    )
                )
            );

            TextField(
                value = valor_gasolina.value,
                onValueChange = { novo_valor ->
                    valor_gasolina.value = novo_valor.replace(",", ".")
                },
                label = {
                    Text(text = "Gasolina")
                },
                // Com essas linhas abaixo estou limitando apenas o teclado numérico aparecer quando clico no input
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            );


            TextField(
                value = valor_alcool,
                onValueChange = {
                    valor_alcool = it.replace(",", ".")
                },
                label = {
                    Text(text = "Álcool")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                )
            );
        }
    }
    // Row é muito parecido com o box, mas, apesas das frases ficarem na mesma linha elas não se sobrepoem
//    Row {
//        Text(text = "Álccol ou Gasolina");
//        Text(text = "Gasolina");
//    }
}

@Preview
@Composable
fun AppPreview() {
    AlcoolOuGasolinaTheme {
        App()
    }
}