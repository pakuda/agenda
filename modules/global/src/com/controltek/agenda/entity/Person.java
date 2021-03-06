/*un comentario*/
package com.controltek.agenda.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import org.hibernate.validator.constraints.Email;

@NamePattern("%s %s|name,email")
@Table(name = "AGENDA_PERSON")
@Entity(name = "agenda$Person")
public class Person extends StandardEntity {
    private static final long serialVersionUID = -5054014279744398120L;

    @Column(name = "NAME")
    protected String name;

    @Email
    @Column(name = "EMAIL")
    protected String email;

    @Column(name = "PICTURE_FILE")
    protected String pictureFile;

    @Column(name = "PHONE", length = 20)
    protected String phone;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPictureFile(String pictureFile) {
        this.pictureFile = pictureFile;
    }

    public String getPictureFile() {
        return pictureFile;
    }


}
