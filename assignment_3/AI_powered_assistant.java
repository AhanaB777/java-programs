/* 6. AI-Powered Assistant 
A company is developing an AI-powered Virtual Assistant that can both speak and translate languages. 
- Define an interface Speaker with a method speak(String text). 
- Define another interface Translator with a method translate(String text, String language). 
- Implement a class AIAssistant that inherits both interfaces and provides implementations for speech 
synthesis and language translation. 
Task: Implement the system and demonstrate how an AI Assistant can both speak and translate text. */

package assignment_3;

interface Speaker {
    void speak(String text);
}

interface Translator {
    void translate(String text, String language);
}

class AIAssistant implements Speaker, Translator {
    public void speak(String text) {
        System.out.println("AI Assistant speaks: " + text);
    }

    public void translate(String text, String language) {
        System.out.println("AI Assistant translates '" + text + "' to " + language + " language");
    }
}

public class AI_powered_assistant {
    public static void main(String[] args) {
        AIAssistant t1 = new AIAssistant();
        t1.speak("Hello! How are you?");
        t1.translate("Bonjour! Comment ca va?", "English");
    }
}
