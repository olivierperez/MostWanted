package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText

@Composable
fun Explanation01() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """C'est votre premier jour à la CIA, une nouvelle aventure commence ici.
                        Au fur et à mesure de cet atelier vous allez rencontrer des outils que
                        Jetpack Compose met à notre disposition pour réaliser les plus belles
                        applications en Kotlin.
                """
        )
        ExplanationText(
            """Avec Jetpack Compose <b>tout est "Composable</b>" et un Composable
                        est <b>une fonction Kotlin</b> qui porte l'annotation @Composable.
                        On peut le rendre configurable à l'aide de paramètres qu'on passe à lors de l'appel
                        à cette fonction.
                """
        )
        ExplanationText(
            """Un des Composables les plus simples fournits par Jetpack Compose est
                        le <b>Text</b>. Pour commencer votre initiation, quoi de mieux que de faire
                        un magnifique Hello World ? Rendez-vous dans le fichier indiqué et ajoutez-y
                        le code suivant&nbsp;:
                """
        )
        Code("Text(\"Hello World!\")")
    }
}
