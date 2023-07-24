package org.example;

public abstract sealed class Department permits AccountingDept, ComputerEngineerDept, SocialCareDept, SoftwareEngineeringDept {
}

final class ComputerEngineerDept extends Department {
    public void compEng(){
        System.out.println("Custom Computer Engineering");
    }

    @Override
    public String toString() {
        return "Software Engineering";
    }
}

final class SocialCareDept extends Department {
    public void socialCare(){
        System.out.println("Custom social care");
    }

    @Override
    public String toString() {
        return "Social Care";
    }
}

final class AccountingDept extends Department {
    public void accounting() {
        System.out.println("Custom accounting");
    }

    @Override
    public String toString() {
        return "Accounting";
    }
    }

final class SoftwareEngineeringDept extends Department {
    public void swEng() {
        System.out.println("Custom software engineering");
    }

    @Override
    public String toString() {
        return "Software Engineering";
    }
}
