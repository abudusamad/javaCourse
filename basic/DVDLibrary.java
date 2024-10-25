public class DVDLibrary {
    private DVD[] dvdCollection = new DVD[15];
    
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
        DVD dvd1 = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD dvd2 = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD dvd3 = new DVD("The Avengers", 2012, "Joss Whedon");

        DVDLibrary library = new DVDLibrary();
        library.addDVD(dvd1);
        library.addDVD(dvd2);
        library.addDVD(dvd3);

        library.listDVDs();
    }
    
}
