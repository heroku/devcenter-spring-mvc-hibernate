package com.springsource.petclinic.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public abstract class AbstractPerson {

    /**
     */
    @Size(min = 3, max = 30)
    private String firstName;

    /**
     */
    @NotNull
    @Size(min = 3, max = 30)
    private String lastName;

    /**
     */
    @NotNull
    @Size(min = 1, max = 50)
    private String address;

    /**
     */
    @NotNull
    @Size(max = 30)
    private String city;

    /**
     */
    @NotNull
    private String telephone;

    /**
     */
    @Size(max = 30)
    private String homePage;

    /**
     */
    @Size(min = 6, max = 30)
    private String email;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date birthDay;
}
