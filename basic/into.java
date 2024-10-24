DVD[] dvdCollection = new DVD[15];

public class DVD {
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }
}

public void addDVD(DVD newDVD) {
    for (int i = 0; i < dvdCollection.length; i++) {
        if (dvdCollection[i] == null) {
            dvdCollection[i] = newDVD;
            break;
        }
    }
}

public void listDVDs() {
    for (DVD dvd : dvdCollection) {
        if (dvd != null) {
            System.out.println(dvd);
        }
    }
}

public static void main(String[] args) {
    DVD dvd1 = new DVD("The Godfather", 1972, "Francis Ford Coppola");
    DVD dvd2 = new DVD("The Dark Knight", 2008, "Christopher Nolan");
    DVD dvd3 = new DVD("Star Wars: Episode IV - A New Hope", 1977, "George Lucas");

    DVDLibrary dvdLibrary = new DVDLibrary();
    dvdLibrary.addDVD(dvd1);
    dvdLibrary.addDVD(dvd2);
    dvdLibrary.addDVD(dvd3);

    dvdLibrary.listDVDs();
}