package com.ics.one.mock;

public class Attachment {
    private Long StudentId;
    private Long companyId;

    public Attachment(Long studentId, Long companyId) {
        StudentId = studentId;
        this.companyId = companyId;
    }

    public Long getStudentId() {
        return StudentId;
    }

    public void setStudentId(Long studentId) {
        StudentId = studentId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
