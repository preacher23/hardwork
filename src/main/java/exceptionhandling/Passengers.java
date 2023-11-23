package exceptionhandling;

public class Passengers {
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String firstname;
    String lastname;
    int id;

    @Override
    public boolean equals(Object obj) {
        Passengers passengers=(Passengers) obj;
        if (passengers.getId()==this.id&&passengers.getLastname()==this.lastname&&passengers.getFirstname()==this.lastname){
            return true;
        }
        return false;
    }
}
