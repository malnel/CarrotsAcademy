package workshop.mock.testexercise.service;

public class GoodDayService {

    private String defaultGoodDay = "Have a good day!";

    public String sayGoodDay(String dayOfWeek) {
        return dayOfWeek == null ? defaultGoodDay : "Have a good " + dayOfWeek;
    }
}
