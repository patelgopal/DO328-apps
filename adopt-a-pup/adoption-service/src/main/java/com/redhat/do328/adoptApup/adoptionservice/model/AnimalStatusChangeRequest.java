package com.redhat.do328.adoptApup.adoptionservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AnimalStatusChangeRequest {
    private boolean newAdoptableStatus;
}
