import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!(object instanceof Author)) {
            return false;
        }
        Author that = (Author) object;
        return this.firstName.equals(that.firstName) && this.lastName.equals(that.lastName);
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

