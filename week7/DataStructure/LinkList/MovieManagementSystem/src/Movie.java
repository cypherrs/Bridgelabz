class Movie {
    String title;
    String director;
    int year;
    int rating;

    Movie next;
    Movie prev;

    public Movie(String title, String director, int year, int rating) {
        this.director = director;
        this.title = title;
        this.year = year;
        this.rating = rating;

        this.next = null;
        this.prev = null;
    }
}
