package com.mts.finances.models;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "launch", schema = "finances")
public class LaunchModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "month")
    private String month;

    @Column(name = "year")
    private Integer year;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;

    @Column(name = "value")
    private BigDecimal value;
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    @Column(name = "registration_date")
    private LocalDate registrationDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LaunchModel that = (LaunchModel) o;
        return Objects
                .equals(id, that.id) && Objects
                .equals(month, that.month) && Objects
                .equals(year, that.year) && Objects
                .equals(user, that.user) && Objects
                .equals(value, that.value) && Objects
                .equals(registrationDate, that.registrationDate);
    }

    @Override
    public String toString() {
        return "LaunchModel{" +
                "id=" + id +
                ", month='" + month + '\'' +
                ", year=" + year +
                ", user=" + user +
                ", value=" + value +
                ", registrationDate=" + registrationDate +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, month, year, user, value, registrationDate);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
