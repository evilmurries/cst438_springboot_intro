package cst438;

import javax.validation.constraints.NotNull;
import javax.persistence.*;
import javax.validation.constraints.Size;

/*
 * One object of class Person represents a human being.
 */
@Entity
public class Person
{

   @Id
   @GeneratedValue
   private long id;
   
   @NotNull
   @Size(min=3, max=25)
   private String firstName;
   
   @NotNull
   @Size(min=3, max=25)
   private String lastName;
 
   @NotNull
   @Size(min=3, max=25)
   private String favoriteFood;
   
   /*
    * Default constructor method for the Person.
    */
   public Person() {
      firstName = null;
      lastName = null;
      favoriteFood = null;
   }
   
   /*
    * Constructor method for the Person.
    */
   public Person(long id, String firstName, String lastName, 
         String favoriteFood) {
      super();
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.favoriteFood = favoriteFood;
   }
   
   /*
    * This method receives a long integer and sets it as the id for 
    * the Person.
    */
   public void setId(long newId) {
      this.id = newId;
   }
   
   /*
    * This method returns the Id for the Person.
    */
   public long getId() {
      return this.id;
   }
   
   /*
    * This method returns the first name string of the Person.
    */
   public String getFirstName() {
      return this.firstName;
   }
   
   /*
    * This method receives a first name as a string and sets it for
    * the Person.
    */
   public void setFirstName(String newName) {
      this.firstName = newName;
   }
   
   /*
    * This method returns a string that represents the last name for the
    * Person.
    */
   public String getLastName() {
      return this.lastName;
   }
   
   /*
    * This method returns a string last name for the Person.
    */
   public void setLastName(String newName) {
      this.lastName = newName;
   }
   
   /*
    * This method returns the favorite food for the Person in string form.
    */
   public String getFavoriteFood() {
      return this.favoriteFood;
   }
   
   /*
    * This method receives a favorite food as a string and sets it for
    * the Person.
    */
   public void setfavoriteFood(String favFood) {
      this.favoriteFood = favFood;
   }
}
