package dev.insaneduck.springboot.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "course_data", schema = "college", catalog = "")
public class CourseDataEntity
{
    @Basic
    @Column(name = "course_id")
    private int courseId;
    @Basic
    @Column(name = "instructor_id")
    private int instructorId;

    public int getCourseId()
    {
        return courseId;
    }

    public void setCourseId(int courseId)
    {
        this.courseId = courseId;
    }

    public int getInstructorId()
    {
        return instructorId;
    }

    public void setInstructorId(int instructorId)
    {
        this.instructorId = instructorId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseDataEntity that = (CourseDataEntity) o;
        return courseId == that.courseId && instructorId == that.instructorId;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(courseId, instructorId);
    }
}
