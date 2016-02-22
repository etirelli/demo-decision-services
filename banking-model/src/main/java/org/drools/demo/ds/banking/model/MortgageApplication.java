/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.demo.ds.banking.model;

import org.kie.api.definition.type.PropertyReactive;

/**
 * Models a mortgage application
 */
@PropertyReactive
public class MortgageApplication {
    private String customerId;
    private Integer amount;
    private Integer amortization;
    private Double interestRate;
    private boolean approved;

    public MortgageApplication() {
    }

    public MortgageApplication(String customerId, Integer amount, Integer amortization, Double interestRate) {
        this.customerId = customerId;
        this.amount = amount;
        this.amortization = amortization;
        this.interestRate = interestRate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmortization() {
        return amortization;
    }

    public void setAmortization(Integer amortization) {
        this.amortization = amortization;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof MortgageApplication) ) return false;

        MortgageApplication that = (MortgageApplication) o;

        if ( approved != that.approved ) return false;
        if ( customerId != null ? !customerId.equals( that.customerId ) : that.customerId != null ) return false;
        if ( amount != null ? !amount.equals( that.amount ) : that.amount != null ) return false;
        if ( amortization != null ? !amortization.equals( that.amortization ) : that.amortization != null ) return false;
        return !(interestRate != null ? !interestRate.equals( that.interestRate ) : that.interestRate != null);

    }

    @Override
    public int hashCode() {
        int result = customerId != null ? customerId.hashCode() : 0;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (amortization != null ? amortization.hashCode() : 0);
        result = 31 * result + (interestRate != null ? interestRate.hashCode() : 0);
        result = 31 * result + (approved ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MortgageApplication{" +
               "customerId='" + customerId + '\'' +
               ", amount=" + amount +
               ", amortization=" + amortization +
               ", interestRate=" + interestRate +
               ", approved=" + approved +
               '}';
    }
}
