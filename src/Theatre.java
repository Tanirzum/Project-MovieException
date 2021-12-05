public class Theatre extends Event {
    public Theatre(String title, int realseYear, int age) {
        this.title = title;
        this.releaseYear = realseYear;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "title='" + title + '\'' +
                ", realseYear=" + releaseYear +
                ", age=" + age +
                '}';
    }
}
