/*
 * This file is generated by jOOQ.
 */
package by.bntu.fitr.authenticationservice.dao.jooq.tables.entity;


import java.io.Serializable;
import java.time.OffsetDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private OffsetDateTime createAt;

    public Permission() {
    }

    public Permission(Permission value) {
        this.id = value.id;
        this.name = value.name;
        this.createAt = value.createAt;
    }

    public Permission(
            Long id,
            String name,
            OffsetDateTime createAt
    ) {
        this.id = id;
        this.name = name;
        this.createAt = createAt;
    }

    /**
     * Getter for <code>public.permission.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.permission.id</code>.
     */
    public Permission setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>public.permission.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>public.permission.name</code>.
     */
    public Permission setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>public.permission.create_at</code>.
     */
    public OffsetDateTime getCreateAt() {
        return this.createAt;
    }

    /**
     * Setter for <code>public.permission.create_at</code>.
     */
    public Permission setCreateAt(OffsetDateTime createAt) {
        this.createAt = createAt;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Permission other = (Permission) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (createAt == null) {
            if (other.createAt != null)
                return false;
        } else if (!createAt.equals(other.createAt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.createAt == null) ? 0 : this.createAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Permission (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(createAt);

        sb.append(")");
        return sb.toString();
    }
}
