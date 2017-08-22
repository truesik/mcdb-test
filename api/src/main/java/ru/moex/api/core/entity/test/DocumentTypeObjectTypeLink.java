package ru.moex.api.core.entity.test;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "DOCUMENT_TYPE_OBJECT_TYPE_LINK", schema = "ICDB", catalog = "")
public class DocumentTypeObjectTypeLink {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "IN_LIST", nullable = true, precision = 0)
    private Boolean inList;
    @Basic@Column(name = "REQUIRED", nullable = true, precision = 0)
    private Boolean required;
    @Basic@Column(name = "MULTIPLE", nullable = true, precision = 0)
    private Boolean multiple;
    @Basic@Column(name = "AUTOMATIC", nullable = true, precision = 0)
    private Boolean automatic;
    @Basic@Column(name = "OBJECT_REQUEST", nullable = true)
    private String objectRequest;
    @Basic@Column(name = "ORDER_STATE", nullable = true, precision = 0)
    private Long orderState;
    @Basic@Column(name = "ACTUAL", nullable = true, precision = 0)
    private Boolean actual;
    @ManyToOne@JoinColumn(name = "DOCUMENT_TYPE", referencedColumnName = "ID", nullable = false)
    private DocumentType documentTypeByDocumentType;
    @ManyToOne@JoinColumn(name = "OBJECT_DISPLAY", referencedColumnName = "ID", nullable = false)
    private Property propertyByObjectDisplay;

}
