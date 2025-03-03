package m.k.a

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import ataturk.composeapp.generated.resources.*
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.getString
import org.jetbrains.compose.resources.painterResource

@Composable
fun app() {
    val boldText by produceState(initialValue = "") {
        value = getString(Res.string.bold_text)
    }
    val italicText by produceState(initialValue = "") {
        value = getString(Res.string.italic_text)
    }

    val fantasyFontFamily =
        FontFamily(
            Font(Res.font.FantasqueSansMono_Regular, FontWeight.Normal),
            Font(Res.font.FantasqueSansMono_Bold, FontWeight.Bold),
            Font(Res.font.FantasqueSansMono_Italic, FontWeight.Normal, FontStyle.Italic),
            Font(Res.font.FantasqueSansMono_BoldItalic, weight = FontWeight.Bold, FontStyle.Italic),
        )

    MaterialTheme {
        Row {
            Text(text = boldText, fontFamily = fantasyFontFamily, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.size(100.dp))
            Column {
                Text(text = italicText, fontFamily = fantasyFontFamily, fontStyle = FontStyle.Italic)
                Image(
                    painter = painterResource(Res.drawable.compose_multiplatform),
                    contentDescription = "Debee",
                )
            }
        }
    }
}
