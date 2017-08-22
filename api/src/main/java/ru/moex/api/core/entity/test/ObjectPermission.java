package ru.moex.api.core.entity.test;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "OBJECT_PERMISSION", schema = "ICDB", catalog = "")
public class ObjectPermission {
    @Id@GeneratedValue
    private Long id;
    @Basic@Column(name = "ROLE_NAME", nullable = false, length = 100)
    private String roleName;
    @Basic@Column(name = "PERMISSION", nullable = false, length = 500)
    private String permission;
    @Basic@Column(name = "PERMISSION_OLD", nullable = true, length = 500)
    private String permissionOld;
    @ManyToOne@JoinColumn(name = "OBJECT_TYPE", referencedColumnName = "ID")
    private ObjectType objectTypeByObjectType;
    @ManyToOne@JoinColumn(name = "OBJECT_ACTION", referencedColumnName = "ID", nullable = false)
    private ObjectAction objectActionByObjectAction;

}
