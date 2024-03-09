/*
Every Java-based application has a few objects that work together to present what the end-user
 sees as a working application. When writing a complex Java application,
 application classes should be as independent as possible of other Java classes to increase the
 possibility to reuse these classes and to test them independently of other classes while unit testing.
 Dependency Injection (or sometime called wiring) helps in gluing these classes together and
 at the same time keeping them independent.

Consider you have an application which has a text editor component and you want to provide a spell check.
Your standard code would look something like this −

public class TextEditor {
   private SpellChecker spellChecker;

   public TextEditor() {
      spellChecker = new SpellChecker();
   }
}
What we've done here is, create a dependency between the TextEditor and the SpellChecker.
In an inversion of control scenario, we would instead do something like this −

public class TextEditor {
   private SpellChecker spellChecker;

   public TextEditor(SpellChecker spellChecker) {
      this.spellChecker = spellChecker;
   }
}
Here, the TextEditor should not worry about SpellChecker implementation.
The SpellChecker will be implemented independently and will be provided to the TextEditor at the time of TextEditor
instantiation. This entire procedure is controlled by the Spring Framework.

Here, we have removed total control from the TextEditor and kept it somewhere else (i.e. XML configuration file) and
the dependency (i.e. class SpellChecker) is being injected into the class TextEditor through a Class Constructor.
Thus the flow of control has been "inverted" by Dependency Injection (DI) because you have effectively delegated dependances
to some external system.

The second method of injecting dependency is through Setter Methods of the TextEditor class where we will create a
SpellChecker instance. This instance will be used to call setter methods to initialize TextEditor's properties.

Thus, DI exists in two major variants and the following two sub-chapters will cover both of them with examples −

Sr.No.	Dependency Injection Type & Description
1	    Constructor-based dependency injection
        Constructor-based DI is accomplished when the container invokes a class constructor with a number of arguments,
        each representing a dependency on the other class.

2	    Setter-based dependency injection
        Setter-based DI is accomplished by the container calling setter methods on your beans after invoking a no-argument
        constructor or no-argument static factory method to instantiate your bean.
*/
interface MessageService{
    String getMessage();
}
class EmailService implements MessageService{
    @Override
    public String getMessage(){
        return "Email Message";
    }
}

class MessageProcessor{
    private final MessageService messageService;

    // constructor injection
    public MessageProcessor(MessageService messageService){
        this.messageService=messageService;
    }
    public void processMessage(){
        String message= messageService.getMessage();
        System.out.println("Processing Message : "+message);
    }
}
public class Dependency_program {
    public static void main(String[] args) {
        // create an instance of message service -Dependency
        MessageService emailService = new EmailService();

        // Injecting the dependency into MessageProcessor
        MessageProcessor messageProcessor = new MessageProcessor(emailService);
        
        //performing messageProcessing
        messageProcessor.processMessage();
    }
}
