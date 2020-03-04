package cst438;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person
{

   @NotNull
   @Size(min=3, max=25)
   private String firstName;
   
   @NotNull
   @Size(min=3, max=25)
   private String lastName;
 
   @NotNull
   @Size(min=3, max=25)
   private String favoriteFood;
   
   public Person() {
      firstName = null;
      lastName = null;
      favoriteFood = null;
   }
   
   public Person(String firstName, String lastName, String favoriteFood) {
      super();
      this.firstName = firstName;
      this.lastName = lastName;
      this.favoriteFood = favoriteFood;
   }
   
   public String getFirstName() {
      return this.firstName;
   }
   
   public void setFirstName(String newName) {
      this.firstName = newName;
   }
   
   public String getLastName() {
      return this.lastName;
   }
   
   public void setLastName(String newName) {
      this.lastName = newName;
   }
   
   public String getFavoriteFood() {
      return this.favoriteFood;
   }
   
   public void setfavoriteFood(String favFood) {
      this.favoriteFood = favFood;
   }
}
