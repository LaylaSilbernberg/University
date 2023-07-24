package org.example;

public class University {
    public static void main(String[] args) {
        //LecturerRecord faultyNameRecord = new LecturerRecord("", 22, new EngineeringFaculty(), new SoftwareEngineeringDept());
        //LecturerRecord faultyAgeRecord = new LecturerRecord("Layla Silbernberg", -30, new EngineeringFaculty(), new SoftwareEngineeringDept());

        LecturerRecord janeBloggs = new LecturerRecord("Jane Bloggs",
                24,
                new EngineeringFaculty(),
                new SoftwareEngineeringDept());
        System.out.println(janeBloggs);

        janeBloggs.whichFaculty();
        janeBloggs.whichDept();
        System.out.println(janeBloggs.hasPhd());

        LecturerRecord anneBloggs = new LecturerRecord("Dr. Anne Bloggs",
                35,
                new BusinessFaculty(),
                new AccountingDept());
        System.out.println(anneBloggs.toString());
        System.out.println(anneBloggs.hasPhd() ? "Anne has a PhD" : "Anne does not have a PhD");

        LecturerRecord joeBloggs = new LecturerRecord("Joe Bloggs PhD",
                54,
                new HumanitiesFaculty(),
                new SocialCareDept());

        System.out.println(joeBloggs);
        System.out.println(joeBloggs.hasPhd() ? "Joe has a PhD" : "Joe does not have a PhD");
    }
}