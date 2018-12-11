package workshop.mock.testexercise;

import workshop.mock.testexercise.service.GoodDayService;
import workshop.mock.testexercise.service.GreetService;

public class App {

    private GreetService greetService;

    private GoodDayService goodDayService;

    public String greetLowerCase(String name) {

        return greetService.hello(name).toLowerCase();
    }

    public String goodDayUpperCase(String dayOfWeek) {

        return goodDayService.sayGoodDay(dayOfWeek).toUpperCase();
    }
}
