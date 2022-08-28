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

    @Column(name = "description")
    private String description;

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

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private LaunchType type;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private LaunchStatus status;

    @Override
    public String toString() {
        return "LaunchModel{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", month='" + month + '\'' +
                ", year=" + year +
                ", user=" + user +
                ", value=" + value +
                ", registrationDate=" + registrationDate +
                ", type=" + type +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LaunchModel that = (LaunchModel) o;
        return Objects
                .equals(id, that.id) && Objects
                .equals(description, that.description) && Objects
                .equals(month, that.month) && Objects
                .equals(year, that.year) && Objects
                .equals(user, that.user) && Objects
                .equals(value, that.value) && Objects
                .equals(registrationDate, that.registrationDate) &&
                    type == that.type && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, month, year, user, value, registrationDate, type, status);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public LaunchType getType() {
        return type;
    }

    public void setType(LaunchType type) {
        this.type = type;
    }

    public LaunchStatus getStatus() {
        return status;
    }

    public void setStatus(LaunchStatus status) {
        this.status = status;
    }
}
