<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Hibernate App</title>
    <style>
        .border-class {
            border: 1px solid black;
            border-collapse: collapse;
        }

        th {
            background-color: #1cdada;
        }

        td {
            background-color: #96D4D4;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>Course</th>
        <th>Instructor</th>
        <th>Student</th>
    </tr>
    <tr>
        <td>
            <form:form action="addCourse" method="get" modelAttribute="course">
                <table>
                    <tr>
                        <td><label>Name: </label></td>
                        <td><form:input path="name"/></td>
                    </tr>
                    <tr>
                        <td><label>Department:</label></td>
                        <td><form:input path="department"/></td>
                    </tr>
                    <tr>
                        <td><label>Code:</label></td>
                        <td><form:input path="code"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="submit"></td>
                    </tr>
                </table>

            </form:form>
        </td>
        <td>
            <form:form action="addInstructor" method="get" modelAttribute="instructor">
                <table>
                    <tr>
                        <td><label>Name: </label></td>
                        <td><form:input path="name"/></td>
                    </tr>
                    <tr>
                        <td><label>Email:</label></td>
                        <td><form:input path="email"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="submit"></td>
                    </tr>
                </table>
            </form:form>
        </td>
        <td>
            <form:form action="addStudent" method="get" modelAttribute="student">
                <table>
                    <tr>
                        <td><label>Name: </label></td>
                        <td><form:input path="name"/></td>
                    </tr>
                    <tr>
                        <td><label>Email:</label></td>
                        <td><form:input path="email"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="submit"></td>
                    </tr>
                </table>
            </form:form>
        </td>
    </tr>
</table>

<table>
    <tr>
        <th>id</th>
        <th>Name</th>
        <th>Email</th>
    </tr>

    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.name}</td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
