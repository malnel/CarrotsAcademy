import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Main {

    public static void main(String[] args) {

    }
}


//TODO 1 własna adnotacja
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Wstrzyknij{

}