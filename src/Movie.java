public class Movie extends Event {
    public Movie(String title, int realseYear, int age) {
        this.title = title;
        this.releaseYear = realseYear;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", realseYear=" + releaseYear +
                ", age=" + age +
                '}';
    }
}
