package enteties;

import java.util.Objects;

public class Company {

    private long id;
    private String name;
    private String password;

    public Company(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Company(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) &&
                Objects.equals(password, company.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }
}
