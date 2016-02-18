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

/**
 * Models a Credit Cart Application
 */
public class CreditCardApplication {
    private String customerId;
    private Integer creditLimit;
    private String cardType;
    private Integer anualFee;

    public CreditCardApplication() {
    }

    public CreditCardApplication(String customerId, Integer creditLimit, String cardType, Integer anualFee) {
        this.customerId = customerId;
        this.creditLimit = creditLimit;
        this.cardType = cardType;
        this.anualFee = anualFee;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Integer getAnualFee() {
        return anualFee;
    }

    public void setAnualFee(Integer anualFee) {
        this.anualFee = anualFee;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof CreditCardApplication) ) return false;

        CreditCardApplication that = (CreditCardApplication) o;

        if ( customerId != null ? !customerId.equals( that.customerId ) : that.customerId != null ) return false;
        if ( creditLimit != null ? !creditLimit.equals( that.creditLimit ) : that.creditLimit != null ) return false;
        if ( cardType != null ? !cardType.equals( that.cardType ) : that.cardType != null ) return false;
        return !(anualFee != null ? !anualFee.equals( that.anualFee ) : that.anualFee != null);

    }

    @Override
    public int hashCode() {
        int result = customerId != null ? customerId.hashCode() : 0;
        result = 31 * result + (creditLimit != null ? creditLimit.hashCode() : 0);
        result = 31 * result + (cardType != null ? cardType.hashCode() : 0);
        result = 31 * result + (anualFee != null ? anualFee.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CreditCardApplication{" +
               "customerId='" + customerId + '\'' +
               ", creditLimit=" + creditLimit +
               ", cardType='" + cardType + '\'' +
               ", anualFee=" + anualFee +
               '}';
    }
}
