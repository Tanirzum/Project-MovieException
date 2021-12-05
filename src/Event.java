public abstract class Event {
    String title;
    int releaseYear;
    int age;

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", realseYear=" + releaseYear +
                ", age=" + age +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAge() {
        return age;
    }
}
