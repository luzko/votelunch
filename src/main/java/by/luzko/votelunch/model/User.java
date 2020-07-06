package by.luzko.votelunch.model;

import java.util.Set;
import java.util.StringJoiner;

public class User extends AbstractNamedEntity {
    private String email;

    private String password;

    private boolean enabled = true;

    private Set<Role> roles;

    public User(Integer id, String name, String email, String password, boolean enabled, Set<Role> roles) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("email='" + email + "'")
                .add("password='" + password + "'")
                .add("enabled=" + enabled)
                .add("roles=" + roles)
                .add("name='" + name + "'")
                .add("id=" + id)
                .toString();
    }
}
