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
 * A customer entity
 */
public class Customer {
    private String id;
    private String name;
    private Integer age;
    private Integer income;
    private Integer creditScore;

    public Customer() {
    }

    public Customer(String id, String name, Integer age, Integer income, Integer creditScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.income = income;
        this.creditScore = creditScore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Customer) ) return false;

        Customer customer = (Customer) o;

        if ( id != null ? !id.equals( customer.id ) : customer.id != null ) return false;
        if ( name != null ? !name.equals( customer.name ) : customer.name != null ) return false;
        if ( age != null ? !age.equals( customer.age ) : customer.age != null ) return false;
        if ( income != null ? !income.equals( customer.income ) : customer.income != null ) return false;
        return !(creditScore != null ? !creditScore.equals( customer.creditScore ) : customer.creditScore != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (income != null ? income.hashCode() : 0);
        result = 31 * result + (creditScore != null ? creditScore.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", income=" + income +
               ", creditScore=" + creditScore +
               '}';
    }
}
