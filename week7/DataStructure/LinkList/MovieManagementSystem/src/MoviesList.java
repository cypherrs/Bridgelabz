class MoviesList {
    private Movie head;
    private Movie tail;

    public void addAtBegining(String title, String director, int year, int rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;

        }

    }

    public void addAtEnd(String title, String director, int year, int rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
        System.out.println("movie added at the end..");
    }

    public void addAtPosition(int position, String title, String director, int year, int rating) {
        if (position <= 0) {
            System.out.println("Invalid position..!");
            return;
        }
        if (position == 1) {
            addAtBegining(title, director, year, rating);
            return;
        }

        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bound..");
            return;
        }

        newMovie.next = temp.next;
        newMovie.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newMovie;
        }
        temp.next = newMovie;

        if (newMovie.next == null) {
            tail = newMovie;
        }
        System.out.println("Movies added at position " + position);
    }

    public void removeByTitle(String title) {
        Movie temp = head;

        while (temp != null && temp.title != title) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movies not found..");
            return;
        }

        if (temp == head) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (temp == tail) {
            tail = temp.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        System.out.println("Movie : " + title + " removed..");
    }

    public void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println("Found: " + temp.title + " (Year: " + temp.year + ", Rating: " + temp.rating + ")");
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found by this director.");
        }
    }

    public void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Found: " + temp.title + " (Director: " + temp.director + ", Year: " + temp.year + ")");
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with this rating.");
        }
    }

    public void updateRating(String title, int newRating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.println("Old Rating: " + temp.rating);
                temp.rating = newRating;
                System.out.println("Updated Rating: " + temp.rating);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found.");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("No movies found.");
            return;
        }

        Movie temp = head;
        System.out.println("\nMovies (Forward Order):");
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies found.");
            return;
        }

        Movie temp = tail;
        System.out.println("\nMovies (Reverse Order):");
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | Rating: " + temp.rating);
            temp = temp.prev;
        }
    }


}
