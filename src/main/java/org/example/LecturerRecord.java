package org.example;

public final record LecturerRecord(String name,
                                   Integer age,
                                   Faculty faculty,
                                   Department department) {

    public LecturerRecord {
        String errorMsg = """
                Illegal argument passed:
                "name": %s,
                "age": %s
                """.formatted(name, age);

        if (name.isBlank() || age < 0) {
            throw new IllegalArgumentException(errorMsg);
        }
    }


    public boolean hasPhd(){
        String prefix = this.name.substring(0, 3);
        String suffix = this.name.substring(this.name.length()-3);

        return switch (prefix) {
            case "Dr." -> true;
            default -> switch (suffix){
                case "PhD" -> true;
                default -> false;
            };
        };
    }

    public void whichFaculty(){
        Faculty faculty = this.faculty;

        switch(faculty){
            case EngineeringFaculty e -> {
                System.out.printf("Faculty of: %s%n", e.toString());
                e.engineering();
            }
            case HumanitiesFaculty h -> {
                System.out.printf("Faculty of: %s%n", h.toString());
                h.humanities();
            }
            case BusinessFaculty b -> {
                System.out.printf("Faculty of: %s%n", b.toString());
                b.business();
            }
            default -> throw new IllegalArgumentException(faculty.toString());
        }
    }

    public void whichDept(){
        Department department = this.department;

        switch (department){
            case ComputerEngineerDept ced -> {
                System.out.printf("Dept of: %s%n", ced.toString());
                ced.compEng();
            }

            case SoftwareEngineeringDept sed -> {
                System.out.printf("Dept of: %s%n", sed.toString());
                sed.swEng();
            }

            case SocialCareDept scd -> {
                System.out.printf("Dept of: %s%n", scd.toString());
                scd.socialCare();
            }

            case AccountingDept ad -> {
                System.out.printf("Dept of: %s%n", ad.toString());
                ad.accounting();
            }
        }
    }
}
