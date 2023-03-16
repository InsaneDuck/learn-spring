package dev.insaneduck.springboot.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "enrollment_data", schema = "college", catalog = "")
public class EnrollmentDataEntity
{
    @Basic
    @Column(name = "student_id")
    private int studentId;
    @Basic
    @Column(name = "course_id")
    private int courseId;

    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public int getCourseId()
    {
        return courseId;
    }

    public void setCourseId(int courseId)
    {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnrollmentDataEntity that = (EnrollmentDataEntity) o;
        return studentId == that.studentId && courseId == that.courseId;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(studentId, courseId);
    }
}
