/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Song
{
  //Objects, therefore mutated if ref changes
  private String title;
  private double duration;
  //Can only mutate by value
  private int rating;
  
  /*** Constructor ****/
  public Song(String t, double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", duration is " + duration + " minutes";
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Song s)
  {
    if (s == null){
        return false;
    }
    return this.title.equals(s.title) && this.duration == s.duration;
  }


  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }
  public void setDuration(double d) {
    duration = d;
  }
  public void adjustRating(int change)
  {
    int newRating = rating + change;

    if (newRating >= 0 && newRating <= 10) {
      rating = newRating;
    }
  }

  /*
  * Set Rating
  *@param int rating = number between 0 and 10
  *PostCondition: Rating attribute will be an integer
  *PreCondition: Object cannot be null
  */
  public void setRating(int r){
    rating = r;
  }
}
