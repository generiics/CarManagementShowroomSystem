import java.io.IOException;

public class VoiceAssistant {

    public static void speak(String text) {

        String command =
                "PowerShell -Command \"Add-Type -AssemblyName System.Speech; " +
                        "(New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('" +
                        text + "')\"";

        try {
            Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}