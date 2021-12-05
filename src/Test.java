public class Test {
    public static void main(String[] args) {
        for (Event event : getMovies()) {
            try {
                validateEvent(event);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
            for (Event event1 : getTheatre()) {
                try {
                    validateEvent(event);
                } catch (RuntimeException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Программа успешно работает");
    }


    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 18),
                new Movie("Малыш на драйве", 2015, 18),
                new Movie("Титаник", 2005, 18)
        };
    }

    public static Theatre[] getTheatre() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2018, 14),
                new Theatre("Театр", 2007, 14)
        };
    }

    public static void validateEvent(Event event) throws RuntimeException {
        if (event.getAge() == 0 || event.getReleaseYear() == 0) {
            throw new RuntimeException("Возраст не правильно");
        } else if (event.getTitle() == null) {
            throw new RuntimeException("Название мероприятия не правильно");
        }
    }
}
