package com.mts.finances.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "launch", schema = "finances")
@Builder
@Data
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

    public LaunchModel() {
        
    }
}
