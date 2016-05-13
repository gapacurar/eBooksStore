/*
 * copyright a-sti.ro
 */
package unittesting;

import java.util.Objects;

/**
 *
 * @author gheorgheaurelpacurar
 */
public final class User {
    
    /** user unique ID */ 
    int ID;
    /** first name of user */
    String firstName;
    /** middle name of user*/
    String middleName;
    /** last name of user */
    String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    User(String fN, String mN, String lN){
        ID = this.hashCode();
        firstName = fN;
        middleName = mN;
        lastName = lN;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getID() {
        return ID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.firstName);
        hash = 29 * hash + Objects.hashCode(this.middleName);
        hash = 29 * hash + Objects.hashCode(this.lastName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        return Objects.equals(this.ID, other.ID);
    }
}
