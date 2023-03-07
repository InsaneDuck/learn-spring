<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <title>Test</title>
    <style>
        .error {
            color: red
        }
    </style>
</head>
<body>
<form:form action="show" method="GET">
    <label>
        <h2>Enter String:</h2>
        <input type="text" name="string" placeholder="Enter a String">
    </label>
    <input type="submit">
</form:form>
<h2>Name : ${param.string}</h2>
<h2>Modified Name : ${message}</h2>

<h2>Student Form</h2>

<form:form action="setStudent" modelAttribute="student">
    First Name :
    <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br><br>
    Last Name :
    <form:input path="lastName"/>
    <br><br>
    GPA :
    <form:input path="gpa"/>
    <form:errors path="gpa" cssClass="error"/>
    <br><br>
    CourseCode :
    <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>
    <br><br>
    Country :
    <form:select path="country" items="${student.countryOptions}"/>
    <br><br>
    Pin Code :
    <form:input path="pinCode"/>
    <form:errors path="pinCode" cssClass="error"/>
    <br><br>
    Favorite Language :
    <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
    <br><br>
    Operating Systems :
    <form:checkboxes path="operatingSystems" items="${student.operatingSystemOptions}"/>
    <br><br>
    <input type="submit" value="Submit">
</form:form>
<h2>Name : ${student.firstName} ${student.lastName}</h2>
<h2>GPA : ${student.gpa}</h2>
<h2>Country : ${student.country}</h2>
<h2>Pin Code : ${student.pinCode}</h2>
<h2>Favorite Language : ${student.favoriteLanguage}</h2>
<h2>Operating Systems : ${student.operatingSystems}</h2>
</body>
</html>
