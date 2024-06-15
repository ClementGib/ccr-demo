package com.cdx.ccr.core.deal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Deal implements Serializable {
    private double amount;
    private String baselMaturity;
    private String legalEntity;
    private String currency;
}
