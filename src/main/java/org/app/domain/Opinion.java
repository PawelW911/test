package org.app.domain;

import lombok.*;
import org.app.infrastructure.database.entity.CustomerEntity;

import java.time.OffsetDateTime;

@With
@Value
@Builder
@EqualsAndHashCode(of = "opinionId")
@ToString(of = {"opinionId", "text", "stars", "dateTime", "customer"})
public class Opinion {

    Integer opinionId;
    String text;
    Integer stars;
    OffsetDateTime dateTime;
    CustomerEntity customer;
}
