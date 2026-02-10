/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  public static String owner = "PLTW";
  private static int numEntries;
  private Book book;
  private Movie movie;
  private Song song;
  private static int numBooks;
  private static int numMovies;
  private static int numSongs;

  public void addBook(Book b)
  {
    if (book == null){
      book = b;
      numEntries++;
      numBooks++;
    }
    else{
      System.out.println("Cannot add a new book. This book already exists.");
    }
  }

  public void addMovie(Movie m)
  {
    if (movie == null){
      movie = m;
      numEntries++;
      numMovies++;
    }
    else{
      System.out.println("Cannot add a new movie. This movie already exists.");
    }
  }

  public void addSong(Song s)
  {
    if (song == null){
      song = s;
      numEntries++;
      numSongs++;
    }
    else{
      System.out.println("Cannot add a new song. This song already exists.");
    }
  }

  public Book getBook()
  {
  return book;
  }


/*Modify toString to show the state
* of the library
* @precondition MediaLib not null
*
*/

  public static int getNumEntries(){
    return numEntries;
    //System.out.println("Test: Owner is " + owner); -> WHY DOESNT THIS WORK? owner is static, so it should be accessible here, right?
    //System.out.println(book);
    //System.out.println(movie);
    //System.out.println("Test: MediaLib is " + this.book);
  }


  public String toString()
  {
    String info = "";

    if (book == null) {
      info += "Book: none\n";
    } 
    else {
      info += "Book: " + book + "\n";
    }

    if (movie == null) {
      info += "Movie: none";
    } 
    else {
      info += "Movie: " + movie;
    }
    if (song == null) {
      info += "\nSong: none";
    } 
    else {
      info += "\nSong: " + song;
    }

    return info;
  }

  public void testBook(Book tester)
  {
    tester.setTitle("TEST TITLE");
    System.out.println("Inside testBook: " + tester);
  }

  public static String getOwner(){
    return owner;
  }

  public static void changeOwner(String o){
    //this.owner = owner; -> why doesnt "this" method work?
    owner = o;
  }

  public static int getNumBooks(){
    return numBooks;
  }
  public static int getNumMovies(){
    return numMovies;
  }
  public static int getNumSongs(){
    return numSongs;
  }
}
