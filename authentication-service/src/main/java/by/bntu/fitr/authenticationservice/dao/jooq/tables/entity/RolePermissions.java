/*
 * This file is generated by jOOQ.
 */
package by.bntu.fitr.authenticationservice.dao.jooq.tables.entity;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class RolePermissions implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer roleId;
    private Integer permissionId;

    public RolePermissions() {
    }

    public RolePermissions(RolePermissions value) {
        this.roleId = value.roleId;
        this.permissionId = value.permissionId;
    }

    public RolePermissions(
            Integer roleId,
            Integer permissionId
    ) {
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    /**
     * Getter for <code>public.role_permissions.role_id</code>.
     */
    public Integer getRoleId() {
        return this.roleId;
    }

    /**
     * Setter for <code>public.role_permissions.role_id</code>.
     */
    public RolePermissions setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Getter for <code>public.role_permissions.permission_id</code>.
     */
    public Integer getPermissionId() {
        return this.permissionId;
    }

    /**
     * Setter for <code>public.role_permissions.permission_id</code>.
     */
    public RolePermissions setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
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
        final RolePermissions other = (RolePermissions) obj;
        if (roleId == null) {
            if (other.roleId != null)
                return false;
        } else if (!roleId.equals(other.roleId))
            return false;
        if (permissionId == null) {
            if (other.permissionId != null)
                return false;
        } else if (!permissionId.equals(other.permissionId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.roleId == null) ? 0 : this.roleId.hashCode());
        result = prime * result + ((this.permissionId == null) ? 0 : this.permissionId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RolePermissions (");

        sb.append(roleId);
        sb.append(", ").append(permissionId);

        sb.append(")");
        return sb.toString();
    }
}
