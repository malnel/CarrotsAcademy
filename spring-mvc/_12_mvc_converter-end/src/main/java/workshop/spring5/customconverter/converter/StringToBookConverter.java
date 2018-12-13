package workshop.spring5.customconverter.converter;

import org.springframework.core.convert.converter.Converter;
import workshop.spring5.customconverter.model.Book;

public class StringToBookConverter implements Converter<String, Book> {
    @Override
    public Book convert(String s) {
        String [] data = s.split(",");
        return new Book(data[0], data[1]);
    }
}
