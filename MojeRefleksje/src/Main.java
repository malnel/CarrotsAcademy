import java.lang.annotation.*;
import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {

    }
}


// TODO 1 własna adnotacja
@Target(ElementType.FIELD) //tutaj definiuje jakiego elementu moze dotyczyc moja wlasna adnotacja
@Retention(RetentionPolicy.RUNTIME)
@interface Wstrzyknij{

}


// TODO 2 klasa obiektu do wstrzykiwania (ten obiekt bede wstrzykiwac do innej klasy)
class Collaborator {
    private String name;

    public Collaborator(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Collaborator{" +
                "name='" + name + '\'' +
                '}';
    }
}

// TODO 3 Klasa z polami typu Collaborator
class UseCollaborator {

    @Wstrzyknij
    private Collaborator collaboratorWithAnnotation;

    @Wstrzyknij
    private Collaborator collaborator;

    @Override
    public String toString() {
        return "UseCollaborator{" +
                "collaboratorWithAnnotation=" + collaboratorWithAnnotation +
                ", collaborator=" + collaborator +
                '}';
    }
}

class Kontener {
    static void wstrzyknij(Object target, String name) throws IllegalAccessException {

        // TODO 4 pobierz pola obiektu i przeiteruj po nich
        Field[] declaredFields = target.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            // TODO 5 pobierz adnotacje pola i przeiteruje po nich
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                // TODO 6 utwórz instancję Collaborator i przypisz pola z adnotacją wstrzyknij
                Collaborator collaborator = new Collaborator(name);
                if ("Wstrzyknij".equals(annotation.annotationType().getName())) {
                    field.set(target, new Collaborator("Wstrzyknięty collaborator"));
                }
            }
        }
    }
}