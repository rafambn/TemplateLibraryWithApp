import androidx.compose.ui.window.ComposeUIViewController
import io.github.rafambn.templatelibrary.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
